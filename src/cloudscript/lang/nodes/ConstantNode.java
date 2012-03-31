package cloudscript.lang.nodes;

import cloudscript.lang.*;

/**
  Get the value of a constant.
*/
public class ConstantNode extends Node {
  private String name;
  
  public ConstantNode(String name) {
    this.name = name;
  }
  
  public CloudScriptObject eval(Context context) throws CloudScriptException {
    return context.getCurrentClass().getConstant(name);
  }
}