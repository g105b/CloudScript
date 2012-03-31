package cloudscript.lang;

import java.util.HashMap;

/**
  Class in the runtime.
  Classes store methods and constants. Each object in the runtime has a class.
*/
public class CloudScriptClass extends CloudScriptObject {
  private String name;
  private CloudScriptClass superClass;
  private HashMap<String, Method> methods;
  HashMap<String, CloudScriptObject> constants;
  
  /**
    Creates a class inheriting from superClass.
  */
  public CloudScriptClass(String name, CloudScriptClass superClass) {
    super("Class");
    this.name = name;
    this.superClass = superClass;
    methods = new HashMap<String, Method>();
    constants = new HashMap<String, CloudScriptObject>();
  }
  
  /**
    Creates a class inheriting from Object.
  */
  public CloudScriptClass(String name) {
    this(name, CloudScriptRuntime.getObjectClass());
  }
  
  public String getName() {
    return name;
  }
  
  public CloudScriptClass getSuperClass() {
    return superClass;
  }
  
  public void setConstant(String name, CloudScriptObject value) {
    constants.put(name, value);
  }

  public CloudScriptObject getConstant(String name) {
    if (constants.containsKey(name)) return constants.get(name);
    if (superClass != null) return superClass.getConstant(name);
    return CloudScriptRuntime.getNil();
  }
  
  public boolean hasConstant(String name) {
    if (constants.containsKey(name)) return true;
    if (superClass != null) return superClass.hasConstant(name);
    return false;
  }
  
  public Method lookup(String name) throws MethodNotFound {
    if (methods.containsKey(name)) return methods.get(name);
    if (superClass != null) return superClass.lookup(name);
    throw new MethodNotFound(name);
  }

  public boolean hasMethod(String name) {
    if (methods.containsKey(name)) return true;
    if (superClass != null) return superClass.hasMethod(name);
    return false;
  }
  
  public void addMethod(String name, Method method) {
    methods.put(name, method);
  }
  
  /**
    Creates a new instance of the class.
  */
  public CloudScriptObject newInstance() {
    return new CloudScriptObject(this);
  }
  
  /**
    Creates a new instance of the class, storing the value inside a ValueObject.
  */
  public CloudScriptObject newInstance(Object value) {
    return new ValueObject(this, value);
  }
  
  /**
    Creates a new subclass of this class.
  */
  public CloudScriptClass newSubclass(String name) {
    CloudScriptClass klass = new CloudScriptClass(name, this);
    CloudScriptRuntime.getObjectClass().setConstant(name, klass);
    return klass;
  }
  
  /**
    Creates or returns a subclass if it already exists.
  */
  public CloudScriptClass subclass(String name) {
    CloudScriptClass objectClass = CloudScriptRuntime.getObjectClass();
    if (objectClass.hasConstant(name)) return (CloudScriptClass) objectClass.getConstant(name);
    return newSubclass(name);
  }
  
  /**
    Returns true if klass is a subclass of this class.
  */
  public boolean isSubclass(CloudScriptClass klass) {
    if (klass == this) return true;
    if (klass.getSuperClass() == null) return false;
    if (klass.getSuperClass() == this) return true;
    return isSubclass(klass.getSuperClass());
  }
  
  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if ( !(other instanceof CloudScriptClass) ) return false;
    return name == ((CloudScriptClass)other).getName();
  }
}
