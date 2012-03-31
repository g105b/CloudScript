package cloudscript.lang.nodes;

import cloudscript.lang.*;

public class InstanceVariableNode extends Node {
  private String name;
  
  public InstanceVariableNode(String name) {
    this.name = name;
  }
  
  public CloudScriptObject eval(Context context) throws CloudScriptException {
    return context.getCurrentSelf().getInstanceVariable(name);
  }
}