package cloudscript.lang;

import java.io.*;

/**
  Bootstrapper.run() is called to initialize the runtime.
  Core classes are created and methods are added.
*/
public class Bootstrapper {
  static public Context run() {
    // Create core classes
    CloudScriptClass objectClass = new CloudScriptClass("Object");
    CloudScriptRuntime.objectClass = objectClass;
    // Each method sent or added on the root context of a script are evaled on the main object.
    CloudScriptObject main = new CloudScriptObject();
    CloudScriptRuntime.mainObject = main;
    CloudScriptClass classClass = new CloudScriptClass("Class");
    objectClass.setCloudScriptClass(classClass); // Object is a class
    classClass.setCloudScriptClass(classClass); // Class is a class
    main.setCloudScriptClass(objectClass);
    
    // Register core classes into the root context
    objectClass.setConstant("Object", objectClass);
    objectClass.setConstant("Class", classClass);
    // There is just one instance of nil, true, false, so we store those in constants.
    CloudScriptRuntime.nilObject = objectClass.newSubclass("NilClass").newInstance(null);
    CloudScriptRuntime.trueObject = objectClass.newSubclass("TrueClass").newInstance(true);
    CloudScriptRuntime.falseObject = objectClass.newSubclass("FalseClass").newInstance(false);
    CloudScriptClass stringClass = objectClass.newSubclass("String");
    CloudScriptClass numberClass = objectClass.newSubclass("Number");
    CloudScriptClass integerClass = numberClass.newSubclass("Integer");
    CloudScriptClass floatClass = numberClass.newSubclass("Float");
    CloudScriptClass exceptionClass = objectClass.newSubclass("Exception");
    exceptionClass.newSubclass("IOException");
    exceptionClass.newSubclass("TypeError");
    exceptionClass.newSubclass("MethodNotFound");
    exceptionClass.newSubclass("ArgumentError");
    exceptionClass.newSubclass("FileNotFound");
    
    // Add methods to core classes.
    
    //// Object
    objectClass.addMethod("print", new Method() {
      public CloudScriptObject call(CloudScriptObject receiver, CloudScriptObject arguments[]) throws CloudScriptException {
        for (CloudScriptObject arg : arguments) System.out.println(arg.toJavaObject());
        return CloudScriptRuntime.getNil();
      }
    });
    objectClass.addMethod("class", new Method() {
      public CloudScriptObject call(CloudScriptObject receiver, CloudScriptObject arguments[]) throws CloudScriptException {
        return receiver.getCloudScriptClass();
      }
    });
    objectClass.addMethod("eval", new Method() {
      public CloudScriptObject call(CloudScriptObject receiver, CloudScriptObject arguments[]) throws CloudScriptException {
        Context context = new Context(receiver);
        String code = arguments[0].asString();
        return context.eval(code);
      }
    });
    objectClass.addMethod("require", new Method() {
      public CloudScriptObject call(CloudScriptObject receiver, CloudScriptObject arguments[]) throws CloudScriptException {
        Context context = new Context();
        String filename = arguments[0].asString();
        try {
          return context.eval(new FileReader(filename));
        } catch (FileNotFoundException e) {
          throw new CloudScriptException("FileNotFound", "File not found: " + filename);
        }
      }
    });
    
    //// Class
    classClass.addMethod("new", new Method() {
      public CloudScriptObject call(CloudScriptObject receiver, CloudScriptObject arguments[]) throws CloudScriptException {
        CloudScriptClass self = (CloudScriptClass) receiver;
        CloudScriptObject instance = self.newInstance();
        if (self.hasMethod("construct")) instance.call("construct", arguments);
        return instance;
      }
    });
    classClass.addMethod("name", new Method() {
      public CloudScriptObject call(CloudScriptObject receiver, CloudScriptObject arguments[]) throws CloudScriptException {
        CloudScriptClass self = (CloudScriptClass) receiver;
        return new ValueObject(self.getName());
      }
    });
    classClass.addMethod("superclass", new Method() {
      public CloudScriptObject call(CloudScriptObject receiver, CloudScriptObject arguments[]) throws CloudScriptException {
        CloudScriptClass self = (CloudScriptClass) receiver;
        return self.getSuperClass();
      }
    });

    //// Exception
    exceptionClass.addMethod("initialize", new Method() {
      public CloudScriptObject call(CloudScriptObject receiver, CloudScriptObject arguments[]) throws CloudScriptException {
        if (arguments.length == 1) receiver.setInstanceVariable("message", arguments[0]);
        return CloudScriptRuntime.getNil();
      }
    });
    exceptionClass.addMethod("message", new Method() {
      public CloudScriptObject call(CloudScriptObject receiver, CloudScriptObject arguments[]) throws CloudScriptException {
        return receiver.getInstanceVariable("message");
      }
    });
    objectClass.addMethod("raise!", new Method() {
      public CloudScriptObject call(CloudScriptObject receiver, CloudScriptObject arguments[]) throws CloudScriptException {
        String message = null;
        if (receiver.hasInstanceVariable("message")) message = receiver.getInstanceVariable("message").asString();
        throw new CloudScriptException(receiver.getCloudScriptClass(), message);
      }
    });
    
    //// Integer
    integerClass.addMethod("+", new OperatorMethod<Integer>() {
      public CloudScriptObject perform(Integer receiver, Integer argument) throws CloudScriptException {
        return new ValueObject(receiver + argument);
      }
    });
    integerClass.addMethod("-", new OperatorMethod<Integer>() {
      public CloudScriptObject perform(Integer receiver, Integer argument) throws CloudScriptException {
        return new ValueObject(receiver + argument);
      }
    });
    integerClass.addMethod("*", new OperatorMethod<Integer>() {
      public CloudScriptObject perform(Integer receiver, Integer argument) throws CloudScriptException {
        return new ValueObject(receiver * argument);
      }
    });
    integerClass.addMethod("/", new OperatorMethod<Integer>() {
      public CloudScriptObject perform(Integer receiver, Integer argument) throws CloudScriptException {
        return new ValueObject(receiver / argument);
      }
    });
    integerClass.addMethod("<", new OperatorMethod<Integer>() {
      public CloudScriptObject perform(Integer receiver, Integer argument) throws CloudScriptException {
        return CloudScriptRuntime.toBoolean(receiver < argument);
      }
    });
    integerClass.addMethod(">", new OperatorMethod<Integer>() {
      public CloudScriptObject perform(Integer receiver, Integer argument) throws CloudScriptException {
        return CloudScriptRuntime.toBoolean(receiver > argument);
      }
    });
    integerClass.addMethod("<=", new OperatorMethod<Integer>() {
      public CloudScriptObject perform(Integer receiver, Integer argument) throws CloudScriptException {
        return CloudScriptRuntime.toBoolean(receiver <= argument);
      }
    });
    integerClass.addMethod(">=", new OperatorMethod<Integer>() {
      public CloudScriptObject perform(Integer receiver, Integer argument) throws CloudScriptException {
        return CloudScriptRuntime.toBoolean(receiver >= argument);
      }
    });
    integerClass.addMethod("==", new OperatorMethod<Integer>() {
      public CloudScriptObject perform(Integer receiver, Integer argument) throws CloudScriptException {
        return CloudScriptRuntime.toBoolean(receiver == argument);
      }
    });
    
    //// String
    stringClass.addMethod("+", new OperatorMethod<String>() {
      public CloudScriptObject perform(String receiver, String argument) throws CloudScriptException {
        return new ValueObject(receiver + argument);
      }
    });
    stringClass.addMethod("size", new Method() {
      public CloudScriptObject call(CloudScriptObject receiver, CloudScriptObject arguments[]) throws CloudScriptException {
        String self = receiver.asString();
        return new ValueObject(self.length());
      }
    });
    stringClass.addMethod("substring", new Method() {
      public CloudScriptObject call(CloudScriptObject receiver, CloudScriptObject arguments[]) throws CloudScriptException {
        String self = receiver.asString();
        if (arguments.length == 0) throw new ArgumentError("substring", 1, 0);
        int start = arguments[0].asInteger();
        int end = self.length();
        if (arguments.length > 1) end = arguments[1].asInteger();
        return new ValueObject(self.substring(start, end));
      }
    });
    
    // Return the root context on which everything will be evaled. By default, everything is evaled on the
    // main object.
    return new Context(main);
  }
}
