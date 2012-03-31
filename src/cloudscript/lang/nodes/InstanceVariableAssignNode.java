package cloudscript.lang.nodes;

import cloudscript.lang.*;

public class InstanceVariableAssignNode extends Node {
  private String name;
  private Node expression;
  
  public InstanceVariableAssignNode(String name, Node expression) {
    this.name = name;
    this.expression = expression;
  }
  
  public CloudScriptObject eval(Context context) throws CloudScriptException {
    CloudScriptObject value = expression.eval(context);
    context.getCurrentSelf().setInstanceVariable(name, value);
    return value;
  }
}