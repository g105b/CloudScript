package cloudscript.lang.nodes;

import cloudscript.lang.*;
import java.util.ArrayList;

/**
  Collection of nodes.
*/
public class Nodes extends Node {
  private ArrayList<Node> nodes;
  
  public Nodes() {
    nodes = new ArrayList<Node>();
  }
  
  public void add(Node n) {
    nodes.add(n);
  }
  
  /**
    Eval all the nodes and return the last returned value.
  */
  public CloudScriptObject eval(Context context) throws CloudScriptException {
    CloudScriptObject lastEval = CloudScriptRuntime.getNil();
    for (Node n : nodes) {
      lastEval = n.eval(context);
    }
    return lastEval;
  }
}