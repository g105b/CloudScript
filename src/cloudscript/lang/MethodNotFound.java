package cloudscript.lang;

/**
  Exception thrown when a unknown method is called.
*/
public class MethodNotFound extends CloudScriptException {
  public MethodNotFound(String method) {
    super(method + " not found");
    setRuntimeClass("MethodNotFound");
  }
}