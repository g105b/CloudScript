package cloudscript.lang;

/**
  Exception thrown when a unknown method is called.
*/
public class ArgumentError extends CloudScriptException {
  public ArgumentError(String method, int expected, int actual) {
    super("Expected " + expected + " arguments for " + method + ", got " + actual);
    setRuntimeClass("ArgumentError");
  }
}