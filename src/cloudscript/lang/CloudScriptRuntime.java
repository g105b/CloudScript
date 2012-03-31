package cloudscript.lang;

/**
  Language runtime. Mostly helper methods for retrieving global values.
*/
public class CloudScriptRuntime {
  static CloudScriptClass objectClass;
  static CloudScriptObject mainObject;
  static CloudScriptObject nilObject;
  static CloudScriptObject trueObject;
  static CloudScriptObject falseObject;
  
  public static CloudScriptClass getObjectClass() {
    return objectClass;
  }

  public static CloudScriptObject getMainObject() {
    return mainObject;
  }

  public static CloudScriptClass getRootClass(String name) {
    // objectClass is null when boostrapping
    return objectClass == null ? null : (CloudScriptClass) objectClass.getConstant(name);
  }

  public static CloudScriptClass getExceptionClass() {
    return getRootClass("Exception");
  }
  
  public static CloudScriptObject getNil() {
    return nilObject;
  }
  
  public static CloudScriptObject getTrue() {
    return trueObject;
  }

  public static CloudScriptObject getFalse() {
    return falseObject;
  }
  
  public static CloudScriptObject toBoolean(boolean value) {
    return value ? CloudScriptRuntime.getTrue() : CloudScriptRuntime.getFalse();
  }
}
