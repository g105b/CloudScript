package cloudscript.lang.nodes;

import cloudscript.lang.*;

public class ConstantAssignNode extends Node {
  private String name;
  private Node expression;
  
  public ConstantAssignNode(String name, Node expression) {
    this.name = name;
    this.expression = expression;
  }
  
  public CloudScriptObject eval(Context context) throws CloudScriptException {
    CloudScriptObject value = expression.eval(context);
    context.getCurrentClass().setConstant(name, value);
    return value;
  }
}