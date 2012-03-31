package cloudscript.lang;

/**
  Exception that can be catched from inside the runtime.
*/
public class CloudScriptException extends Exception {
  private CloudScriptClass runtimeClass;
  
  /**
    Creates a new exception from a runtime class.
    @param runtimeClass Class of the exception from whitin the language.
  */
  public CloudScriptException(CloudScriptClass runtimeClass, String message) {
    super(message);
    this.runtimeClass = runtimeClass;
  }

  public CloudScriptException(CloudScriptClass runtimeClass) {
    super();
    this.runtimeClass = runtimeClass;
  }
  
  public CloudScriptException(String runtimeClassName, String message) {
    super(message);
    setRuntimeClass(runtimeClassName);
  }
  
  /**
    Creates a new exception from the Exception runtime class.
  */
  public CloudScriptException(String message) {
    super(message);
    this.runtimeClass = CloudScriptRuntime.getExceptionClass();
  }
  
  /**
    Wrap an exception to pass it to the runtime.
  */
  public CloudScriptException(Exception inner) {
    super(inner);
    setRuntimeClass(inner.getClass().getName());
  }
  
  /**
    Returns the runtime instance (the exception inside the language) of this exception.
  */
  public CloudScriptObject getRuntimeObject() {
    CloudScriptObject instance = runtimeClass.newInstance(this);
    instance.setInstanceVariable("message", new ValueObject(getMessage()));
    return instance;
  }

  public CloudScriptClass getRuntimeClass() {
    return runtimeClass;
  }

  protected void setRuntimeClass(String name) {
    runtimeClass = CloudScriptRuntime.getExceptionClass().subclass(name);
  }
}