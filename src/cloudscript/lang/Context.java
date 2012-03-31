package cloudscript.lang;

import java.util.HashMap;
import java.util.ArrayList;

import java.io.Reader;
import java.io.StringReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import cloudscript.lang.nodes.Node;


/**
  Evaluation context. Determines how a node will be evaluated.
  A context tracks local variables, self, and the current class under which
  methods and constants will be added.
  
  There are three different types of context:
  1) In the root of the script, self = main object, class = Object
  2) Inside a method body, self = instance of the class, class = method class
  3) Inside a class definition self = the class, class = the class
*/
public class Context {
  private CloudScriptObject currentSelf;
  private CloudScriptClass currentClass;
  private HashMap<String, CloudScriptObject> locals;
  // A context can share local variables with a parent. For example, in the
  // try block.
  private Context parent;
  
  public Context(CloudScriptObject currentSelf, CloudScriptClass currentClass, Context parent) {
    this.currentSelf = currentSelf;
    this.currentClass = currentClass;
    this.parent = parent;
    if (parent == null) {
      locals = new HashMap<String, CloudScriptObject>();
    } else {
      locals = parent.locals;
    }
  }
  
  public Context(CloudScriptObject currentSelf, CloudScriptClass currentClass) {
    this(currentSelf, currentClass, null);
  }
  
  public Context(CloudScriptObject currentSelf) {
    this(currentSelf, currentSelf.getCloudScriptClass());
  }
  
  public Context() {
    this(CloudScriptRuntime.getMainObject());
  }
  
  public CloudScriptObject getCurrentSelf() {
    return currentSelf;
  }

  public CloudScriptClass getCurrentClass() {
    return currentClass;
  }
  
  public CloudScriptObject getLocal(String name) {
    return locals.get(name);
  }
    
  public boolean hasLocal(String name) {
    return locals.containsKey(name);
  }
    
  public void setLocal(String name, CloudScriptObject value) {
    locals.put(name, value);
  }
  
  /**
    Creates a context that will share the same attributes (locals, self, class)
    as the current one.
  */
  public Context makeChildContext() {
    return new Context(currentSelf, currentClass, this);
  }
  
  /**
    Parse and evaluate the content red from the reader (eg.: FileReader, StringReader).
  */
  public CloudScriptObject eval(Reader reader) throws CloudScriptException {
    try {
      CloudScriptLexer lexer = new CloudScriptLexer(new ANTLRReaderStream(reader));
      CloudScriptParser parser = new CloudScriptParser(new CommonTokenStream(lexer));
      Node node = parser.parse();
      if (node == null) return CloudScriptRuntime.getNil();
      return node.eval(this);
    } catch (CloudScriptException e) {
      throw e;
    } catch (Exception e) {
      throw new CloudScriptException(e);
    }
  }
  
  public CloudScriptObject eval(String code) throws CloudScriptException {
    return eval(new StringReader(code));
  }
}
