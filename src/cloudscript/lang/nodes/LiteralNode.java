package cloudscript.lang.nodes;

import cloudscript.lang.*;

public class LiteralNode extends Node {
  CloudScriptObject value;
  
  public LiteralNode(CloudScriptObject value) {
    this.value = value;
  }
  
  public CloudScriptObject eval(Context context) throws CloudScriptException {
    return value;
  }
}