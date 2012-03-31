package cloudscript.lang;

/**
  Specialized method of operators (+, -, *, /, etc.)
*/
public abstract class OperatorMethod<T> extends Method {
  @SuppressWarnings("unchecked")
  public CloudScriptObject call(CloudScriptObject receiver, CloudScriptObject arguments[]) throws CloudScriptException {
    T self = (T) receiver.as(ValueObject.class).getValue();
    T arg = (T) arguments[0].as(ValueObject.class).getValue();
    return perform(self, arg);
  }
  
  public abstract CloudScriptObject perform(T receiver, T argument) throws CloudScriptException;
}
