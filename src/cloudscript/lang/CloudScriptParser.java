// $ANTLR 3.1.1 CloudScriptParser.g 2012-03-31 15:59:35

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLASS", "FN", "IF", "ELSE", "WHILE", "END", "SELF", "NIL", "TRUE", "FALSE", "INTEGER", "FLOAT", "DIGIT", "NUMBER", "STRING", "LOWER", "ID_CHAR", "NAME", "UPPER", "CONSTANT", "URL_CHAR", "URL", "SEMICOLON", "COLON", "DOT", "COMMA", "OPEN_PARENT", "CLOSE_PARENT", "PRIV", "EQ", "LE", "GE", "LT", "GT", "PLUS", "MINUS", "MUL", "DIV", "MOD", "AND", "OR", "NOT", "ASSIGN", "NEWLINE", "COMMENT", "SPACE", "WHITESPACE", "LETTER"
    };
    public static final int CLASS=4;
    public static final int LT=36;
    public static final int WHILE=8;
    public static final int MOD=42;
    public static final int LETTER=51;
    public static final int ID_CHAR=20;
    public static final int FLOAT=15;
    public static final int NOT=45;
    public static final int AND=43;
    public static final int SPACE=49;
    public static final int EOF=-1;
    public static final int IF=6;
    public static final int NAME=21;
    public static final int COMMA=29;
    public static final int PLUS=38;
    public static final int DIGIT=16;
    public static final int EQ=33;
    public static final int COMMENT=48;
    public static final int DOT=28;
    public static final int INTEGER=14;
    public static final int GE=35;
    public static final int PRIV=32;
    public static final int ELSE=7;
    public static final int NUMBER=17;
    public static final int WHITESPACE=50;
    public static final int SEMICOLON=26;
    public static final int FN=5;
    public static final int MINUS=39;
    public static final int TRUE=12;
    public static final int MUL=40;
    public static final int URL=25;
    public static final int COLON=27;
    public static final int URL_CHAR=24;
    public static final int NEWLINE=47;
    public static final int NIL=11;
    public static final int OPEN_PARENT=30;
    public static final int OR=44;
    public static final int CLOSE_PARENT=31;
    public static final int ASSIGN=46;
    public static final int CONSTANT=23;
    public static final int GT=37;
    public static final int LOWER=19;
    public static final int DIV=41;
    public static final int END=9;
    public static final int FALSE=13;
    public static final int SELF=10;
    public static final int LE=34;
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

            if ( ((LA2_0>=CLASS && LA2_0<=IF)||LA2_0==WHILE||(LA2_0>=SELF && LA2_0<=FLOAT)||LA2_0==STRING||LA2_0==NAME||LA2_0==CONSTANT||LA2_0==URL||LA2_0==OPEN_PARENT||LA2_0==PRIV||LA2_0==NOT) ) {
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
            case PRIV:
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
            case URL:
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
            else if ( ((LA12_0>=CLASS && LA12_0<=IF)||LA12_0==WHILE||(LA12_0>=SELF && LA12_0<=FLOAT)||LA12_0==STRING||LA12_0==NAME||LA12_0==CONSTANT||LA12_0==URL||LA12_0==OPEN_PARENT||LA12_0==PRIV) ) {
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
    // CloudScriptParser.g:136:1: literal returns [Node node] : ( STRING | INTEGER | FLOAT | NIL | TRUE | FALSE | constant | instanceVariable | self | URL );
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
        Token URL30=null;
        CloudScriptParser.constant_return constant27 = null;

        CloudScriptParser.instanceVariable_return instanceVariable28 = null;

        CloudScriptParser.self_return self29 = null;


        Object STRING21_tree=null;
        Object INTEGER22_tree=null;
        Object FLOAT23_tree=null;
        Object NIL24_tree=null;
        Object TRUE25_tree=null;
        Object FALSE26_tree=null;
        Object URL30_tree=null;

        try {
            // CloudScriptParser.g:136:28: ( STRING | INTEGER | FLOAT | NIL | TRUE | FALSE | constant | instanceVariable | self | URL )
            int alt14=10;
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
            case PRIV:
                {
                alt14=8;
                }
                break;
            case SELF:
                {
                alt14=9;
                }
                break;
            case URL:
                {
                alt14=10;
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
                case 10 :
                    // CloudScriptParser.g:146:5: URL
                    {
                    root_0 = (Object)adaptor.nil();

                    URL30=(Token)match(input,URL,FOLLOW_URL_in_literal972); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URL30_tree = (Object)adaptor.create(URL30);
                    adaptor.addChild(root_0, URL30_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new UrlNode((URL30!=null?URL30.getText():null)); 
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
    // CloudScriptParser.g:150:1: self returns [SelfNode node] : SELF ;
    public final CloudScriptParser.self_return self() throws RecognitionException {
        CloudScriptParser.self_return retval = new CloudScriptParser.self_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELF31=null;

        Object SELF31_tree=null;

        try {
            // CloudScriptParser.g:150:29: ( SELF )
            // CloudScriptParser.g:151:5: SELF
            {
            root_0 = (Object)adaptor.nil();

            SELF31=(Token)match(input,SELF,FOLLOW_SELF_in_self1007); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SELF31_tree = (Object)adaptor.create(SELF31);
            adaptor.addChild(root_0, SELF31_tree);
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
    // CloudScriptParser.g:155:1: instanceVariable returns [InstanceVariableNode node] : PRIV NAME ;
    public final CloudScriptParser.instanceVariable_return instanceVariable() throws RecognitionException {
        CloudScriptParser.instanceVariable_return retval = new CloudScriptParser.instanceVariable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIV32=null;
        Token NAME33=null;

        Object PRIV32_tree=null;
        Object NAME33_tree=null;

        try {
            // CloudScriptParser.g:155:53: ( PRIV NAME )
            // CloudScriptParser.g:156:5: PRIV NAME
            {
            root_0 = (Object)adaptor.nil();

            PRIV32=(Token)match(input,PRIV,FOLLOW_PRIV_in_instanceVariable1041); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PRIV32_tree = (Object)adaptor.create(PRIV32);
            adaptor.addChild(root_0, PRIV32_tree);
            }
            NAME33=(Token)match(input,NAME,FOLLOW_NAME_in_instanceVariable1043); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME33_tree = (Object)adaptor.create(NAME33);
            adaptor.addChild(root_0, NAME33_tree);
            }
            if ( state.backtracking==0 ) {
               retval.node = new InstanceVariableNode((NAME33!=null?NAME33.getText():null)); 
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
    // CloudScriptParser.g:160:1: call returns [Node node] : ( literal DOT )? (head= message DOT )* tail= message ;
    public final CloudScriptParser.call_return call() throws RecognitionException {
        CloudScriptParser.call_return retval = new CloudScriptParser.call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT35=null;
        Token DOT36=null;
        CloudScriptParser.message_return head = null;

        CloudScriptParser.message_return tail = null;

        CloudScriptParser.literal_return literal34 = null;


        Object DOT35_tree=null;
        Object DOT36_tree=null;

        try {
            // CloudScriptParser.g:160:25: ( ( literal DOT )? (head= message DOT )* tail= message )
            // CloudScriptParser.g:161:5: ( literal DOT )? (head= message DOT )* tail= message
            {
            root_0 = (Object)adaptor.nil();

            // CloudScriptParser.g:161:5: ( literal DOT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=SELF && LA15_0<=FLOAT)||LA15_0==STRING||LA15_0==CONSTANT||LA15_0==URL||LA15_0==PRIV) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // CloudScriptParser.g:161:6: literal DOT
                    {
                    pushFollow(FOLLOW_literal_in_call1075);
                    literal34=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal34.getTree());
                    DOT35=(Token)match(input,DOT,FOLLOW_DOT_in_call1077); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT35_tree = (Object)adaptor.create(DOT35);
                    adaptor.addChild(root_0, DOT35_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = (literal34!=null?literal34.node:null); 
                    }

                    }
                    break;

            }

            // CloudScriptParser.g:163:5: (head= message DOT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==NAME) ) {
                    int LA16_1 = input.LA(2);

                    if ( (synpred37_CloudScriptParser()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // CloudScriptParser.g:163:6: head= message DOT
            	    {
            	    pushFollow(FOLLOW_message_in_call1116);
            	    head=message();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, head.getTree());
            	    DOT36=(Token)match(input,DOT,FOLLOW_DOT_in_call1118); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT36_tree = (Object)adaptor.create(DOT36);
            	    adaptor.addChild(root_0, DOT36_tree);
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

            pushFollow(FOLLOW_message_in_call1151);
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
    // CloudScriptParser.g:169:1: message returns [CallNode node] : ( NAME | NAME OPEN_PARENT CLOSE_PARENT | NAME OPEN_PARENT arguments CLOSE_PARENT );
    public final CloudScriptParser.message_return message() throws RecognitionException {
        CloudScriptParser.message_return retval = new CloudScriptParser.message_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME37=null;
        Token NAME38=null;
        Token OPEN_PARENT39=null;
        Token CLOSE_PARENT40=null;
        Token NAME41=null;
        Token OPEN_PARENT42=null;
        Token CLOSE_PARENT44=null;
        CloudScriptParser.arguments_return arguments43 = null;


        Object NAME37_tree=null;
        Object NAME38_tree=null;
        Object OPEN_PARENT39_tree=null;
        Object CLOSE_PARENT40_tree=null;
        Object NAME41_tree=null;
        Object OPEN_PARENT42_tree=null;
        Object CLOSE_PARENT44_tree=null;

        try {
            // CloudScriptParser.g:169:32: ( NAME | NAME OPEN_PARENT CLOSE_PARENT | NAME OPEN_PARENT arguments CLOSE_PARENT )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NAME) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==OPEN_PARENT) ) {
                    int LA17_2 = input.LA(3);

                    if ( (LA17_2==CLOSE_PARENT) ) {
                        alt17=2;
                    }
                    else if ( ((LA17_2>=CLASS && LA17_2<=IF)||LA17_2==WHILE||(LA17_2>=SELF && LA17_2<=FLOAT)||LA17_2==STRING||LA17_2==NAME||LA17_2==CONSTANT||LA17_2==URL||LA17_2==OPEN_PARENT||LA17_2==PRIV||LA17_2==NOT) ) {
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
                    // CloudScriptParser.g:170:5: NAME
                    {
                    root_0 = (Object)adaptor.nil();

                    NAME37=(Token)match(input,NAME,FOLLOW_NAME_in_message1191); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME37_tree = (Object)adaptor.create(NAME37);
                    adaptor.addChild(root_0, NAME37_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((NAME37!=null?NAME37.getText():null)); 
                    }

                    }
                    break;
                case 2 :
                    // CloudScriptParser.g:171:5: NAME OPEN_PARENT CLOSE_PARENT
                    {
                    root_0 = (Object)adaptor.nil();

                    NAME38=(Token)match(input,NAME,FOLLOW_NAME_in_message1226); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME38_tree = (Object)adaptor.create(NAME38);
                    adaptor.addChild(root_0, NAME38_tree);
                    }
                    OPEN_PARENT39=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_message1228); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPEN_PARENT39_tree = (Object)adaptor.create(OPEN_PARENT39);
                    adaptor.addChild(root_0, OPEN_PARENT39_tree);
                    }
                    CLOSE_PARENT40=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_message1230); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSE_PARENT40_tree = (Object)adaptor.create(CLOSE_PARENT40);
                    adaptor.addChild(root_0, CLOSE_PARENT40_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((NAME38!=null?NAME38.getText():null), new ArrayList<Node>()); 
                    }

                    }
                    break;
                case 3 :
                    // CloudScriptParser.g:172:5: NAME OPEN_PARENT arguments CLOSE_PARENT
                    {
                    root_0 = (Object)adaptor.nil();

                    NAME41=(Token)match(input,NAME,FOLLOW_NAME_in_message1240); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME41_tree = (Object)adaptor.create(NAME41);
                    adaptor.addChild(root_0, NAME41_tree);
                    }
                    OPEN_PARENT42=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_message1242); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPEN_PARENT42_tree = (Object)adaptor.create(OPEN_PARENT42);
                    adaptor.addChild(root_0, OPEN_PARENT42_tree);
                    }
                    pushFollow(FOLLOW_arguments_in_message1255);
                    arguments43=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments43.getTree());
                    CLOSE_PARENT44=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_message1266); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSE_PARENT44_tree = (Object)adaptor.create(CLOSE_PARENT44);
                    adaptor.addChild(root_0, CLOSE_PARENT44_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((NAME41!=null?NAME41.getText():null), (arguments43!=null?arguments43.nodes:null)); 
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
    // CloudScriptParser.g:178:1: arguments returns [ArrayList<Node> nodes] : head= expression ( COMMA tail= expression )* ;
    public final CloudScriptParser.arguments_return arguments() throws RecognitionException {
        CloudScriptParser.arguments_return retval = new CloudScriptParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA45=null;
        CloudScriptParser.expression_return head = null;

        CloudScriptParser.expression_return tail = null;


        Object COMMA45_tree=null;

        try {
            // CloudScriptParser.g:178:42: (head= expression ( COMMA tail= expression )* )
            // CloudScriptParser.g:179:37: head= expression ( COMMA tail= expression )*
            {
            root_0 = (Object)adaptor.nil();

            if ( state.backtracking==0 ) {
               retval.nodes = new ArrayList<Node>(); 
            }
            pushFollow(FOLLOW_expression_in_arguments1341);
            head=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, head.getTree());
            if ( state.backtracking==0 ) {
               retval.nodes.add((head!=null?head.node:null)); 
            }
            // CloudScriptParser.g:181:5: ( COMMA tail= expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // CloudScriptParser.g:181:6: COMMA tail= expression
            	    {
            	    COMMA45=(Token)match(input,COMMA,FOLLOW_COMMA_in_arguments1366); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA45_tree = (Object)adaptor.create(COMMA45);
            	    adaptor.addChild(root_0, COMMA45_tree);
            	    }
            	    pushFollow(FOLLOW_expression_in_arguments1375);
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
    // CloudScriptParser.g:187:1: constant returns [ConstantNode node] : CONSTANT ;
    public final CloudScriptParser.constant_return constant() throws RecognitionException {
        CloudScriptParser.constant_return retval = new CloudScriptParser.constant_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTANT46=null;

        Object CONSTANT46_tree=null;

        try {
            // CloudScriptParser.g:187:37: ( CONSTANT )
            // CloudScriptParser.g:188:5: CONSTANT
            {
            root_0 = (Object)adaptor.nil();

            CONSTANT46=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant1418); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONSTANT46_tree = (Object)adaptor.create(CONSTANT46);
            adaptor.addChild(root_0, CONSTANT46_tree);
            }
            if ( state.backtracking==0 ) {
               retval.node = new ConstantNode((CONSTANT46!=null?CONSTANT46.getText():null)); 
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
    // CloudScriptParser.g:192:1: assign returns [Node node] : ( NAME ASSIGN expression | CONSTANT ASSIGN expression | PRIV NAME ASSIGN expression );
    public final CloudScriptParser.assign_return assign() throws RecognitionException {
        CloudScriptParser.assign_return retval = new CloudScriptParser.assign_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME47=null;
        Token ASSIGN48=null;
        Token CONSTANT50=null;
        Token ASSIGN51=null;
        Token PRIV53=null;
        Token NAME54=null;
        Token ASSIGN55=null;
        CloudScriptParser.expression_return expression49 = null;

        CloudScriptParser.expression_return expression52 = null;

        CloudScriptParser.expression_return expression56 = null;


        Object NAME47_tree=null;
        Object ASSIGN48_tree=null;
        Object CONSTANT50_tree=null;
        Object ASSIGN51_tree=null;
        Object PRIV53_tree=null;
        Object NAME54_tree=null;
        Object ASSIGN55_tree=null;

        try {
            // CloudScriptParser.g:192:27: ( NAME ASSIGN expression | CONSTANT ASSIGN expression | PRIV NAME ASSIGN expression )
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
            case PRIV:
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
                    // CloudScriptParser.g:193:5: NAME ASSIGN expression
                    {
                    root_0 = (Object)adaptor.nil();

                    NAME47=(Token)match(input,NAME,FOLLOW_NAME_in_assign1462); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME47_tree = (Object)adaptor.create(NAME47);
                    adaptor.addChild(root_0, NAME47_tree);
                    }
                    ASSIGN48=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1464); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN48_tree = (Object)adaptor.create(ASSIGN48);
                    adaptor.addChild(root_0, ASSIGN48_tree);
                    }
                    pushFollow(FOLLOW_expression_in_assign1466);
                    expression49=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression49.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new LocalAssignNode((NAME47!=null?NAME47.getText():null), (expression49!=null?expression49.node:null)); 
                    }

                    }
                    break;
                case 2 :
                    // CloudScriptParser.g:194:5: CONSTANT ASSIGN expression
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT50=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_assign1483); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT50_tree = (Object)adaptor.create(CONSTANT50);
                    adaptor.addChild(root_0, CONSTANT50_tree);
                    }
                    ASSIGN51=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1485); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN51_tree = (Object)adaptor.create(ASSIGN51);
                    adaptor.addChild(root_0, ASSIGN51_tree);
                    }
                    pushFollow(FOLLOW_expression_in_assign1487);
                    expression52=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression52.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new ConstantAssignNode((CONSTANT50!=null?CONSTANT50.getText():null), (expression52!=null?expression52.node:null)); 
                    }

                    }
                    break;
                case 3 :
                    // CloudScriptParser.g:195:5: PRIV NAME ASSIGN expression
                    {
                    root_0 = (Object)adaptor.nil();

                    PRIV53=(Token)match(input,PRIV,FOLLOW_PRIV_in_assign1500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRIV53_tree = (Object)adaptor.create(PRIV53);
                    adaptor.addChild(root_0, PRIV53_tree);
                    }
                    NAME54=(Token)match(input,NAME,FOLLOW_NAME_in_assign1502); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME54_tree = (Object)adaptor.create(NAME54);
                    adaptor.addChild(root_0, NAME54_tree);
                    }
                    ASSIGN55=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1504); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN55_tree = (Object)adaptor.create(ASSIGN55);
                    adaptor.addChild(root_0, ASSIGN55_tree);
                    }
                    pushFollow(FOLLOW_expression_in_assign1506);
                    expression56=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression56.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new InstanceVariableAssignNode((NAME54!=null?NAME54.getText():null), (expression56!=null?expression56.node:null)); 
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
    // CloudScriptParser.g:198:1: methodDefinition returns [MethodDefinitionNode node] : FN NAME ( OPEN_PARENT ( parameters )? CLOSE_PARENT )? terminator expressions END ;
    public final CloudScriptParser.methodDefinition_return methodDefinition() throws RecognitionException {
        CloudScriptParser.methodDefinition_return retval = new CloudScriptParser.methodDefinition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FN57=null;
        Token NAME58=null;
        Token OPEN_PARENT59=null;
        Token CLOSE_PARENT61=null;
        Token END64=null;
        CloudScriptParser.parameters_return parameters60 = null;

        CloudScriptParser.terminator_return terminator62 = null;

        CloudScriptParser.expressions_return expressions63 = null;


        Object FN57_tree=null;
        Object NAME58_tree=null;
        Object OPEN_PARENT59_tree=null;
        Object CLOSE_PARENT61_tree=null;
        Object END64_tree=null;

        try {
            // CloudScriptParser.g:198:53: ( FN NAME ( OPEN_PARENT ( parameters )? CLOSE_PARENT )? terminator expressions END )
            // CloudScriptParser.g:199:5: FN NAME ( OPEN_PARENT ( parameters )? CLOSE_PARENT )? terminator expressions END
            {
            root_0 = (Object)adaptor.nil();

            FN57=(Token)match(input,FN,FOLLOW_FN_in_methodDefinition1532); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FN57_tree = (Object)adaptor.create(FN57);
            adaptor.addChild(root_0, FN57_tree);
            }
            NAME58=(Token)match(input,NAME,FOLLOW_NAME_in_methodDefinition1534); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME58_tree = (Object)adaptor.create(NAME58);
            adaptor.addChild(root_0, NAME58_tree);
            }
            // CloudScriptParser.g:199:13: ( OPEN_PARENT ( parameters )? CLOSE_PARENT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==OPEN_PARENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // CloudScriptParser.g:199:14: OPEN_PARENT ( parameters )? CLOSE_PARENT
                    {
                    OPEN_PARENT59=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_methodDefinition1537); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPEN_PARENT59_tree = (Object)adaptor.create(OPEN_PARENT59);
                    adaptor.addChild(root_0, OPEN_PARENT59_tree);
                    }
                    // CloudScriptParser.g:199:26: ( parameters )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==NAME) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // CloudScriptParser.g:0:0: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_methodDefinition1539);
                            parameters60=parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters60.getTree());

                            }
                            break;

                    }

                    CLOSE_PARENT61=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_methodDefinition1542); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSE_PARENT61_tree = (Object)adaptor.create(CLOSE_PARENT61);
                    adaptor.addChild(root_0, CLOSE_PARENT61_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_terminator_in_methodDefinition1546);
            terminator62=terminator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator62.getTree());
            pushFollow(FOLLOW_expressions_in_methodDefinition1554);
            expressions63=expressions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressions63.getTree());
            END64=(Token)match(input,END,FOLLOW_END_in_methodDefinition1560); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END64_tree = (Object)adaptor.create(END64);
            adaptor.addChild(root_0, END64_tree);
            }
            if ( state.backtracking==0 ) {
               retval.node = new MethodDefinitionNode((NAME58!=null?NAME58.getText():null), (parameters60!=null?parameters60.names:null), (expressions63!=null?expressions63.nodes:null)); 
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
    // CloudScriptParser.g:205:1: parameters returns [ArrayList<String> names] : head= NAME ( COMMA tail= NAME )* ;
    public final CloudScriptParser.parameters_return parameters() throws RecognitionException {
        CloudScriptParser.parameters_return retval = new CloudScriptParser.parameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token head=null;
        Token tail=null;
        Token COMMA65=null;

        Object head_tree=null;
        Object tail_tree=null;
        Object COMMA65_tree=null;

        try {
            // CloudScriptParser.g:205:45: (head= NAME ( COMMA tail= NAME )* )
            // CloudScriptParser.g:206:37: head= NAME ( COMMA tail= NAME )*
            {
            root_0 = (Object)adaptor.nil();

            if ( state.backtracking==0 ) {
               retval.names = new ArrayList<String>(); 
            }
            head=(Token)match(input,NAME,FOLLOW_NAME_in_parameters1649); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            head_tree = (Object)adaptor.create(head);
            adaptor.addChild(root_0, head_tree);
            }
            if ( state.backtracking==0 ) {
               retval.names.add((head!=null?head.getText():null)); 
            }
            // CloudScriptParser.g:208:5: ( COMMA tail= NAME )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // CloudScriptParser.g:208:6: COMMA tail= NAME
            	    {
            	    COMMA65=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameters1680); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA65_tree = (Object)adaptor.create(COMMA65);
            	    adaptor.addChild(root_0, COMMA65_tree);
            	    }
            	    tail=(Token)match(input,NAME,FOLLOW_NAME_in_parameters1689); if (state.failed) return retval;
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
    // CloudScriptParser.g:213:1: classDefinition returns [ClassDefinitionNode node] : CLASS name= CONSTANT ( LT superClass= CONSTANT )? terminator expressions END ;
    public final CloudScriptParser.classDefinition_return classDefinition() throws RecognitionException {
        CloudScriptParser.classDefinition_return retval = new CloudScriptParser.classDefinition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token superClass=null;
        Token CLASS66=null;
        Token LT67=null;
        Token END70=null;
        CloudScriptParser.terminator_return terminator68 = null;

        CloudScriptParser.expressions_return expressions69 = null;


        Object name_tree=null;
        Object superClass_tree=null;
        Object CLASS66_tree=null;
        Object LT67_tree=null;
        Object END70_tree=null;

        try {
            // CloudScriptParser.g:213:51: ( CLASS name= CONSTANT ( LT superClass= CONSTANT )? terminator expressions END )
            // CloudScriptParser.g:214:5: CLASS name= CONSTANT ( LT superClass= CONSTANT )? terminator expressions END
            {
            root_0 = (Object)adaptor.nil();

            CLASS66=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDefinition1737); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS66_tree = (Object)adaptor.create(CLASS66);
            adaptor.addChild(root_0, CLASS66_tree);
            }
            name=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_classDefinition1741); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            // CloudScriptParser.g:214:25: ( LT superClass= CONSTANT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // CloudScriptParser.g:214:26: LT superClass= CONSTANT
                    {
                    LT67=(Token)match(input,LT,FOLLOW_LT_in_classDefinition1744); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT67_tree = (Object)adaptor.create(LT67);
                    adaptor.addChild(root_0, LT67_tree);
                    }
                    superClass=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_classDefinition1748); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    superClass_tree = (Object)adaptor.create(superClass);
                    adaptor.addChild(root_0, superClass_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_terminator_in_classDefinition1752);
            terminator68=terminator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator68.getTree());
            pushFollow(FOLLOW_expressions_in_classDefinition1760);
            expressions69=expressions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressions69.getTree());
            END70=(Token)match(input,END,FOLLOW_END_in_classDefinition1766); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END70_tree = (Object)adaptor.create(END70);
            adaptor.addChild(root_0, END70_tree);
            }
            if ( state.backtracking==0 ) {
               retval.node = new ClassDefinitionNode((name!=null?name.getText():null), (superClass!=null?superClass.getText():null), (expressions69!=null?expressions69.nodes:null)); 
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
    // CloudScriptParser.g:219:1: ifBlock returns [IfNode node] : IF condition= expression terminator ifBody= expressions ( ELSE terminator elseBody= expressions )? END ;
    public final CloudScriptParser.ifBlock_return ifBlock() throws RecognitionException {
        CloudScriptParser.ifBlock_return retval = new CloudScriptParser.ifBlock_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF71=null;
        Token ELSE73=null;
        Token END75=null;
        CloudScriptParser.expression_return condition = null;

        CloudScriptParser.expressions_return ifBody = null;

        CloudScriptParser.expressions_return elseBody = null;

        CloudScriptParser.terminator_return terminator72 = null;

        CloudScriptParser.terminator_return terminator74 = null;


        Object IF71_tree=null;
        Object ELSE73_tree=null;
        Object END75_tree=null;

        try {
            // CloudScriptParser.g:219:30: ( IF condition= expression terminator ifBody= expressions ( ELSE terminator elseBody= expressions )? END )
            // CloudScriptParser.g:220:5: IF condition= expression terminator ifBody= expressions ( ELSE terminator elseBody= expressions )? END
            {
            root_0 = (Object)adaptor.nil();

            IF71=(Token)match(input,IF,FOLLOW_IF_in_ifBlock1814); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF71_tree = (Object)adaptor.create(IF71);
            adaptor.addChild(root_0, IF71_tree);
            }
            pushFollow(FOLLOW_expression_in_ifBlock1818);
            condition=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition.getTree());
            pushFollow(FOLLOW_terminator_in_ifBlock1820);
            terminator72=terminator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator72.getTree());
            pushFollow(FOLLOW_expressions_in_ifBlock1830);
            ifBody=expressions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ifBody.getTree());
            // CloudScriptParser.g:222:5: ( ELSE terminator elseBody= expressions )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ELSE) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // CloudScriptParser.g:222:6: ELSE terminator elseBody= expressions
                    {
                    ELSE73=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifBlock1837); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE73_tree = (Object)adaptor.create(ELSE73);
                    adaptor.addChild(root_0, ELSE73_tree);
                    }
                    pushFollow(FOLLOW_terminator_in_ifBlock1839);
                    terminator74=terminator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator74.getTree());
                    pushFollow(FOLLOW_expressions_in_ifBlock1849);
                    elseBody=expressions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elseBody.getTree());

                    }
                    break;

            }

            END75=(Token)match(input,END,FOLLOW_END_in_ifBlock1862); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END75_tree = (Object)adaptor.create(END75);
            adaptor.addChild(root_0, END75_tree);
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
    // CloudScriptParser.g:228:1: whileBlock returns [WhileNode node] : WHILE condition= expression terminator body= expressions END ;
    public final CloudScriptParser.whileBlock_return whileBlock() throws RecognitionException {
        CloudScriptParser.whileBlock_return retval = new CloudScriptParser.whileBlock_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE76=null;
        Token END78=null;
        CloudScriptParser.expression_return condition = null;

        CloudScriptParser.expressions_return body = null;

        CloudScriptParser.terminator_return terminator77 = null;


        Object WHILE76_tree=null;
        Object END78_tree=null;

        try {
            // CloudScriptParser.g:228:36: ( WHILE condition= expression terminator body= expressions END )
            // CloudScriptParser.g:229:5: WHILE condition= expression terminator body= expressions END
            {
            root_0 = (Object)adaptor.nil();

            WHILE76=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileBlock1910); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE76_tree = (Object)adaptor.create(WHILE76);
            adaptor.addChild(root_0, WHILE76_tree);
            }
            pushFollow(FOLLOW_expression_in_whileBlock1914);
            condition=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition.getTree());
            pushFollow(FOLLOW_terminator_in_whileBlock1916);
            terminator77=terminator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator77.getTree());
            pushFollow(FOLLOW_expressions_in_whileBlock1926);
            body=expressions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body.getTree());
            END78=(Token)match(input,END,FOLLOW_END_in_whileBlock1932); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END78_tree = (Object)adaptor.create(END78);
            adaptor.addChild(root_0, END78_tree);
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

    // $ANTLR start synpred37_CloudScriptParser
    public final void synpred37_CloudScriptParser_fragment() throws RecognitionException {   
        CloudScriptParser.message_return head = null;


        // CloudScriptParser.g:163:6: (head= message DOT )
        // CloudScriptParser.g:163:6: head= message DOT
        {
        pushFollow(FOLLOW_message_in_synpred37_CloudScriptParser1116);
        head=message();

        state._fsp--;
        if (state.failed) return ;
        match(input,DOT,FOLLOW_DOT_in_synpred37_CloudScriptParser1118); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_CloudScriptParser

    // Delegated rules

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
    public final boolean synpred37_CloudScriptParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_CloudScriptParser_fragment(); // can never throw exception
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
        "\2\57\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\4\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\1\uffff\1\2\20\uffff\1\1\24\uffff\1\1",
            "\3\3\1\2\1\3\1\2\6\3\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3\1"+
            "\uffff\1\3\1\1\3\uffff\1\3\1\uffff\1\3\14\uffff\1\3\1\uffff"+
            "\1\1",
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
        "\24\uffff";
    static final String DFA7_eofS =
        "\24\uffff";
    static final String DFA7_minS =
        "\1\4\21\0\2\uffff";
    static final String DFA7_maxS =
        "\1\55\21\0\2\uffff";
    static final String DFA7_acceptS =
        "\22\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\2\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\16\1\15\1\17\1\uffff\1\20\1\uffff\1\12\1\5\1\6\1\7\1\3\1"+
            "\4\2\uffff\1\2\2\uffff\1\14\1\uffff\1\10\1\uffff\1\13\4\uffff"+
            "\1\21\1\uffff\1\11\14\uffff\1\1",
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
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_4 = input.LA(1);

                         
                        int index7_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_7 = input.LA(1);

                         
                        int index7_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA7_8 = input.LA(1);

                         
                        int index7_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA7_9 = input.LA(1);

                         
                        int index7_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA7_10 = input.LA(1);

                         
                        int index7_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA7_11 = input.LA(1);

                         
                        int index7_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA7_12 = input.LA(1);

                         
                        int index7_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA7_13 = input.LA(1);

                         
                        int index7_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA7_14 = input.LA(1);

                         
                        int index7_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA7_15 = input.LA(1);

                         
                        int index7_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA7_16 = input.LA(1);

                         
                        int index7_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA7_17 = input.LA(1);

                         
                        int index7_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index7_17);
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
        "\24\uffff";
    static final String DFA8_eofS =
        "\24\uffff";
    static final String DFA8_minS =
        "\1\4\21\0\2\uffff";
    static final String DFA8_maxS =
        "\1\55\21\0\2\uffff";
    static final String DFA8_acceptS =
        "\22\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\2\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\16\1\15\1\17\1\uffff\1\20\1\uffff\1\12\1\5\1\6\1\7\1\3\1"+
            "\4\2\uffff\1\2\2\uffff\1\14\1\uffff\1\10\1\uffff\1\13\4\uffff"+
            "\1\21\1\uffff\1\11\14\uffff\1\1",
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
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_8 = input.LA(1);

                         
                        int index8_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA8_9 = input.LA(1);

                         
                        int index8_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA8_10 = input.LA(1);

                         
                        int index8_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA8_11 = input.LA(1);

                         
                        int index8_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA8_12 = input.LA(1);

                         
                        int index8_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA8_13 = input.LA(1);

                         
                        int index8_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA8_14 = input.LA(1);

                         
                        int index8_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA8_15 = input.LA(1);

                         
                        int index8_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA8_16 = input.LA(1);

                         
                        int index8_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA8_17 = input.LA(1);

                         
                        int index8_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index8_17);
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
        "\24\uffff";
    static final String DFA9_eofS =
        "\24\uffff";
    static final String DFA9_minS =
        "\1\4\21\0\2\uffff";
    static final String DFA9_maxS =
        "\1\55\21\0\2\uffff";
    static final String DFA9_acceptS =
        "\22\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\16\1\15\1\17\1\uffff\1\20\1\uffff\1\12\1\5\1\6\1\7\1\3\1"+
            "\4\2\uffff\1\2\2\uffff\1\14\1\uffff\1\10\1\uffff\1\13\4\uffff"+
            "\1\21\1\uffff\1\11\14\uffff\1\1",
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
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_9 = input.LA(1);

                         
                        int index9_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA9_10 = input.LA(1);

                         
                        int index9_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA9_11 = input.LA(1);

                         
                        int index9_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA9_12 = input.LA(1);

                         
                        int index9_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA9_13 = input.LA(1);

                         
                        int index9_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA9_14 = input.LA(1);

                         
                        int index9_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA9_15 = input.LA(1);

                         
                        int index9_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA9_16 = input.LA(1);

                         
                        int index9_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA9_17 = input.LA(1);

                         
                        int index9_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index9_17);
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
        "\24\uffff";
    static final String DFA10_eofS =
        "\24\uffff";
    static final String DFA10_minS =
        "\1\4\21\0\2\uffff";
    static final String DFA10_maxS =
        "\1\55\21\0\2\uffff";
    static final String DFA10_acceptS =
        "\22\uffff\1\1\1\2";
    static final String DFA10_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\2\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\16\1\15\1\17\1\uffff\1\20\1\uffff\1\12\1\5\1\6\1\7\1\3\1"+
            "\4\2\uffff\1\2\2\uffff\1\14\1\uffff\1\10\1\uffff\1\13\4\uffff"+
            "\1\21\1\uffff\1\11\14\uffff\1\1",
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
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA10_9 = input.LA(1);

                         
                        int index10_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA10_10 = input.LA(1);

                         
                        int index10_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA10_11 = input.LA(1);

                         
                        int index10_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA10_12 = input.LA(1);

                         
                        int index10_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA10_13 = input.LA(1);

                         
                        int index10_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA10_14 = input.LA(1);

                         
                        int index10_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA10_15 = input.LA(1);

                         
                        int index10_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA10_16 = input.LA(1);

                         
                        int index10_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA10_17 = input.LA(1);

                         
                        int index10_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index10_17);
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
        "\24\uffff";
    static final String DFA11_eofS =
        "\24\uffff";
    static final String DFA11_minS =
        "\1\4\21\0\2\uffff";
    static final String DFA11_maxS =
        "\1\55\21\0\2\uffff";
    static final String DFA11_acceptS =
        "\22\uffff\1\1\1\2";
    static final String DFA11_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\2\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\16\1\15\1\17\1\uffff\1\20\1\uffff\1\12\1\5\1\6\1\7\1\3\1"+
            "\4\2\uffff\1\2\2\uffff\1\14\1\uffff\1\10\1\uffff\1\13\4\uffff"+
            "\1\21\1\uffff\1\11\14\uffff\1\1",
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
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_12 = input.LA(1);

                         
                        int index11_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_13 = input.LA(1);

                         
                        int index11_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_15 = input.LA(1);

                         
                        int index11_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA11_16 = input.LA(1);

                         
                        int index11_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA11_17 = input.LA(1);

                         
                        int index11_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_CloudScriptParser()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index11_17);
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
        "\23\uffff";
    static final String DFA13_eofS =
        "\1\uffff\7\21\1\uffff\2\21\7\uffff\1\21";
    static final String DFA13_minS =
        "\1\4\7\7\1\25\2\7\7\uffff\1\7";
    static final String DFA13_maxS =
        "\1\40\7\57\1\25\2\57\7\uffff\1\57";
    static final String DFA13_acceptS =
        "\13\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\1\1\uffff";
    static final String DFA13_specialS =
        "\23\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\15\1\14\1\16\1\uffff\1\17\1\uffff\1\11\1\4\1\5\1\6\1\2\1"+
            "\3\2\uffff\1\1\2\uffff\1\13\1\uffff\1\7\1\uffff\1\12\4\uffff"+
            "\1\20\1\uffff\1\10",
            "\1\21\1\uffff\1\21\20\uffff\1\21\1\uffff\1\13\1\21\1\uffff"+
            "\1\21\1\uffff\14\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\20\uffff\1\21\1\uffff\1\13\1\21\1\uffff"+
            "\1\21\1\uffff\14\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\20\uffff\1\21\1\uffff\1\13\1\21\1\uffff"+
            "\1\21\1\uffff\14\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\20\uffff\1\21\1\uffff\1\13\1\21\1\uffff"+
            "\1\21\1\uffff\14\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\20\uffff\1\21\1\uffff\1\13\1\21\1\uffff"+
            "\1\21\1\uffff\14\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\20\uffff\1\21\1\uffff\1\13\1\21\1\uffff"+
            "\1\21\1\uffff\14\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\20\uffff\1\21\1\uffff\1\13\1\21\1\uffff"+
            "\1\21\1\uffff\14\21\2\uffff\1\21",
            "\1\22",
            "\1\21\1\uffff\1\21\20\uffff\1\21\1\uffff\1\13\1\21\1\uffff"+
            "\1\21\1\uffff\14\21\2\uffff\1\21",
            "\1\21\1\uffff\1\21\20\uffff\1\21\1\uffff\1\13\1\21\1\uffff"+
            "\1\21\1\uffff\14\21\2\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21\1\uffff\1\21\20\uffff\1\21\1\uffff\1\13\1\21\1\uffff"+
            "\1\21\1\uffff\14\21\2\uffff\1\21"
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
 

    public static final BitSet FOLLOW_terminator_in_root77 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_expressions_in_root80 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_root83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressions131 = new BitSet(new long[]{0x0000800004000002L});
    public static final BitSet FOLLOW_terminator_in_expressions142 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_expression_in_expressions151 = new BitSet(new long[]{0x0000800004000002L});
    public static final BitSet FOLLOW_terminator_in_expressions167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expression187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_terminator205 = new BitSet(new long[]{0x0000800004000002L});
    public static final BitSet FOLLOW_assign_in_assignExpression231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_assignExpression256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression285 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_OR_in_orExpression293 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_orExpression_in_orExpression297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_andExpression347 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AND_in_andExpression355 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_andExpression_in_andExpression359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_andExpression373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression400 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_set_in_relationalExpression410 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_relationalExpression_in_relationalExpression430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression470 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_set_in_additiveExpression480 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_additiveExpression_in_additiveExpression488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression536 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression546 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_multiplicativeExpression556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryExpression618 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_primaryExpression692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_primaryExpression713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_primaryExpression722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifBlock_in_primaryExpression732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileBlock_in_primaryExpression750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_primaryExpression765 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_expression_in_primaryExpression773 = new BitSet(new long[]{0x0000000080000000L});
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
    public static final BitSet FOLLOW_URL_in_literal972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELF_in_self1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIV_in_instanceVariable1041 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NAME_in_instanceVariable1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_call1075 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_DOT_in_call1077 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_message_in_call1116 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_DOT_in_call1118 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_message_in_call1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_message1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_message1226 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_message1228 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_message1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_message1240 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_message1242 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_arguments_in_message1255 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_message1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arguments1341 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_arguments1366 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_expression_in_arguments1375 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_CONSTANT_in_constant1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_assign1462 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assign1464 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_expression_in_assign1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_assign1483 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assign1485 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_expression_in_assign1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIV_in_assign1500 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NAME_in_assign1502 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assign1504 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_expression_in_assign1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FN_in_methodDefinition1532 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NAME_in_methodDefinition1534 = new BitSet(new long[]{0x0000800044000000L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_methodDefinition1537 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_parameters_in_methodDefinition1539 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_methodDefinition1542 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_terminator_in_methodDefinition1546 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_expressions_in_methodDefinition1554 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_END_in_methodDefinition1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_parameters1649 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_parameters1680 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NAME_in_parameters1689 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_CLASS_in_classDefinition1737 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONSTANT_in_classDefinition1741 = new BitSet(new long[]{0x0000801004000000L});
    public static final BitSet FOLLOW_LT_in_classDefinition1744 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONSTANT_in_classDefinition1748 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_terminator_in_classDefinition1752 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_expressions_in_classDefinition1760 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_END_in_classDefinition1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifBlock1814 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_expression_in_ifBlock1818 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_terminator_in_ifBlock1820 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_expressions_in_ifBlock1830 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_ELSE_in_ifBlock1837 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_terminator_in_ifBlock1839 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_expressions_in_ifBlock1849 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_END_in_ifBlock1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileBlock1910 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_expression_in_whileBlock1914 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_terminator_in_whileBlock1916 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_expressions_in_whileBlock1926 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_END_in_whileBlock1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_synpred8_CloudScriptParser285 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_OR_in_synpred8_CloudScriptParser293 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_orExpression_in_synpred8_CloudScriptParser297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_synpred9_CloudScriptParser347 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AND_in_synpred9_CloudScriptParser355 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_andExpression_in_synpred9_CloudScriptParser359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_synpred14_CloudScriptParser400 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_set_in_synpred14_CloudScriptParser410 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_relationalExpression_in_synpred14_CloudScriptParser430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_synpred16_CloudScriptParser470 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_set_in_synpred16_CloudScriptParser480 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_additiveExpression_in_synpred16_CloudScriptParser488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_synpred19_CloudScriptParser536 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_set_in_synpred19_CloudScriptParser546 = new BitSet(new long[]{0x0000200142A4FD70L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_synpred19_CloudScriptParser556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_in_synpred37_CloudScriptParser1116 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_DOT_in_synpred37_CloudScriptParser1118 = new BitSet(new long[]{0x0000000000000002L});

}