// $ANTLR 3.1.1 CloudScriptParser.g 2012-03-31 15:34:09

  package cloudscript.lang;
  
  import cloudscript.lang.nodes.*;
  import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class CloudScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLASS", "FN", "IF", "ELSE", "WHILE", "END", "SELF", "NIL", "TRUE", "FALSE", "INTEGER", "FLOAT", "DIGIT", "NUMBER", "STRING", "LOWER", "ID_CHAR", "NAME", "UPPER", "CONSTANT", "SEMICOLON", "COLON", "DOT", "COMMA", "OPEN_PARENT", "CLOSE_PARENT", "AT", "EQ", "LE", "GE", "LT", "GT", "PLUS", "MINUS", "MUL", "DIV", "MOD", "AND", "OR", "NOT", "ASSIGN", "NEWLINE", "COMMENT", "SPACE", "WHITESPACE", "LETTER"
    };
    public static final int CLASS=4;
    public static final int LT=34;
    public static final int WHILE=8;
    public static final int MOD=40;
    public static final int LETTER=49;
    public static final int ID_CHAR=20;
    public static final int FLOAT=15;
    public static final int NOT=43;
    public static final int AND=41;
    public static final int SPACE=47;
    public static final int EOF=-1;
    public static final int IF=6;
    public static final int AT=30;
    public static final int NAME=21;
    public static final int COMMA=27;
    public static final int PLUS=36;
    public static final int DIGIT=16;
    public static final int EQ=31;
    public static final int COMMENT=46;
    public static final int DOT=26;
    public static final int INTEGER=14;
    public static final int GE=33;
    public static final int ELSE=7;
    public static final int NUMBER=17;
    public static final int WHITESPACE=48;
    public static final int SEMICOLON=24;
    public static final int FN=5;
    public static final int MINUS=37;
    public static final int TRUE=12;
    public static final int MUL=38;
    public static final int COLON=25;
    public static final int NEWLINE=45;
    public static final int NIL=11;
    public static final int OPEN_PARENT=28;
    public static final int CLOSE_PARENT=29;
    public static final int OR=42;
    public static final int ASSIGN=44;
    public static final int CONSTANT=23;
    public static final int GT=35;
    public static final int LOWER=19;
    public static final int DIV=39;
    public static final int END=9;
    public static final int FALSE=13;
    public static final int SELF=10;
    public static final int LE=32;
    public static final int UPPER=22;
    public static final int STRING=18;

    // delegates
    // delegators


        public CloudScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CloudScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CloudScriptParser.tokenNames; }
    public String getGrammarFileName() { return "CloudScriptParser.g"; }


      /**
        Run the parsing process and return the root node of the AST.
      */
      public Node parse() throws RecognitionException {
        root_return result = root();
        if (result == null) return null;
        return result.nodes;
      }
      
      // Override to throw exceptions on parse error.
      @Override
      public void reportError(RecognitionException e) {
        throw new RuntimeException(e);
      }


    public static class root_return extends ParserRuleReturnScope {
        public Nodes nodes;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "root"
    // CloudScriptParser.g:55:1: root returns [Nodes nodes] : ( terminator )? ( expressions )? EOF ;
    public final CloudScriptParser.root_return root() throws RecognitionException {
        CloudScriptParser.root_return retval = new CloudScriptParser.root_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF3=null;
        CloudScriptParser.terminator_return terminator1 = null;

        CloudScriptParser.expressions_return expressions2 = null;


        Object EOF3_tree=null;

        try {
            // CloudScriptParser.g:55:27: ( ( terminator )? ( expressions )? EOF )
            // CloudScriptParser.g:56:5: ( terminator )? ( expressions )? EOF
            {
            root_0 = (Object)adaptor.nil();

            // CloudScriptParser.g:56:5: ( terminator )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SEMICOLON||LA1_0==NEWLINE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // CloudScriptParser.g:0:0: terminator
                    {
                    pushFollow(FOLLOW_terminator_in_root77);
                    terminator1=terminator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator1.getTree());

                    }
                    break;

            }

            // CloudScriptParser.g:56:17: ( expressions )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=CLASS && LA2_0<=IF)||LA2_0==WHILE||(LA2_0>=SELF && LA2_0<=FLOAT)||LA2_0==STRING||LA2_0==NAME||LA2_0==CONSTANT||LA2_0==OPEN_PARENT||LA2_0==AT||LA2_0==NOT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // CloudScriptParser.g:0:0: expressions
                    {
                    pushFollow(FOLLOW_expressions_in_root80);
                    expressions2=expressions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressions2.getTree());

                    }
                    break;

            }

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_root83); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.nodes = (expressions2!=null?expressions2.nodes:null); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "root"

    public static class expressions_return extends ParserRuleReturnScope {
        public Nodes nodes;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressions"
    // CloudScriptParser.g:60:1: expressions returns [Nodes nodes] : head= expression ( terminator tail= expression )* ( terminator )? ;
    public final CloudScriptParser.expressions_return expressions() throws RecognitionException {
        CloudScriptParser.expressions_return retval = new CloudScriptParser.expressions_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CloudScriptParser.expression_return head = null;

        CloudScriptParser.expression_return tail = null;

        CloudScriptParser.terminator_return terminator4 = null;

        CloudScriptParser.terminator_return terminator5 = null;



        try {
            // CloudScriptParser.g:60:34: (head= expression ( terminator tail= expression )* ( terminator )? )
            // CloudScriptParser.g:61:23: head= expression ( terminator tail= expression )* ( terminator )?
            {
            root_0 = (Object)adaptor.nil();

            if ( state.backtracking==0 ) {
               retval.nodes = new Nodes(); 
            }
            pushFollow(FOLLOW_expression_in_expressions131);
            head=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, head.getTree());
            if ( state.backtracking==0 ) {
               retval.nodes.add((head!=null?head.node:null)); 
            }
            // CloudScriptParser.g:63:5: ( terminator tail= expression )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // CloudScriptParser.g:63:6: terminator tail= expression
            	    {
            	    pushFollow(FOLLOW_terminator_in_expressions142);
            	    terminator4=terminator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator4.getTree());
            	    pushFollow(FOLLOW_expression_in_expressions151);
            	    tail=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, tail.getTree());
            	    if ( state.backtracking==0 ) {
            	       retval.nodes.add((tail!=null?tail.node:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // CloudScriptParser.g:66:5: ( terminator )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SEMICOLON||LA4_0==NEWLINE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // CloudScriptParser.g:0:0: terminator
                    {
                    pushFollow(FOLLOW_terminator_in_expressions167);
                    terminator5=terminator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator5.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressions"

    public static class expression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // CloudScriptParser.g:70:1: expression returns [Node node] : assignExpression ;
    public final CloudScriptParser.expression_return expression() throws RecognitionException {
        CloudScriptParser.expression_return retval = new CloudScriptParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CloudScriptParser.assignExpression_return assignExpression6 = null;



        try {
            // CloudScriptParser.g:70:31: ( assignExpression )
            // CloudScriptParser.g:71:5: assignExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignExpression_in_expression187);
            assignExpression6=assignExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpression6.getTree());
            if ( state.backtracking==0 ) {
               retval.node = (assignExpression6!=null?assignExpression6.node:null); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class terminator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "terminator"
    // CloudScriptParser.g:75:1: terminator : ( NEWLINE | SEMICOLON )+ ;
    public final CloudScriptParser.terminator_return terminator() throws RecognitionException {
        CloudScriptParser.terminator_return retval = new CloudScriptParser.terminator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set7=null;

        Object set7_tree=null;

        try {
            // CloudScriptParser.g:75:11: ( ( NEWLINE | SEMICOLON )+ )
            // CloudScriptParser.g:75:13: ( NEWLINE | SEMICOLON )+
            {
            root_0 = (Object)adaptor.nil();

            // CloudScriptParser.g:75:13: ( NEWLINE | SEMICOLON )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==SEMICOLON||LA5_0==NEWLINE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // CloudScriptParser.g:
            	    {
            	    set7=(Token)input.LT(1);
            	    if ( input.LA(1)==SEMICOLON||input.LA(1)==NEWLINE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set7));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "terminator"

    public static class assignExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpression"
    // CloudScriptParser.g:81:1: assignExpression returns [Node node] : ( assign | e= orExpression );
    public final CloudScriptParser.assignExpression_return assignExpression() throws RecognitionException {
        CloudScriptParser.assignExpression_return retval = new CloudScriptParser.assignExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CloudScriptParser.orExpression_return e = null;

        CloudScriptParser.assign_return assign8 = null;



        try {
            // CloudScriptParser.g:81:37: ( assign | e= orExpression )
            int alt6=2;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==ASSIGN) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF||LA6_1==ELSE||LA6_1==END||LA6_1==SEMICOLON||(LA6_1>=DOT && LA6_1<=CLOSE_PARENT)||(LA6_1>=EQ && LA6_1<=OR)||LA6_1==NEWLINE) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case CONSTANT:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==ASSIGN) ) {
                    alt6=1;
                }
                else if ( (LA6_2==EOF||LA6_2==ELSE||LA6_2==END||LA6_2==SEMICOLON||(LA6_2>=DOT && LA6_2<=COMMA)||LA6_2==CLOSE_PARENT||(LA6_2>=EQ && LA6_2<=OR)||LA6_2==NEWLINE) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case AT:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==NAME) ) {
                    int LA6_6 = input.LA(3);

                    if ( (LA6_6==ASSIGN) ) {
                        alt6=1;
                    }
                    else if ( (LA6_6==EOF||LA6_6==ELSE||LA6_6==END||LA6_6==SEMICOLON||(LA6_6>=DOT && LA6_6<=COMMA)||LA6_6==CLOSE_PARENT||(LA6_6>=EQ && LA6_6<=OR)||LA6_6==NEWLINE) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case CLASS:
            case FN:
            case IF:
            case WHILE:
            case SELF:
            case NIL:
            case TRUE:
            case FALSE:
            case INTEGER:
            case FLOAT:
            case STRING:
            case OPEN_PARENT:
            case NOT:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // CloudScriptParser.g:82:5: assign
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assign_in_assignExpression231);
                    assign8=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign8.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (assign8!=null?assign8.node:null); 
                    }

                    }
                    break;
                case 2 :
                    // CloudScriptParser.g:83:5: e= orExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_orExpression_in_assignExpression256);
                    e=orExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (e!=null?e.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignExpression"

    public static class orExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orExpression"
    // CloudScriptParser.g:86:1: orExpression returns [Node node] : (receiver= andExpression OR arg= orExpression | e= andExpression );
    public final CloudScriptParser.orExpression_return orExpression() throws RecognitionException {
        CloudScriptParser.orExpression_return retval = new CloudScriptParser.orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR9=null;
        CloudScriptParser.andExpression_return receiver = null;

        CloudScriptParser.orExpression_return arg = null;

        CloudScriptParser.andExpression_return e = null;


        Object OR9_tree=null;

        try {
            // CloudScriptParser.g:86:33: (receiver= andExpression OR arg= orExpression | e= andExpression )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // CloudScriptParser.g:87:5: receiver= andExpression OR arg= orExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_andExpression_in_orExpression285);
                    receiver=andExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, receiver.getTree());
                    OR9=(Token)match(input,OR,FOLLOW_OR_in_orExpression293); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR9_tree = (Object)adaptor.create(OR9);
                    adaptor.addChild(root_0, OR9_tree);
                    }
                    pushFollow(FOLLOW_orExpression_in_orExpression297);
                    arg=orExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arg.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new OrNode((receiver!=null?receiver.node:null), (arg!=null?arg.node:null)); 
                    }

                    }
                    break;
                case 2 :
                    // CloudScriptParser.g:89:5: e= andExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_andExpression_in_orExpression313);
                    e=andExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (e!=null?e.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orExpression"

    public static class andExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExpression"
    // CloudScriptParser.g:92:1: andExpression returns [Node node] : (receiver= relationalExpression AND arg= andExpression | e= relationalExpression );
    public final CloudScriptParser.andExpression_return andExpression() throws RecognitionException {
        CloudScriptParser.andExpression_return retval = new CloudScriptParser.andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND10=null;
        CloudScriptParser.relationalExpression_return receiver = null;

        CloudScriptParser.andExpression_return arg = null;

        CloudScriptParser.relationalExpression_return e = null;


        Object AND10_tree=null;

        try {
            // CloudScriptParser.g:92:34: (receiver= relationalExpression AND arg= andExpression | e= relationalExpression )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // CloudScriptParser.g:93:5: receiver= relationalExpression AND arg= andExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relationalExpression_in_andExpression347);
                    receiver=relationalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, receiver.getTree());
                    AND10=(Token)match(input,AND,FOLLOW_AND_in_andExpression355); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND10_tree = (Object)adaptor.create(AND10);
                    adaptor.addChild(root_0, AND10_tree);
                    }
                    pushFollow(FOLLOW_andExpression_in_andExpression359);
                    arg=andExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arg.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new AndNode((receiver!=null?receiver.node:null), (arg!=null?arg.node:null)); 
                    }

                    }
                    break;
                case 2 :
                    // CloudScriptParser.g:95:5: e= relationalExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relationalExpression_in_andExpression373);
                    e=relationalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (e!=null?e.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "andExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // CloudScriptParser.g:98:1: relationalExpression returns [Node node] : (receiver= additiveExpression op= ( EQ | LE | GE | LT | GT ) arg= relationalExpression | e= additiveExpression );
    public final CloudScriptParser.relationalExpression_return relationalExpression() throws RecognitionException {
        CloudScriptParser.relationalExpression_return retval = new CloudScriptParser.relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        CloudScriptParser.additiveExpression_return receiver = null;

        CloudScriptParser.relationalExpression_return arg = null;

        CloudScriptParser.additiveExpression_return e = null;


        Object op_tree=null;

        try {
            // CloudScriptParser.g:98:41: (receiver= additiveExpression op= ( EQ | LE | GE | LT | GT ) arg= relationalExpression | e= additiveExpression )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // CloudScriptParser.g:99:5: receiver= additiveExpression op= ( EQ | LE | GE | LT | GT ) arg= relationalExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_additiveExpression_in_relationalExpression400);
                    receiver=additiveExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, receiver.getTree());
                    op=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQ && input.LA(1)<=GT) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(op));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_relationalExpression_in_relationalExpression430);
                    arg=relationalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arg.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((op!=null?op.getText():null), (receiver!=null?receiver.node:null), (arg!=null?arg.node:null)); 
                    }

                    }
                    break;
                case 2 :
                    // CloudScriptParser.g:102:5: e= additiveExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_additiveExpression_in_relationalExpression441);
                    e=additiveExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (e!=null?e.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // CloudScriptParser.g:105:1: additiveExpression returns [Node node] : (receiver= multiplicativeExpression op= ( PLUS | MINUS ) arg= additiveExpression | e= multiplicativeExpression );
    public final CloudScriptParser.additiveExpression_return additiveExpression() throws RecognitionException {
        CloudScriptParser.additiveExpression_return retval = new CloudScriptParser.additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        CloudScriptParser.multiplicativeExpression_return receiver = null;

        CloudScriptParser.additiveExpression_return arg = null;

        CloudScriptParser.multiplicativeExpression_return e = null;


        Object op_tree=null;

        try {
            // CloudScriptParser.g:105:39: (receiver= multiplicativeExpression op= ( PLUS | MINUS ) arg= additiveExpression | e= multiplicativeExpression )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // CloudScriptParser.g:106:5: receiver= multiplicativeExpression op= ( PLUS | MINUS ) arg= additiveExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression470);
                    receiver=multiplicativeExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, receiver.getTree());
                    op=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(op));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_additiveExpression_in_additiveExpression488);
                    arg=additiveExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arg.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((op!=null?op.getText():null), (receiver!=null?receiver.node:null), (arg!=null?arg.node:null)); 
                    }

                    }
                    break;
                case 2 :
                    // CloudScriptParser.g:108:5: e= multiplicativeExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression499);
                    e=multiplicativeExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (e!=null?e.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // CloudScriptParser.g:111:1: multiplicativeExpression returns [Node node] : (receiver= unaryExpression op= ( MUL | DIV | MOD ) arg= multiplicativeExpression | e= unaryExpression );
    public final CloudScriptParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        CloudScriptParser.multiplicativeExpression_return retval = new CloudScriptParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        CloudScriptParser.unaryExpression_return receiver = null;

        CloudScriptParser.multiplicativeExpression_return arg = null;

        CloudScriptParser.unaryExpression_return e = null;


        Object op_tree=null;

        try {
            // CloudScriptParser.g:111:45: (receiver= unaryExpression op= ( MUL | DIV | MOD ) arg= multiplicativeExpression | e= unaryExpression )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // CloudScriptParser.g:112:5: receiver= unaryExpression op= ( MUL | DIV | MOD ) arg= multiplicativeExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression536);
                    receiver=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, receiver.getTree());
                    op=(Token)input.LT(1);
                    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(op));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_multiplicativeExpression_in_multiplicativeExpression556);
                    arg=multiplicativeExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arg.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((op!=null?op.getText():null), (receiver!=null?receiver.node:null), (arg!=null?arg.node:null)); 
                    }

                    }
                    break;
                case 2 :
                    // CloudScriptParser.g:114:5: e= unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression567);
                    e=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (e!=null?e.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // CloudScriptParser.g:117:1: unaryExpression returns [Node node] : ( NOT receiver= unaryExpression | e= primaryExpression );
    public final CloudScriptParser.unaryExpression_return unaryExpression() throws RecognitionException {
        CloudScriptParser.unaryExpression_return retval = new CloudScriptParser.unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT11=null;
        CloudScriptParser.unaryExpression_return receiver = null;

        CloudScriptParser.primaryExpression_return e = null;


        Object NOT11_tree=null;

        try {
            // CloudScriptParser.g:117:36: ( NOT receiver= unaryExpression | e= primaryExpression )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NOT) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=CLASS && LA12_0<=IF)||LA12_0==WHILE||(LA12_0>=SELF && LA12_0<=FLOAT)||LA12_0==STRING||LA12_0==NAME||LA12_0==CONSTANT||LA12_0==OPEN_PARENT||LA12_0==AT) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // CloudScriptParser.g:118:5: NOT receiver= unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT11=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpression618); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT11_tree = (Object)adaptor.create(NOT11);
                    adaptor.addChild(root_0, NOT11_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression622);
                    receiver=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, receiver.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new NotNode((receiver!=null?receiver.node:null)); 
                    }

                    }
                    break;
                case 2 :
                    // CloudScriptParser.g:119:5: e= primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression638);
                    e=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (e!=null?e.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpression"
    // CloudScriptParser.g:123:1: primaryExpression returns [Node node] : ( literal | call | methodDefinition | classDefinition | ifBlock | whileBlock | OPEN_PARENT expression CLOSE_PARENT );
    public final CloudScriptParser.primaryExpression_return primaryExpression() throws RecognitionException {
        CloudScriptParser.primaryExpression_return retval = new CloudScriptParser.primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_PARENT18=null;
        Token CLOSE_PARENT20=null;
        CloudScriptParser.literal_return literal12 = null;

        CloudScriptParser.call_return call13 = null;

        CloudScriptParser.methodDefinition_return methodDefinition14 = null;

        CloudScriptParser.classDefinition_return classDefinition15 = null;

        CloudScriptParser.ifBlock_return ifBlock16 = null;

        CloudScriptParser.whileBlock_return whileBlock17 = null;

        CloudScriptParser.expression_return expression19 = null;


        Object OPEN_PARENT18_tree=null;
        Object CLOSE_PARENT20_tree=null;

        try {
            // CloudScriptParser.g:123:38: ( literal | call | methodDefinition | classDefinition | ifBlock | whileBlock | OPEN_PARENT expression CLOSE_PARENT )
            int alt13=7;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // CloudScriptParser.g:124:5: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression674);
                    literal12=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal12.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (literal12!=null?literal12.node:null); 
                    }

                    }
                    break;
                case 2 :
                    // CloudScriptParser.g:125:5: call
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_in_primaryExpression692);
                    call13=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call13.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (call13!=null?call13.node:null); 
                    }

                    }
                    break;
                case 3 :
                    // CloudScriptParser.g:126:5: methodDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_methodDefinition_in_primaryExpression713);
                    methodDefinition14=methodDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDefinition14.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (methodDefinition14!=null?methodDefinition14.node:null); 
                    }

                    }
                    break;
                case 4 :
                    // CloudScriptParser.g:127:5: classDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDefinition_in_primaryExpression722);
                    classDefinition15=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition15.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (classDefinition15!=null?classDefinition15.node:null); 
                    }

                    }
                    break;
                case 5 :
                    // CloudScriptParser.g:128:5: ifBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifBlock_in_primaryExpression732);
                    ifBlock16=ifBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifBlock16.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (ifBlock16!=null?ifBlock16.node:null); 
                    }

                    }
                    break;
                case 6 :
                    // CloudScriptParser.g:129:5: whileBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileBlock_in_primaryExpression750);
                    whileBlock17=whileBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileBlock17.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (whileBlock17!=null?whileBlock17.node:null); 
                    }

                    }
                    break;
                case 7 :
                    // CloudScriptParser.g:130:5: OPEN_PARENT expression CLOSE_PARENT
                    {
                    root_0 = (Object)adaptor.nil();

                    OPEN_PARENT18=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_primaryExpression765); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPEN_PARENT18_tree = (Object)adaptor.create(OPEN_PARENT18);
                    adaptor.addChild(root_0, OPEN_PARENT18_tree);
                    }
                    pushFollow(FOLLOW_expression_in_primaryExpression773);
                    expression19=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression19.getTree());
                    CLOSE_PARENT20=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_primaryExpression779); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSE_PARENT20_tree = (Object)adaptor.create(CLOSE_PARENT20);
                    adaptor.addChild(root_0, CLOSE_PARENT20_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = (expression19!=null?expression19.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class literal_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // CloudScriptParser.g:136:1: literal returns [Node node] : ( STRING | INTEGER | FLOAT | NIL | TRUE | FALSE | constant | instanceVariable | self );
    public final CloudScriptParser.literal_return literal() throws RecognitionException {
        CloudScriptParser.literal_return retval = new CloudScriptParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING21=null;
        Token INTEGER22=null;
        Token FLOAT23=null;
        Token NIL24=null;
        Token TRUE25=null;
        Token FALSE26=null;
        CloudScriptParser.constant_return constant27 = null;

        CloudScriptParser.instanceVariable_return instanceVariable28 = null;

        CloudScriptParser.self_return self29 = null;


        Object STRING21_tree=null;
        Object INTEGER22_tree=null;
        Object FLOAT23_tree=null;
        Object NIL24_tree=null;
        Object TRUE25_tree=null;
        Object FALSE26_tree=null;

        try {
            // CloudScriptParser.g:136:28: ( STRING | INTEGER | FLOAT | NIL | TRUE | FALSE | constant | instanceVariable | self )
            int alt14=9;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt14=1;
                }
                break;
            case INTEGER:
                {
                alt14=2;
                }
                break;
            case FLOAT:
                {
                alt14=3;
                }
                break;
            case NIL:
                {
                alt14=4;
                }
                break;
            case TRUE:
                {
                alt14=5;
                }
                break;
            case FALSE:
                {
                alt14=6;
                }
                break;
            case CONSTANT:
                {
                alt14=7;
                }
                break;
            case AT:
                {
                alt14=8;
                }
                break;
            case SELF:
                {
                alt14=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // CloudScriptParser.g:137:5: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING21=(Token)match(input,STRING,FOLLOW_STRING_in_literal805); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING21_tree = (Object)adaptor.create(STRING21);
                    adaptor.addChild(root_0, STRING21_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new LiteralNode(new ValueObject((STRING21!=null?STRING21.getText():null).substring(1, (STRING21!=null?STRING21.getText():null).length() - 1))); 
                    }

                    }
                    break;
                case 2 :
                    // CloudScriptParser.g:138:5: INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    INTEGER22=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_literal824); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER22_tree = (Object)adaptor.create(INTEGER22);
                    adaptor.addChild(root_0, INTEGER22_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new LiteralNode(new ValueObject(new Integer((INTEGER22!=null?INTEGER22.getText():null)))); 
                    }

                    }
                    break;
                case 3 :
                    // CloudScriptParser.g:139:5: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT23=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal842); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT23_tree = (Object)adaptor.create(FLOAT23);
                    adaptor.addChild(root_0, FLOAT23_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new LiteralNode(new ValueObject(new Float((FLOAT23!=null?FLOAT23.getText():null)))); 
                    }

                    }
                    break;
                case 4 :
                    // CloudScriptParser.g:140:5: NIL
                    {
                    root_0 = (Object)adaptor.nil();

                    NIL24=(Token)match(input,NIL,FOLLOW_NIL_in_literal862); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NIL24_tree = (Object)adaptor.create(NIL24);
                    adaptor.addChild(root_0, NIL24_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new LiteralNode(CloudScriptRuntime.getNil()); 
                    }

                    }
                    break;
                case 5 :
                    // CloudScriptParser.g:141:5: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE25=(Token)match(input,TRUE,FOLLOW_TRUE_in_literal884); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE25_tree = (Object)adaptor.create(TRUE25);
                    adaptor.addChild(root_0, TRUE25_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new LiteralNode(CloudScriptRuntime.getTrue()); 
                    }

                    }
                    break;
                case 6 :
                    // CloudScriptParser.g:142:5: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE26=(Token)match(input,FALSE,FOLLOW_FALSE_in_literal905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE26_tree = (Object)adaptor.create(FALSE26);
                    adaptor.addChild(root_0, FALSE26_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new LiteralNode(CloudScriptRuntime.getFalse()); 
                    }

                    }
                    break;
                case 7 :
                    // CloudScriptParser.g:143:5: constant
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_literal925);
                    constant27=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant27.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (constant27!=null?constant27.node:null); 
                    }

                    }
                    break;
                case 8 :
                    // CloudScriptParser.g:144:5: instanceVariable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_instanceVariable_in_literal942);
                    instanceVariable28=instanceVariable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceVariable28.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (instanceVariable28!=null?instanceVariable28.node:null); 
                    }

                    }
                    break;
                case 9 :
                    // CloudScriptParser.g:145:5: self
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_self_in_literal951);
                    self29=self();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, self29.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (self29!=null?self29.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class self_return extends ParserRuleReturnScope {
        public SelfNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "self"
    // CloudScriptParser.g:149:1: self returns [SelfNode node] : SELF ;
    public final CloudScriptParser.self_return self() throws RecognitionException {
        CloudScriptParser.self_return retval = new CloudScriptParser.self_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELF30=null;

        Object SELF30_tree=null;

        try {
            // CloudScriptParser.g:149:29: ( SELF )
            // CloudScriptParser.g:150:5: SELF
            {
            root_0 = (Object)adaptor.nil();

            SELF30=(Token)match(input,SELF,FOLLOW_SELF_in_self985); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SELF30_tree = (Object)adaptor.create(SELF30);
            adaptor.addChild(root_0, SELF30_tree);
            }
            if ( state.backtracking==0 ) {
               retval.node = new SelfNode(); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "self"

    public static class instanceVariable_return extends ParserRuleReturnScope {
        public InstanceVariableNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceVariable"
    // CloudScriptParser.g:154:1: instanceVariable returns [InstanceVariableNode node] : AT NAME ;
    public final CloudScriptParser.instanceVariable_return instanceVariable() throws RecognitionException {
        CloudScriptParser.instanceVariable_return retval = new CloudScriptParser.instanceVariable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AT31=null;
        Token NAME32=null;

        Object AT31_tree=null;
        Object NAME32_tree=null;

        try {
            // CloudScriptParser.g:154:53: ( AT NAME )
            // CloudScriptParser.g:155:5: AT NAME
            {
            root_0 = (Object)adaptor.nil();

            AT31=(Token)match(input,AT,FOLLOW_AT_in_instanceVariable1019); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT31_tree = (Object)adaptor.create(AT31);
            adaptor.addChild(root_0, AT31_tree);
            }
            NAME32=(Token)match(input,NAME,FOLLOW_NAME_in_instanceVariable1021); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME32_tree = (Object)adaptor.create(NAME32);
            adaptor.addChild(root_0, NAME32_tree);
            }
            if ( state.backtracking==0 ) {
               retval.node = new InstanceVariableNode((NAME32!=null?NAME32.getText():null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instanceVariable"

    public static class call_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // CloudScriptParser.g:159:1: call returns [Node node] : ( literal DOT )? (head= message DOT )* tail= message ;
    public final CloudScriptParser.call_return call() throws RecognitionException {
        CloudScriptParser.call_return retval = new CloudScriptParser.call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT34=null;
        Token DOT35=null;
        CloudScriptParser.message_return head = null;

        CloudScriptParser.message_return tail = null;

        CloudScriptParser.literal_return literal33 = null;


        Object DOT34_tree=null;
        Object DOT35_tree=null;

        try {
            // CloudScriptParser.g:159:25: ( ( literal DOT )? (head= message DOT )* tail= message )
            // CloudScriptParser.g:160:5: ( literal DOT )? (head= message DOT )* tail= message
            {
            root_0 = (Object)adaptor.nil();

            // CloudScriptParser.g:160:5: ( literal DOT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=SELF && LA15_0<=FLOAT)||LA15_0==STRING||LA15_0==CONSTANT||LA15_0==AT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // CloudScriptParser.g:160:6: literal DOT
                    {
                    pushFollow(FOLLOW_literal_in_call1053);
                    literal33=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal33.getTree());
                    DOT34=(Token)match(input,DOT,FOLLOW_DOT_in_call1055); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT34_tree = (Object)adaptor.create(DOT34);
                    adaptor.addChild(root_0, DOT34_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = (literal33!=null?literal33.node:null); 
                    }

                    }
                    break;

            }

            // CloudScriptParser.g:162:5: (head= message DOT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==NAME) ) {
                    int LA16_1 = input.LA(2);

                    if ( (synpred36_CloudScriptParser()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // CloudScriptParser.g:162:6: head= message DOT
            	    {
            	    pushFollow(FOLLOW_message_in_call1094);
            	    head=message();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, head.getTree());
            	    DOT35=(Token)match(input,DOT,FOLLOW_DOT_in_call1096); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT35_tree = (Object)adaptor.create(DOT35);
            	    adaptor.addChild(root_0, DOT35_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	       ((CallNode)(head!=null?head.node:null)).setReceiver(retval.node); retval.node = (head!=null?head.node:null); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            pushFollow(FOLLOW_message_in_call1129);
            tail=message();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, tail.getTree());
            if ( state.backtracking==0 ) {
               ((CallNode)(tail!=null?tail.node:null)).setReceiver(retval.node); retval.node = (tail!=null?tail.node:null); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class message_return extends ParserRuleReturnScope {
        public CallNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message"
    // CloudScriptParser.g:168:1: message returns [CallNode node] : ( NAME | NAME OPEN_PARENT CLOSE_PARENT | NAME OPEN_PARENT arguments CLOSE_PARENT );
    public final CloudScriptParser.message_return message() throws RecognitionException {
        CloudScriptParser.message_return retval = new CloudScriptParser.message_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME36=null;
        Token NAME37=null;
        Token OPEN_PARENT38=null;
        Token CLOSE_PARENT39=null;
        Token NAME40=null;
        Token OPEN_PARENT41=null;
        Token CLOSE_PARENT43=null;
        CloudScriptParser.arguments_return arguments42 = null;


        Object NAME36_tree=null;
        Object NAME37_tree=null;
        Object OPEN_PARENT38_tree=null;
        Object CLOSE_PARENT39_tree=null;
        Object NAME40_tree=null;
        Object OPEN_PARENT41_tree=null;
        Object CLOSE_PARENT43_tree=null;

        try {
            // CloudScriptParser.g:168:32: ( NAME | NAME OPEN_PARENT CLOSE_PARENT | NAME OPEN_PARENT arguments CLOSE_PARENT )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NAME) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==OPEN_PARENT) ) {
                    int LA17_2 = input.LA(3);

                    if ( (LA17_2==CLOSE_PARENT) ) {
                        alt17=2;
                    }
                    else if ( ((LA17_2>=CLASS && LA17_2<=IF)||LA17_2==WHILE||(LA17_2>=SELF && LA17_2<=FLOAT)||LA17_2==STRING||LA17_2==NAME||LA17_2==CONSTANT||LA17_2==OPEN_PARENT||LA17_2==AT||LA17_2==NOT) ) {
                        alt17=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA17_1==EOF||LA17_1==ELSE||LA17_1==END||LA17_1==SEMICOLON||(LA17_1>=DOT && LA17_1<=COMMA)||LA17_1==CLOSE_PARENT||(LA17_1>=EQ && LA17_1<=OR)||LA17_1==NEWLINE) ) {
                    alt17=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // CloudScriptParser.g:169:5: NAME
                    {
                    root_0 = (Object)adaptor.nil();

                    NAME36=(Token)match(input,NAME,FOLLOW_NAME_in_message1169); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME36_tree = (Object)adaptor.create(NAME36);
                    adaptor.addChild(root_0, NAME36_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((NAME36!=null?NAME36.getText():null)); 
                    }

                    }
                    break;
                case 2 :
                    // CloudScriptParser.g:170:5: NAME OPEN_PARENT CLOSE_PARENT
                    {
                    root_0 = (Object)adaptor.nil();

                    NAME37=(Token)match(input,NAME,FOLLOW_NAME_in_message1204); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME37_tree = (Object)adaptor.create(NAME37);
                    adaptor.addChild(root_0, NAME37_tree);
                    }
                    OPEN_PARENT38=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_message1206); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPEN_PARENT38_tree = (Object)adaptor.create(OPEN_PARENT38);
                    adaptor.addChild(root_0, OPEN_PARENT38_tree);
                    }
                    CLOSE_PARENT39=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_message1208); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSE_PARENT39_tree = (Object)adaptor.create(CLOSE_PARENT39);
                    adaptor.addChild(root_0, CLOSE_PARENT39_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((NAME37!=null?NAME37.getText():null), new ArrayList<Node>()); 
                    }

                    }
                    break;
                case 3 :
                    // CloudScriptParser.g:171:5: NAME OPEN_PARENT arguments CLOSE_PARENT
                    {
                    root_0 = (Object)adaptor.nil();

                    NAME40=(Token)match(input,NAME,FOLLOW_NAME_in_message1218); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME40_tree = (Object)adaptor.create(NAME40);
                    adaptor.addChild(root_0, NAME40_tree);
                    }
                    OPEN_PARENT41=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_message1220); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPEN_PARENT41_tree = (Object)adaptor.create(OPEN_PARENT41);
                    adaptor.addChild(root_0, OPEN_PARENT41_tree);
                    }
                    pushFollow(FOLLOW_arguments_in_message1233);
                    arguments42=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments42.getTree());
                    CLOSE_PARENT43=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_message1244); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSE_PARENT43_tree = (Object)adaptor.create(CLOSE_PARENT43);
                    adaptor.addChild(root_0, CLOSE_PARENT43_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((NAME40!=null?NAME40.getText():null), (arguments42!=null?arguments42.nodes:null)); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message"

    public static class arguments_return extends ParserRuleReturnScope {
        public ArrayList<Node> nodes;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // CloudScriptParser.g:177:1: arguments returns [ArrayList<Node> nodes] : head= expression ( COMMA tail= expression )* ;
    public final CloudScriptParser.arguments_return arguments() throws RecognitionException {
        CloudScriptParser.arguments_return retval = new CloudScriptParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA44=null;
        CloudScriptParser.expression_return head = null;

        CloudScriptParser.expression_return tail = null;


        Object COMMA44_tree=null;

        try {
            // CloudScriptParser.g:177:42: (head= expression ( COMMA tail= expression )* )
            // CloudScriptParser.g:178:37: head= expression ( COMMA tail= expression )*
            {
            root_0 = (Object)adaptor.nil();

            if ( state.backtracking==0 ) {
               retval.nodes = new ArrayList<Node>(); 
            }
            pushFollow(FOLLOW_expression_in_arguments1319);
            head=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, head.getTree());
            if ( state.backtracking==0 ) {
               retval.nodes.add((head!=null?head.node:null)); 
            }
            // CloudScriptParser.g:180:5: ( COMMA tail= expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // CloudScriptParser.g:180:6: COMMA tail= expression
            	    {
            	    COMMA44=(Token)match(input,COMMA,FOLLOW_COMMA_in_arguments1344); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA44_tree = (Object)adaptor.create(COMMA44);
            	    adaptor.addChild(root_0, COMMA44_tree);
            	    }
            	    pushFollow(FOLLOW_expression_in_arguments1353);
            	    tail=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, tail.getTree());
            	    if ( state.backtracking==0 ) {
            	       retval.nodes.add((tail!=null?tail.node:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class constant_return extends ParserRuleReturnScope {
        public ConstantNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // CloudScriptParser.g:186:1: constant returns [ConstantNode node] : CONSTANT ;
    public final CloudScriptParser.constant_return constant() throws RecognitionException {
        CloudScriptParser.constant_return retval = new CloudScriptParser.constant_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTANT45=null;

        Object CONSTANT45_tree=null;

        try {
            // CloudScriptParser.g:186:37: ( CONSTANT )
            // CloudScriptParser.g:187:5: CONSTANT
            {
            root_0 = (Object)adaptor.nil();

            CONSTANT45=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant1396); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONSTANT45_tree = (Object)adaptor.create(CONSTANT45);
            adaptor.addChild(root_0, CONSTANT45_tree);
            }
            if ( state.backtracking==0 ) {
               retval.node = new ConstantNode((CONSTANT45!=null?CONSTANT45.getText():null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constant"

    public static class assign_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assign"
    // CloudScriptParser.g:191:1: assign returns [Node node] : ( NAME ASSIGN expression | CONSTANT ASSIGN expression | AT NAME ASSIGN expression );
    public final CloudScriptParser.assign_return assign() throws RecognitionException {
        CloudScriptParser.assign_return retval = new CloudScriptParser.assign_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME46=null;
        Token ASSIGN47=null;
        Token CONSTANT49=null;
        Token ASSIGN50=null;
        Token AT52=null;
        Token NAME53=null;
        Token ASSIGN54=null;
        CloudScriptParser.expression_return expression48 = null;

        CloudScriptParser.expression_return expression51 = null;

        CloudScriptParser.expression_return expression55 = null;


        Object NAME46_tree=null;
        Object ASSIGN47_tree=null;
        Object CONSTANT49_tree=null;
        Object ASSIGN50_tree=null;
        Object AT52_tree=null;
        Object NAME53_tree=null;
        Object ASSIGN54_tree=null;

        try {
            // CloudScriptParser.g:191:27: ( NAME ASSIGN expression | CONSTANT ASSIGN expression | AT NAME ASSIGN expression )
            int alt19=3;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt19=1;
                }
                break;
            case CONSTANT:
                {
                alt19=2;
                }
                break;
            case AT:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // CloudScriptParser.g:192:5: NAME ASSIGN expression
                    {
                    root_0 = (Object)adaptor.nil();

                    NAME46=(Token)match(input,NAME,FOLLOW_NAME_in_assign1440); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME46_tree = (Object)adaptor.create(NAME46);
                    adaptor.addChild(root_0, NAME46_tree);
                    }
                    ASSIGN47=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1442); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN47_tree = (Object)adaptor.create(ASSIGN47);
                    adaptor.addChild(root_0, ASSIGN47_tree);
                    }
                    pushFollow(FOLLOW_expression_in_assign1444);
                    expression48=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression48.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new LocalAssignNode((NAME46!=null?NAME46.getText():null), (expression48!=null?expression48.node:null)); 
                    }

                    }
                    break;
                case 2 :
                    // CloudScriptParser.g:193:5: CONSTANT ASSIGN expression
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT49=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_assign1461); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT49_tree = (Object)adaptor.create(CONSTANT49);
                    adaptor.addChild(root_0, CONSTANT49_tree);
                    }
                    ASSIGN50=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1463); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN50_tree = (Object)adaptor.create(ASSIGN50);
                    adaptor.addChild(root_0, ASSIGN50_tree);
                    }
                    pushFollow(FOLLOW_expression_in_assign1465);
                    expression51=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression51.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new ConstantAssignNode((CONSTANT49!=null?CONSTANT49.getText():null), (expression51!=null?expression51.node:null)); 
                    }

                    }
                    break;
                case 3 :
                    // CloudScriptParser.g:194:5: AT NAME ASSIGN expression
                    {
                    root_0 = (Object)adaptor.nil();

                    AT52=(Token)match(input,AT,FOLLOW_AT_in_assign1478); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT52_tree = (Object)adaptor.create(AT52);
                    adaptor.addChild(root_0, AT52_tree);
                    }
                    NAME53=(Token)match(input,NAME,FOLLOW_NAME_in_assign1480); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME53_tree = (Object)adaptor.create(NAME53);
                    adaptor.addChild(root_0, NAME53_tree);
                    }
                    ASSIGN54=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN54_tree = (Object)adaptor.create(ASSIGN54);
                    adaptor.addChild(root_0, ASSIGN54_tree);
                    }
                    pushFollow(FOLLOW_expression_in_assign1484);
                    expression55=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression55.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new InstanceVariableAssignNode((NAME53!=null?NAME53.getText():null), (expression55!=null?expression55.node:null)); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assign"

    public static class methodDefinition_return extends ParserRuleReturnScope {
        public MethodDefinitionNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDefinition"
    // CloudScriptParser.g:197:1: methodDefinition returns [MethodDefinitionNode node] : FN NAME ( OPEN_PARENT ( parameters )? CLOSE_PARENT )? terminator expressions END ;
    public final CloudScriptParser.methodDefinition_return methodDefinition() throws RecognitionException {
        CloudScriptParser.methodDefinition_return retval = new CloudScriptParser.methodDefinition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FN56=null;
        Token NAME57=null;
        Token OPEN_PARENT58=null;
        Token CLOSE_PARENT60=null;
        Token END63=null;
        CloudScriptParser.parameters_return parameters59 = null;

        CloudScriptParser.terminator_return terminator61 = null;

        CloudScriptParser.expressions_return expressions62 = null;


        Object FN56_tree=null;
        Object NAME57_tree=null;
        Object OPEN_PARENT58_tree=null;
        Object CLOSE_PARENT60_tree=null;
        Object END63_tree=null;

        try {
            // CloudScriptParser.g:197:53: ( FN NAME ( OPEN_PARENT ( parameters )? CLOSE_PARENT )? terminator expressions END )
            // CloudScriptParser.g:198:5: FN NAME ( OPEN_PARENT ( parameters )? CLOSE_PARENT )? terminator expressions END
            {
            root_0 = (Object)adaptor.nil();

            FN56=(Token)match(input,FN,FOLLOW_FN_in_methodDefinition1510); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FN56_tree = (Object)adaptor.create(FN56);
            adaptor.addChild(root_0, FN56_tree);
            }
            NAME57=(Token)match(input,NAME,FOLLOW_NAME_in_methodDefinition1512); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME57_tree = (Object)adaptor.create(NAME57);
            adaptor.addChild(root_0, NAME57_tree);
            }
            // CloudScriptParser.g:198:13: ( OPEN_PARENT ( parameters )? CLOSE_PARENT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==OPEN_PARENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // CloudScriptParser.g:198:14: OPEN_PARENT ( parameters )? CLOSE_PARENT
                    {
                    OPEN_PARENT58=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_methodDefinition1515); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPEN_PARENT58_tree = (Object)adaptor.create(OPEN_PARENT58);
                    adaptor.addChild(root_0, OPEN_PARENT58_tree);
                    }
                    // CloudScriptParser.g:198:26: ( parameters )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==NAME) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // CloudScriptParser.g:0:0: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_methodDefinition1517);
                            parameters59=parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters59.getTree());

                            }
                            break;

                    }

                    CLOSE_PARENT60=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_methodDefinition1520); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSE_PARENT60_tree = (Object)adaptor.create(CLOSE_PARENT60);
                    adaptor.addChild(root_0, CLOSE_PARENT60_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_terminator_in_methodDefinition1524);
            terminator61=terminator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator61.getTree());
            pushFollow(FOLLOW_expressions_in_methodDefinition1532);
            expressions62=expressions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressions62.getTree());
            END63=(Token)match(input,END,FOLLOW_END_in_methodDefinition1538); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END63_tree = (Object)adaptor.create(END63);
            adaptor.addChild(root_0, END63_tree);
            }
            if ( state.backtracking==0 ) {
               retval.node = new MethodDefinitionNode((NAME57!=null?NAME57.getText():null), (parameters59!=null?parameters59.names:null), (expressions62!=null?expressions62.nodes:null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodDefinition"

    public static class parameters_return extends ParserRuleReturnScope {
        public ArrayList<String> names;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameters"
    // CloudScriptParser.g:204:1: parameters returns [ArrayList<String> names] : head= NAME ( COMMA tail= NAME )* ;
    public final CloudScriptParser.parameters_return parameters() throws RecognitionException {
        CloudScriptParser.parameters_return retval = new CloudScriptParser.parameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token head=null;
        Token tail=null;
        Token COMMA64=null;

        Object head_tree=null;
        Object tail_tree=null;
        Object COMMA64_tree=null;

        try {
            // CloudScriptParser.g:204:45: (head= NAME ( COMMA tail= NAME )* )
            // CloudScriptParser.g:205:37: head= NAME ( COMMA tail= NAME )*
            {
            root_0 = (Object)adaptor.nil();

            if ( state.backtracking==0 ) {
               retval.names = new ArrayList<String>(); 
            }
            head=(Token)match(input,NAME,FOLLOW_NAME_in_parameters1627); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            head_tree = (Object)adaptor.create(head);
            adaptor.addChild(root_0, head_tree);
            }
            if ( state.backtracking==0 ) {
               retval.names.add((head!=null?head.getText():null)); 
            }
            // CloudScriptParser.g:207:5: ( COMMA tail= NAME )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // CloudScriptParser.g:207:6: COMMA tail= NAME
            	    {
            	    COMMA64=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameters1658); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA64_tree = (Object)adaptor.create(COMMA64);
            	    adaptor.addChild(root_0, COMMA64_tree);
            	    }
            	    tail=(Token)match(input,NAME,FOLLOW_NAME_in_parameters1667); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    tail_tree = (Object)adaptor.create(tail);
            	    adaptor.addChild(root_0, tail_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	       retval.names.add((tail!=null?tail.getText():null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameters"

    public static class classDefinition_return extends ParserRuleReturnScope {
        public ClassDefinitionNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDefinition"
    // CloudScriptParser.g:212:1: classDefinition returns [ClassDefinitionNode node] : CLASS name= CONSTANT ( LT superClass= CONSTANT )? terminator expressions END ;
    public final CloudScriptParser.classDefinition_return classDefinition() throws RecognitionException {
        CloudScriptParser.classDefinition_return retval = new CloudScriptParser.classDefinition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token superClass=null;
        Token CLASS65=null;
        Token LT66=null;
        Token END69=null;
        CloudScriptParser.terminator_return terminator67 = null;

        CloudScriptParser.expressions_return expressions68 = null;


        Object name_tree=null;
        Object superClass_tree=null;
        Object CLASS65_tree=null;
        Object LT66_tree=null;
        Object END69_tree=null;

        try {
            // CloudScriptParser.g:212:51: ( CLASS name= CONSTANT ( LT superClass= CONSTANT )? terminator expressions END )
            // CloudScriptParser.g:213:5: CLASS name= CONSTANT ( LT superClass= CONSTANT )? terminator expressions END
            {
            root_0 = (Object)adaptor.nil();

            CLASS65=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDefinition1715); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS65_tree = (Object)adaptor.create(CLASS65);
            adaptor.addChild(root_0, CLASS65_tree);
            }
            name=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_classDefinition1719); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            // CloudScriptParser.g:213:25: ( LT superClass= CONSTANT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // CloudScriptParser.g:213:26: LT superClass= CONSTANT
                    {
                    LT66=(Token)match(input,LT,FOLLOW_LT_in_classDefinition1722); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT66_tree = (Object)adaptor.create(LT66);
                    adaptor.addChild(root_0, LT66_tree);
                    }
                    superClass=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_classDefinition1726); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    superClass_tree = (Object)adaptor.create(superClass);
                    adaptor.addChild(root_0, superClass_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_terminator_in_classDefinition1730);
            terminator67=terminator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator67.getTree());
            pushFollow(FOLLOW_expressions_in_classDefinition1738);
            expressions68=expressions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressions68.getTree());
            END69=(Token)match(input,END,FOLLOW_END_in_classDefinition1744); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END69_tree = (Object)adaptor.create(END69);
            adaptor.addChild(root_0, END69_tree);
            }
            if ( state.backtracking==0 ) {
               retval.node = new ClassDefinitionNode((name!=null?name.getText():null), (superClass!=null?superClass.getText():null), (expressions68!=null?expressions68.nodes:null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classDefinition"

    public static class ifBlock_return extends ParserRuleReturnScope {
        public IfNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifBlock"
    // CloudScriptParser.g:218:1: ifBlock returns [IfNode node] : IF condition= expression terminator ifBody= expressions ( ELSE terminator elseBody= expressions )? END ;
    public final CloudScriptParser.ifBlock_return ifBlock() throws RecognitionException {
        CloudScriptParser.ifBlock_return retval = new CloudScriptParser.ifBlock_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF70=null;
        Token ELSE72=null;
        Token END74=null;
        CloudScriptParser.expression_return condition = null;

        CloudScriptParser.expressions_return ifBody = null;

        CloudScriptParser.expressions_return elseBody = null;

        CloudScriptParser.terminator_return terminator71 = null;

        CloudScriptParser.terminator_return terminator73 = null;


        Object IF70_tree=null;
        Object ELSE72_tree=null;
        Object END74_tree=null;

        try {
            // CloudScriptParser.g:218:30: ( IF condition= expression terminator ifBody= expressions ( ELSE terminator elseBody= expressions )? END )
            // CloudScriptParser.g:219:5: IF condition= expression terminator ifBody= expressions ( ELSE terminator elseBody= expressions )? END
            {
            root_0 = (Object)adaptor.nil();

            IF70=(Token)match(input,IF,FOLLOW_IF_in_ifBlock1792); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF70_tree = (Object)adaptor.create(IF70);
            adaptor.addChild(root_0, IF70_tree);
            }
            pushFollow(FOLLOW_expression_in_ifBlock1796);
            condition=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition.getTree());
            pushFollow(FOLLOW_terminator_in_ifBlock1798);
            terminator71=terminator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator71.getTree());
            pushFollow(FOLLOW_expressions_in_ifBlock1808);
            ifBody=expressions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ifBody.getTree());
            // CloudScriptParser.g:221:5: ( ELSE terminator elseBody= expressions )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ELSE) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // CloudScriptParser.g:221:6: ELSE terminator elseBody= expressions
                    {
                    ELSE72=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifBlock1815); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE72_tree = (Object)adaptor.create(ELSE72);
                    adaptor.addChild(root_0, ELSE72_tree);
                    }
                    pushFollow(FOLLOW_terminator_in_ifBlock1817);
                    terminator73=terminator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator73.getTree());
                    pushFollow(FOLLOW_expressions_in_ifBlock1827);
                    elseBody=expressions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elseBody.getTree());

                    }
                    break;

            }

            END74=(Token)match(input,END,FOLLOW_END_in_ifBlock1840); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END74_tree = (Object)adaptor.create(END74);
            adaptor.addChild(root_0, END74_tree);
            }
            if ( state.backtracking==0 ) {
               retval.node = new IfNode((condition!=null?condition.node:null), (ifBody!=null?ifBody.nodes:null), (elseBody!=null?elseBody.nodes:null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifBlock"

    public static class whileBlock_return extends ParserRuleReturnScope {
        public WhileNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileBlock"
    // CloudScriptParser.g:227:1: whileBlock returns [WhileNode node] : WHILE condition= expression terminator body= expressions END ;
    public final CloudScriptParser.whileBlock_return whileBlock() throws RecognitionException {
        CloudScriptParser.whileBlock_return retval = new CloudScriptParser.whileBlock_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE75=null;
        Token END77=null;
        CloudScriptParser.expression_return condition = null;

        CloudScriptParser.expressions_return body = null;

        CloudScriptParser.terminator_return terminator76 = null;


        Object WHILE75_tree=null;
        Object END77_tree=null;

        try {
            // CloudScriptParser.g:227:36: ( WHILE condition= expression terminator body= expressions END )
            // CloudScriptParser.g:228:5: WHILE condition= expression terminator body= expressions END
            {
            root_0 = (Object)adaptor.nil();

            WHILE75=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileBlock1888); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE75_tree = (Object)adaptor.create(WHILE75);
            adaptor.addChild(root_0, WHILE75_tree);
            }
            pushFollow(FOLLOW_expression_in_whileBlock1892);
            condition=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition.getTree());
            pushFollow(FOLLOW_terminator_in_whileBlock1894);
            terminator76=terminator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator76.getTree());
            pushFollow(FOLLOW_expressions_in_whileBlock1904);
            body=expressions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body.getTree());
            END77=(Token)match(input,END,FOLLOW_END_in_whileBlock1910); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END77_tree = (Object)adaptor.create(END77);
            adaptor.addChild(root_0, END77_tree);
            }
            if ( state.backtracking==0 ) {
               retval.node = new WhileNode((condition!=null?condition.node:null), (body!=null?body.nodes:null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileBlock"

    // $ANTLR start synpred8_CloudScriptParser
    public final void synpred8_CloudScriptParser_fragment() throws RecognitionException {   
        CloudScriptParser.andExpression_return receiver = null;

        CloudScriptParser.orExpression_return arg = null;


        // CloudScriptParser.g:87:5: (receiver= andExpression OR arg= orExpression )
        // CloudScriptParser.g:87:5: receiver= andExpression OR arg= orExpression
        {
        pushFollow(FOLLOW_andExpression_in_synpred8_CloudScriptParser285);
        receiver=andExpression();

        state._fsp--;
        if (state.failed) return ;
        match(input,OR,FOLLOW_OR_in_synpred8_CloudScriptParser293); if (state.failed) return ;
        pushFollow(FOLLOW_orExpression_in_synpred8_CloudScriptParser297);
        arg=orExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_CloudScriptParser

    // $ANTLR start synpred9_CloudScriptParser
    public final void synpred9_CloudScriptParser_fragment() throws RecognitionException {   
        CloudScriptParser.relationalExpression_return receiver = null;

        CloudScriptParser.andExpression_return arg = null;


        // CloudScriptParser.g:93:5: (receiver= relationalExpression AND arg= andExpression )
        // CloudScriptParser.g:93:5: receiver= relationalExpression AND arg= andExpression
        {
        pushFollow(FOLLOW_relationalExpression_in_synpred9_CloudScriptParser347);
        receiver=relationalExpression();

        state._fsp--;
        if (state.failed) return ;
        match(input,AND,FOLLOW_AND_in_synpred9_CloudScriptParser355); if (state.failed) return ;
        pushFollow(FOLLOW_andExpression_in_synpred9_CloudScriptParser359);
        arg=andExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_CloudScriptParser

    // $ANTLR start synpred14_CloudScriptParser
    public final void synpred14_CloudScriptParser_fragment() throws RecognitionException {   
        Token op=null;
        CloudScriptParser.additiveExpression_return receiver = null;

        CloudScriptParser.relationalExpression_return arg = null;


        // CloudScriptParser.g:99:5: (receiver= additiveExpression op= ( EQ | LE | GE | LT | GT ) arg= relationalExpression )
        // CloudScriptParser.g:99:5: receiver= additiveExpression op= ( EQ | LE | GE | LT | GT ) arg= relationalExpression
        {
        pushFollow(FOLLOW_additiveExpression_in_synpred14_CloudScriptParser400);
        receiver=additiveExpression();

        state._fsp--;
        if (state.failed) return ;
        op=(Token)input.LT(1);
        if ( (input.LA(1)>=EQ && input.LA(1)<=GT) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_relationalExpression_in_synpred14_CloudScriptParser430);
        arg=relationalExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_CloudScriptParser

    // $ANTLR start synpred16_CloudScriptParser
    public final void synpred16_CloudScriptParser_fragment() throws RecognitionException {   
        Token op=null;
        CloudScriptParser.multiplicativeExpression_return receiver = null;

        CloudScriptParser.additiveExpression_return arg = null;


        // CloudScriptParser.g:106:5: (receiver= multiplicativeExpression op= ( PLUS | MINUS ) arg= additiveExpression )
        // CloudScriptParser.g:106:5: receiver= multiplicativeExpression op= ( PLUS | MINUS ) arg= additiveExpression
        {
        pushFollow(FOLLOW_multiplicativeExpression_in_synpred16_CloudScriptParser470);
        receiver=multiplicativeExpression();

        state._fsp--;
        if (state.failed) return ;
        op=(Token)input.LT(1);
        if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_additiveExpression_in_synpred16_CloudScriptParser488);
        arg=additiveExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_CloudScriptParser

    // $ANTLR start synpred19_CloudScriptParser
    public final void synpred19_CloudScriptParser_fragment() throws RecognitionException {   
        Token op=null;
        CloudScriptParser.unaryExpression_return receiver = null;

        CloudScriptParser.multiplicativeExpression_return arg = null;


        // CloudScriptParser.g:112:5: (receiver= unaryExpression op= ( MUL | DIV | MOD ) arg= multiplicativeExpression )
        // CloudScriptParser.g:112:5: receiver= unaryExpression op= ( MUL | DIV | MOD ) arg= multiplicativeExpression
        {
        pushFollow(FOLLOW_unaryExpression_in_synpred19_CloudScriptParser536);
        receiver=unaryExpression();

        state._fsp--;
        if (state.failed) return ;
        op=(Token)input.LT(1);
        if ( (input.LA(1)>=MUL && input.LA(1)<=MOD) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_multiplicativeExpression_in_synpred19_CloudScriptParser556);
        arg=multiplicativeExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_CloudScriptParser

    // $ANTLR start synpred36_CloudScriptParser
    public final void synpred36_CloudScriptParser_fragment() throws RecognitionException {   
        CloudScriptParser.message_return head = null;


        // CloudScriptParser.g:162:6: (head= message DOT )
        // CloudScriptParser.g:162:6: head= message DOT
        {
        pushFollow(FOLLOW_message_in_synpred36_CloudScriptParser1094);
        head=message();

        state._fsp--;
        if (state.failed) return ;
        match(input,DOT,FOLLOW_DOT_in_synpred36_CloudScriptParser1096); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_CloudScriptParser

    // Delegated rules

    public final boolean synpred36_CloudScriptParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_CloudScriptParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_CloudScriptParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_CloudScriptParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_CloudScriptParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_CloudScriptParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_CloudScriptParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_CloudScriptParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_CloudScriptParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_CloudScriptParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_CloudScriptParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_CloudScriptParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA3_eotS =
        "\4\uffff";
    static final String DFA3_eofS =
        "\2\2\2\uffff";
    static final String DFA3_minS =
        "\1\7\1\4\2\uffff";
    static final String DFA3_maxS =
        "\2\55\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\4\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\1\uffff\1\2\16\uffff\1\1\24\uffff\1\1",
            "\3\3\1\2\1\3\1\2\6\3\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1"+
            "\1\3\uffff\1\3\1\uffff\1\3\14\uffff\1\3\1\uffff\1\1",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 63:5: ( terminator tail= expression )*";
        }
    }
    static final String DFA7_eotS =
        "\23\uffff";
    static final String DFA7_eofS =
        "\23\uffff";
    static final String DFA7_minS =
        "\1\4\20\0\2\uffff";
    static final String DFA7_maxS =
        "\1\53\20\0\2\uffff";
    static final String DFA7_acceptS =
        "\21\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\2\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\15\1\14\1\16\1\uffff\1\17\1\uffff\1\12\1\5\1\6\1\7\1\3\1"+
            "\4\2\uffff\1\2\2\uffff\1\13\1\uffff\1\10\4\uffff\1\20\1\uffff"+
            "\1\11\14\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "86:1: orExpression returns [Node node] : (receiver= andExpression OR arg= orExpression | e= andExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_1 = input.LA(1);

                         
                        int index7_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_4 = input.LA(1);

                         
                        int index7_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_7 = input.LA(1);

                         
                        int index7_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA7_8 = input.LA(1);

                         
                        int index7_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA7_9 = input.LA(1);

                         
                        int index7_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA7_10 = input.LA(1);

                         
                        int index7_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA7_11 = input.LA(1);

                         
                        int index7_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA7_12 = input.LA(1);

                         
                        int index7_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA7_13 = input.LA(1);

                         
                        int index7_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA7_14 = input.LA(1);

                         
                        int index7_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA7_15 = input.LA(1);

                         
                        int index7_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA7_16 = input.LA(1);

                         
                        int index7_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index7_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA8_eotS =
        "\23\uffff";
    static final String DFA8_eofS =
        "\23\uffff";
    static final String DFA8_minS =
        "\1\4\20\0\2\uffff";
    static final String DFA8_maxS =
        "\1\53\20\0\2\uffff";
    static final String DFA8_acceptS =
        "\21\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\2\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\15\1\14\1\16\1\uffff\1\17\1\uffff\1\12\1\5\1\6\1\7\1\3\1"+
            "\4\2\uffff\1\2\2\uffff\1\13\1\uffff\1\10\4\uffff\1\20\1\uffff"+
            "\1\11\14\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "92:1: andExpression returns [Node node] : (receiver= relationalExpression AND arg= andExpression | e= relationalExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_8 = input.LA(1);

                         
                        int index8_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA8_9 = input.LA(1);

                         
                        int index8_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA8_10 = input.LA(1);

                         
                        int index8_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA8_11 = input.LA(1);

                         
                        int index8_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA8_12 = input.LA(1);

                         
                        int index8_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA8_13 = input.LA(1);

                         
                        int index8_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA8_14 = input.LA(1);

                         
                        int index8_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA8_15 = input.LA(1);

                         
                        int index8_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA8_16 = input.LA(1);

                         
                        int index8_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index8_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\23\uffff";
    static final String DFA9_eofS =
        "\23\uffff";
    static final String DFA9_minS =
        "\1\4\20\0\2\uffff";
    static final String DFA9_maxS =
        "\1\53\20\0\2\uffff";
    static final String DFA9_acceptS =
        "\21\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\15\1\14\1\16\1\uffff\1\17\1\uffff\1\12\1\5\1\6\1\7\1\3\1"+
            "\4\2\uffff\1\2\2\uffff\1\13\1\uffff\1\10\4\uffff\1\20\1\uffff"+
            "\1\11\14\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "98:1: relationalExpression returns [Node node] : (receiver= additiveExpression op= ( EQ | LE | GE | LT | GT ) arg= relationalExpression | e= additiveExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_9 = input.LA(1);

                         
                        int index9_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA9_10 = input.LA(1);

                         
                        int index9_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA9_11 = input.LA(1);

                         
                        int index9_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA9_12 = input.LA(1);

                         
                        int index9_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA9_13 = input.LA(1);

                         
                        int index9_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA9_14 = input.LA(1);

                         
                        int index9_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA9_15 = input.LA(1);

                         
                        int index9_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA9_16 = input.LA(1);

                         
                        int index9_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index9_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\23\uffff";
    static final String DFA10_eofS =
        "\23\uffff";
    static final String DFA10_minS =
        "\1\4\20\0\2\uffff";
    static final String DFA10_maxS =
        "\1\53\20\0\2\uffff";
    static final String DFA10_acceptS =
        "\21\uffff\1\1\1\2";
    static final String DFA10_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\2\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\15\1\14\1\16\1\uffff\1\17\1\uffff\1\12\1\5\1\6\1\7\1\3\1"+
            "\4\2\uffff\1\2\2\uffff\1\13\1\uffff\1\10\4\uffff\1\20\1\uffff"+
            "\1\11\14\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "105:1: additiveExpression returns [Node node] : (receiver= multiplicativeExpression op= ( PLUS | MINUS ) arg= additiveExpression | e= multiplicativeExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_1 = input.LA(1);

                         
                        int index10_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA10_9 = input.LA(1);

                         
                        int index10_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA10_10 = input.LA(1);

                         
                        int index10_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA10_11 = input.LA(1);

                         
                        int index10_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA10_12 = input.LA(1);

                         
                        int index10_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA10_13 = input.LA(1);

                         
                        int index10_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA10_14 = input.LA(1);

                         
                        int index10_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA10_15 = input.LA(1);

                         
                        int index10_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA10_16 = input.LA(1);

                         
                        int index10_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index10_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\23\uffff";
    static final String DFA11_eofS =
        "\23\uffff";
    static final String DFA11_minS =
        "\1\4\20\0\2\uffff";
    static final String DFA11_maxS =
        "\1\53\20\0\2\uffff";
    static final String DFA11_acceptS =
        "\21\uffff\1\1\1\2";
    static final String DFA11_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\2\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\15\1\14\1\16\1\uffff\1\17\1\uffff\1\12\1\5\1\6\1\7\1\3\1"+
            "\4\2\uffff\1\2\2\uffff\1\13\1\uffff\1\10\4\uffff\1\20\1\uffff"+
            "\1\11\14\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "111:1: multiplicativeExpression returns [Node node] : (receiver= unaryExpression op= ( MUL | DIV | MOD ) arg= multiplicativeExpression | e= unaryExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_12 = input.LA(1);

                         
                        int index11_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_13 = input.LA(1);

                         
                        int index11_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_15 = input.LA(1);

                         
                        int index11_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA11_16 = input.LA(1);

                         
                        int index11_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index11_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA13_eotS =
        "\22\uffff";
    static final String DFA13_eofS =
        "\1\uffff\7\20\1\uffff\1\20\7\uffff\1\20";
    static final String DFA13_minS =
        "\1\4\7\7\1\25\1\7\7\uffff\1\7";
    static final String DFA13_maxS =
        "\1\36\7\55\1\25\1\55\7\uffff\1\55";
    static final String DFA13_acceptS =
        "\12\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\1\1\uffff";
    static final String DFA13_specialS =
        "\22\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\14\1\13\1\15\1\uffff\1\16\1\uffff\1\11\1\4\1\5\1\6\1\2\1"+
            "\3\2\uffff\1\1\2\uffff\1\12\1\uffff\1\7\4\uffff\1\17\1\uffff"+
            "\1\10",
            "\1\20\1\uffff\1\20\16\uffff\1\20\1\uffff\1\12\1\20\1\uffff"+
            "\1\20\1\uffff\14\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\16\uffff\1\20\1\uffff\1\12\1\20\1\uffff"+
            "\1\20\1\uffff\14\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\16\uffff\1\20\1\uffff\1\12\1\20\1\uffff"+
            "\1\20\1\uffff\14\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\16\uffff\1\20\1\uffff\1\12\1\20\1\uffff"+
            "\1\20\1\uffff\14\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\16\uffff\1\20\1\uffff\1\12\1\20\1\uffff"+
            "\1\20\1\uffff\14\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\16\uffff\1\20\1\uffff\1\12\1\20\1\uffff"+
            "\1\20\1\uffff\14\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\16\uffff\1\20\1\uffff\1\12\1\20\1\uffff"+
            "\1\20\1\uffff\14\20\2\uffff\1\20",
            "\1\21",
            "\1\20\1\uffff\1\20\16\uffff\1\20\1\uffff\1\12\1\20\1\uffff"+
            "\1\20\1\uffff\14\20\2\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20\1\uffff\1\20\16\uffff\1\20\1\uffff\1\12\1\20\1\uffff"+
            "\1\20\1\uffff\14\20\2\uffff\1\20"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "123:1: primaryExpression returns [Node node] : ( literal | call | methodDefinition | classDefinition | ifBlock | whileBlock | OPEN_PARENT expression CLOSE_PARENT );";
        }
    }
 

    public static final BitSet FOLLOW_terminator_in_root77 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_expressions_in_root80 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_root83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressions131 = new BitSet(new long[]{0x0000200001000002L});
    public static final BitSet FOLLOW_terminator_in_expressions142 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_expression_in_expressions151 = new BitSet(new long[]{0x0000200001000002L});
    public static final BitSet FOLLOW_terminator_in_expressions167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expression187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_terminator205 = new BitSet(new long[]{0x0000200001000002L});
    public static final BitSet FOLLOW_assign_in_assignExpression231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_assignExpression256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression285 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_OR_in_orExpression293 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_orExpression_in_orExpression297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_andExpression347 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_AND_in_andExpression355 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_andExpression_in_andExpression359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_andExpression373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression400 = new BitSet(new long[]{0x0000000F80000000L});
    public static final BitSet FOLLOW_set_in_relationalExpression410 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_relationalExpression_in_relationalExpression430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression470 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_set_in_additiveExpression480 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_additiveExpression_in_additiveExpression488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression536 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression546 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_multiplicativeExpression556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryExpression618 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_primaryExpression692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_primaryExpression713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_primaryExpression722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifBlock_in_primaryExpression732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileBlock_in_primaryExpression750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_primaryExpression765 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_expression_in_primaryExpression773 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_primaryExpression779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_literal824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_literal862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_literal884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_literal905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_literal925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceVariable_in_literal942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_self_in_literal951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELF_in_self985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_instanceVariable1019 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NAME_in_instanceVariable1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_call1053 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_call1055 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_message_in_call1094 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_call1096 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_message_in_call1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_message1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_message1204 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_message1206 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_message1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_message1218 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_message1220 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_arguments_in_message1233 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_message1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arguments1319 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_COMMA_in_arguments1344 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_expression_in_arguments1353 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_CONSTANT_in_constant1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_assign1440 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assign1442 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_expression_in_assign1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_assign1461 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assign1463 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_expression_in_assign1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_assign1478 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NAME_in_assign1480 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assign1482 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_expression_in_assign1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FN_in_methodDefinition1510 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NAME_in_methodDefinition1512 = new BitSet(new long[]{0x0000200011000000L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_methodDefinition1515 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_parameters_in_methodDefinition1517 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_methodDefinition1520 = new BitSet(new long[]{0x0000200001000000L});
    public static final BitSet FOLLOW_terminator_in_methodDefinition1524 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_expressions_in_methodDefinition1532 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_END_in_methodDefinition1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_parameters1627 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_COMMA_in_parameters1658 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NAME_in_parameters1667 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_CLASS_in_classDefinition1715 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONSTANT_in_classDefinition1719 = new BitSet(new long[]{0x0000200401000000L});
    public static final BitSet FOLLOW_LT_in_classDefinition1722 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONSTANT_in_classDefinition1726 = new BitSet(new long[]{0x0000200001000000L});
    public static final BitSet FOLLOW_terminator_in_classDefinition1730 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_expressions_in_classDefinition1738 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_END_in_classDefinition1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifBlock1792 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_expression_in_ifBlock1796 = new BitSet(new long[]{0x0000200001000000L});
    public static final BitSet FOLLOW_terminator_in_ifBlock1798 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_expressions_in_ifBlock1808 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_ELSE_in_ifBlock1815 = new BitSet(new long[]{0x0000200001000000L});
    public static final BitSet FOLLOW_terminator_in_ifBlock1817 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_expressions_in_ifBlock1827 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_END_in_ifBlock1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileBlock1888 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_expression_in_whileBlock1892 = new BitSet(new long[]{0x0000200001000000L});
    public static final BitSet FOLLOW_terminator_in_whileBlock1894 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_expressions_in_whileBlock1904 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_END_in_whileBlock1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_synpred8_CloudScriptParser285 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_OR_in_synpred8_CloudScriptParser293 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_orExpression_in_synpred8_CloudScriptParser297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_synpred9_CloudScriptParser347 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_AND_in_synpred9_CloudScriptParser355 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_andExpression_in_synpred9_CloudScriptParser359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_synpred14_CloudScriptParser400 = new BitSet(new long[]{0x0000000F80000000L});
    public static final BitSet FOLLOW_set_in_synpred14_CloudScriptParser410 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_relationalExpression_in_synpred14_CloudScriptParser430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_synpred16_CloudScriptParser470 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_set_in_synpred16_CloudScriptParser480 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_additiveExpression_in_synpred16_CloudScriptParser488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_synpred19_CloudScriptParser536 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_set_in_synpred19_CloudScriptParser546 = new BitSet(new long[]{0x0000080050A4FD70L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_synpred19_CloudScriptParser556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_in_synpred36_CloudScriptParser1094 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_synpred36_CloudScriptParser1096 = new BitSet(new long[]{0x0000000000000002L});

}