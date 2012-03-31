package cloudscript.lang.nodes;

import cloudscript.lang.*;

/**
  Negate a value.
*/
public class NotNode extends Node {
  private Node receiver;
  
  /**
    !receiver
  */
  public NotNode(Node receiver) {
    this.receiver = receiver;
  }
  
  public CloudScriptObject eval(Context context) throws CloudScriptException {
    if (receiver.eval(context).isTrue())
      return CloudScriptRuntime.getFalse();
    return CloudScriptRuntime.getTrue();
  }
}