package cloudscript.lang;

import cloudscript.lang.nodes.Node;

/**
  Anything that can be evaluated inside a context must implement this interface.
*/
public interface Evaluable {
  CloudScriptObject eval(Context context) throws CloudScriptException;
}
