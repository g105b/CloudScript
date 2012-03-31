package cloudscript.lang.nodes;

import cloudscript.lang.*;

public class SelfNode extends Node {
  public CloudScriptObject eval(Context context) throws CloudScriptException {
    return context.getCurrentSelf();
  }
}