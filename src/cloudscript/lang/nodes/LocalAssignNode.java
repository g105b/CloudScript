package cloudscript.lang.nodes;

import cloudscript.lang.*;

public class LocalAssignNode extends Node {
  private String name;
  private Node expression;
  
  public LocalAssignNode(String name, Node expression) {
    this.name = name;
    this.expression = expression;
  }
  
  public CloudScriptObject eval(Context context) throws CloudScriptException {
    CloudScriptObject value = expression.eval(context);
    context.setLocal(name, value);
    return value;
  }
}