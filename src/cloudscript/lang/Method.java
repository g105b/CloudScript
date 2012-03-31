package cloudscript.lang;

/**
  A method attached to a CloudScriptClass.
*/
public abstract class Method {
  /**
    Calls the method.
    @param receiver  Instance on which to call the method (self).
    @param arguments Arguments passed to the method.
  */
  public abstract CloudScriptObject call(CloudScriptObject receiver, CloudScriptObject arguments[]) throws CloudScriptException;
}
