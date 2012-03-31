package cloudscript.lang;

import java.util.HashMap;

/**
  Any object, instance of a class, inside the runtime.
  Objects store a class and instance variables.
*/
public class CloudScriptObject {
  private CloudScriptClass yourLangClass;
  private HashMap<String, CloudScriptObject> instanceVariables;
  
  /**
    Creates an instance of class yourLangClass.
  */
  public CloudScriptObject(CloudScriptClass yourLangClass) {
    this.yourLangClass = yourLangClass;
    this.instanceVariables = new HashMap<String, CloudScriptObject>();
  }
  
  public CloudScriptObject(String className) {
    this(CloudScriptRuntime.getRootClass(className));
  }
  
  public CloudScriptObject() {
    this(CloudScriptRuntime.getObjectClass());
  }
  
  public CloudScriptClass getCloudScriptClass() {
    return yourLangClass;
  }
  
  public void setCloudScriptClass(CloudScriptClass klass) {
    yourLangClass = klass;
  }
  
  public CloudScriptObject getInstanceVariable(String name) {
    if (hasInstanceVariable(name))
      return instanceVariables.get(name);
    return CloudScriptRuntime.getNil();
  }

  public boolean hasInstanceVariable(String name) {
    return instanceVariables.containsKey(name);
  }
  
  public void setInstanceVariable(String name, CloudScriptObject value) {
    instanceVariables.put(name, value);
  }
  
  /**
    Call a method on the object.
  */
  public CloudScriptObject call(String method, CloudScriptObject arguments[]) throws CloudScriptException {
    return yourLangClass.lookup(method).call(this, arguments);
  }

  public CloudScriptObject call(String method) throws CloudScriptException {
    return call(method, new CloudScriptObject[0]);
  }
  
  /**
    Only false and nil are not true.
  */
  public boolean isTrue() {
    return !isFalse();
  }
  
  /**
    Only false and nil are false. This is overridden in ValueObject.
  */
  public boolean isFalse() {
    return false;
  }

  /**
    Only nil is nil. This is overridden in ValueObject.
  */
  public boolean isNil() {
    return false;
  }
  
  /**
    Convert to a Java object. This is overridden in ValueObject.
  */
  public Object toJavaObject() {
    return this;
  }
  
  public <T> T as(Class<T> clazz) throws TypeError {
    if (clazz.isInstance(this)){
      return clazz.cast(this);
    }
    throw new TypeError(clazz.getName(), this);
  }
  
  public String asString() throws TypeError {
    return as(ValueObject.class).getValueAs(String.class);
  }

  public Integer asInteger() throws TypeError {
    return as(ValueObject.class).getValueAs(Integer.class);
  }

  public Float asFloat() throws TypeError {
    return as(ValueObject.class).getValueAs(Float.class);
  }
}
