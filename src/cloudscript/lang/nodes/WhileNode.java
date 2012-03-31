package cloudscript.lang.nodes;

import cloudscript.lang.*;

public class WhileNode extends Node {
  private Node condition;
  private Node body;
  
  public WhileNode(Node condition, Node body) {
    this.condition = condition;
    this.body = body;
  }
  
  public CloudScriptObject eval(Context context) throws CloudScriptException {
    while (condition.eval(context).isTrue()) {
      body.eval(context);
    }
    return CloudScriptRuntime.getNil();
  }
}