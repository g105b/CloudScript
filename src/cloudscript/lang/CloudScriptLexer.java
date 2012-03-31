// $ANTLR 3.1.1 CloudScriptLexer.g 2012-03-31 15:38:20
 package cloudscript.lang; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CloudScriptLexer extends Lexer {
    public static final int CLASS=4;
    public static final int LT=34;
    public static final int WHILE=8;
    public static final int LETTER=49;
    public static final int MOD=40;
    public static final int ID_CHAR=20;
    public static final int FLOAT=15;
    public static final int NOT=43;
    public static final int AND=41;
    public static final int SPACE=47;
    public static final int EOF=-1;
    public static final int IF=6;
    public static final int NAME=21;
    public static final int COMMA=27;
    public static final int PLUS=36;
    public static final int DIGIT=16;
    public static final int EQ=31;
    public static final int COMMENT=46;
    public static final int DOT=26;
    public static final int INTEGER=14;
    public static final int GE=33;
    public static final int PRIV=30;
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

      boolean methodMode = false; // true if we're waiting for a method name

      public Token nextToken() {
        Token t = super.nextToken();
        // DEBUG Uncomment to output tokens
        // System.out.println("TOKEN> " + t);
        return t;
      }
      
      public boolean isNum(int c) {
        return c>='0' && c<='9';
      }
      
      @Override
      public void reportError(RecognitionException e) {
        throw new RuntimeException(e);
      }


    // delegates
    // delegators

    public CloudScriptLexer() {;} 
    public CloudScriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CloudScriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "CloudScriptLexer.g"; }

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:29:6: ({...}? => 'class' )
            // CloudScriptLexer.g:29:21: {...}? => 'class'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "CLASS", "!methodMode");
            }
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "FN"
    public final void mFN() throws RecognitionException {
        try {
            int _type = FN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:30:3: ({...}? => 'fn' )
            // CloudScriptLexer.g:30:21: {...}? => 'fn'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "FN", "!methodMode");
            }
            match("fn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FN"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:31:3: ({...}? => 'if' )
            // CloudScriptLexer.g:31:21: {...}? => 'if'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "IF", "!methodMode");
            }
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:32:5: ({...}? => 'else' )
            // CloudScriptLexer.g:32:21: {...}? => 'else'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "ELSE", "!methodMode");
            }
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:33:6: ({...}? => 'while' )
            // CloudScriptLexer.g:33:21: {...}? => 'while'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "WHILE", "!methodMode");
            }
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:34:4: ({...}? => 'end' )
            // CloudScriptLexer.g:34:21: {...}? => 'end'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "END", "!methodMode");
            }
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "SELF"
    public final void mSELF() throws RecognitionException {
        try {
            int _type = SELF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:35:5: ({...}? => 'self' )
            // CloudScriptLexer.g:35:21: {...}? => 'self'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "SELF", "!methodMode");
            }
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELF"

    // $ANTLR start "NIL"
    public final void mNIL() throws RecognitionException {
        try {
            int _type = NIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:36:4: ({...}? => 'nil' )
            // CloudScriptLexer.g:36:21: {...}? => 'nil'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "NIL", "!methodMode");
            }
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NIL"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:37:5: ({...}? => 'true' )
            // CloudScriptLexer.g:37:21: {...}? => 'true'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "TRUE", "!methodMode");
            }
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:38:6: ({...}? => 'false' )
            // CloudScriptLexer.g:38:21: {...}? => 'false'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "FALSE", "!methodMode");
            }
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            // CloudScriptLexer.g:42:17: ()
            // CloudScriptLexer.g:42:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            // CloudScriptLexer.g:43:15: ()
            // CloudScriptLexer.g:43:16: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:44:7: ( ( '-' )? ( DIGIT )+ ({...}? => '.' ( DIGIT )+ | ) )
            // CloudScriptLexer.g:44:21: ( '-' )? ( DIGIT )+ ({...}? => '.' ( DIGIT )+ | )
            {
            // CloudScriptLexer.g:44:21: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // CloudScriptLexer.g:44:21: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // CloudScriptLexer.g:44:26: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // CloudScriptLexer.g:44:26: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // CloudScriptLexer.g:46:23: ({...}? => '.' ( DIGIT )+ | )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') && ((isNum(input.LA(2))))) {
                alt4=1;
            }
            else {
                alt4=2;}
            switch (alt4) {
                case 1 :
                    // CloudScriptLexer.g:46:25: {...}? => '.' ( DIGIT )+
                    {
                    if ( !((isNum(input.LA(2)))) ) {
                        throw new FailedPredicateException(input, "NUMBER", "isNum(input.LA(2))");
                    }
                    match('.'); 
                    // CloudScriptLexer.g:46:53: ( DIGIT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // CloudScriptLexer.g:46:53: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                     _type = FLOAT; 

                    }
                    break;
                case 2 :
                    // CloudScriptLexer.g:47:61: 
                    {
                     _type = INTEGER; 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:49:7: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
            // CloudScriptLexer.g:49:21: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // CloudScriptLexer.g:49:25: (~ ( '\\\\' | '\"' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // CloudScriptLexer.g:49:25: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:50:5: ( LOWER ( ID_CHAR )* ( '!' | '?' )? )
            // CloudScriptLexer.g:50:21: LOWER ( ID_CHAR )* ( '!' | '?' )?
            {
            mLOWER(); 
            // CloudScriptLexer.g:50:27: ( ID_CHAR )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // CloudScriptLexer.g:50:27: ID_CHAR
            	    {
            	    mID_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // CloudScriptLexer.g:50:36: ( '!' | '?' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='!'||LA7_0=='?') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // CloudScriptLexer.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

             methodMode = false; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "CONSTANT"
    public final void mCONSTANT() throws RecognitionException {
        try {
            int _type = CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:51:9: ( UPPER ( ID_CHAR )* )
            // CloudScriptLexer.g:51:21: UPPER ( ID_CHAR )*
            {
            mUPPER(); 
            // CloudScriptLexer.g:51:27: ( ID_CHAR )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // CloudScriptLexer.g:51:27: ID_CHAR
            	    {
            	    mID_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTANT"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:54:10: ( ';' )
            // CloudScriptLexer.g:54:21: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:55:6: ( ':' )
            // CloudScriptLexer.g:55:21: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:56:4: ( '.' )
            // CloudScriptLexer.g:56:21: '.'
            {
            match('.'); 
             methodMode = true; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:57:6: ( ',' )
            // CloudScriptLexer.g:57:21: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "OPEN_PARENT"
    public final void mOPEN_PARENT() throws RecognitionException {
        try {
            int _type = OPEN_PARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:58:12: ( '(' )
            // CloudScriptLexer.g:58:21: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_PARENT"

    // $ANTLR start "CLOSE_PARENT"
    public final void mCLOSE_PARENT() throws RecognitionException {
        try {
            int _type = CLOSE_PARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:59:13: ( ')' )
            // CloudScriptLexer.g:59:21: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_PARENT"

    // $ANTLR start "PRIV"
    public final void mPRIV() throws RecognitionException {
        try {
            int _type = PRIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:60:5: ( '_' )
            // CloudScriptLexer.g:60:21: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIV"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:61:3: ( '==' )
            // CloudScriptLexer.g:61:21: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:62:3: ( '<=' )
            // CloudScriptLexer.g:62:21: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:63:3: ( '>=' )
            // CloudScriptLexer.g:63:21: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:64:3: ( '<' )
            // CloudScriptLexer.g:64:21: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:65:3: ( '>' )
            // CloudScriptLexer.g:65:21: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:66:5: ( '+' )
            // CloudScriptLexer.g:66:21: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:67:6: ( '-' )
            // CloudScriptLexer.g:67:21: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:68:4: ( '*' )
            // CloudScriptLexer.g:68:21: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:69:4: ( '/' )
            // CloudScriptLexer.g:69:21: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:70:4: ( '%' )
            // CloudScriptLexer.g:70:21: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:71:4: ( '&&' )
            // CloudScriptLexer.g:71:21: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:72:3: ( '||' )
            // CloudScriptLexer.g:72:21: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:73:4: ( '!' )
            // CloudScriptLexer.g:73:21: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:74:7: ( '=' )
            // CloudScriptLexer.g:74:21: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:76:8: ( '#' (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF ) )
            // CloudScriptLexer.g:76:21: '#' (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF )
            {
            match('#'); 
            // CloudScriptLexer.g:76:25: (~ ( '\\r' | '\\n' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // CloudScriptLexer.g:76:25: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // CloudScriptLexer.g:76:41: ( NEWLINE | EOF )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            else {
                alt10=2;}
            switch (alt10) {
                case 1 :
                    // CloudScriptLexer.g:76:42: NEWLINE
                    {
                    mNEWLINE(); 

                    }
                    break;
                case 2 :
                    // CloudScriptLexer.g:76:52: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:78:8: ( ( '\\r' )? '\\n' )
            // CloudScriptLexer.g:78:21: ( '\\r' )? '\\n'
            {
            // CloudScriptLexer.g:78:21: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // CloudScriptLexer.g:78:21: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CloudScriptLexer.g:79:11: ( ( SPACE )+ )
            // CloudScriptLexer.g:79:21: ( SPACE )+
            {
            // CloudScriptLexer.g:79:21: ( SPACE )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\t'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // CloudScriptLexer.g:79:21: SPACE
            	    {
            	    mSPACE(); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // CloudScriptLexer.g:81:16: ( LOWER | UPPER )
            // CloudScriptLexer.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "ID_CHAR"
    public final void mID_CHAR() throws RecognitionException {
        try {
            // CloudScriptLexer.g:82:17: ( LETTER | DIGIT | '_' )
            // CloudScriptLexer.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ID_CHAR"

    // $ANTLR start "LOWER"
    public final void mLOWER() throws RecognitionException {
        try {
            // CloudScriptLexer.g:83:15: ( 'a' .. 'z' )
            // CloudScriptLexer.g:83:21: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LOWER"

    // $ANTLR start "UPPER"
    public final void mUPPER() throws RecognitionException {
        try {
            // CloudScriptLexer.g:84:15: ( 'A' .. 'Z' )
            // CloudScriptLexer.g:84:21: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UPPER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // CloudScriptLexer.g:85:15: ( '0' .. '9' )
            // CloudScriptLexer.g:85:21: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            // CloudScriptLexer.g:86:15: ( ' ' | '\\t' )
            // CloudScriptLexer.g:
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SPACE"

    public void mTokens() throws RecognitionException {
        // CloudScriptLexer.g:1:8: ( CLASS | FN | IF | ELSE | WHILE | END | SELF | NIL | TRUE | FALSE | NUMBER | STRING | NAME | CONSTANT | SEMICOLON | COLON | DOT | COMMA | OPEN_PARENT | CLOSE_PARENT | PRIV | EQ | LE | GE | LT | GT | PLUS | MINUS | MUL | DIV | MOD | AND | OR | NOT | ASSIGN | COMMENT | NEWLINE | WHITESPACE )
        int alt13=38;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // CloudScriptLexer.g:1:10: CLASS
                {
                mCLASS(); 

                }
                break;
            case 2 :
                // CloudScriptLexer.g:1:16: FN
                {
                mFN(); 

                }
                break;
            case 3 :
                // CloudScriptLexer.g:1:19: IF
                {
                mIF(); 

                }
                break;
            case 4 :
                // CloudScriptLexer.g:1:22: ELSE
                {
                mELSE(); 

                }
                break;
            case 5 :
                // CloudScriptLexer.g:1:27: WHILE
                {
                mWHILE(); 

                }
                break;
            case 6 :
                // CloudScriptLexer.g:1:33: END
                {
                mEND(); 

                }
                break;
            case 7 :
                // CloudScriptLexer.g:1:37: SELF
                {
                mSELF(); 

                }
                break;
            case 8 :
                // CloudScriptLexer.g:1:42: NIL
                {
                mNIL(); 

                }
                break;
            case 9 :
                // CloudScriptLexer.g:1:46: TRUE
                {
                mTRUE(); 

                }
                break;
            case 10 :
                // CloudScriptLexer.g:1:51: FALSE
                {
                mFALSE(); 

                }
                break;
            case 11 :
                // CloudScriptLexer.g:1:57: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 12 :
                // CloudScriptLexer.g:1:64: STRING
                {
                mSTRING(); 

                }
                break;
            case 13 :
                // CloudScriptLexer.g:1:71: NAME
                {
                mNAME(); 

                }
                break;
            case 14 :
                // CloudScriptLexer.g:1:76: CONSTANT
                {
                mCONSTANT(); 

                }
                break;
            case 15 :
                // CloudScriptLexer.g:1:85: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 16 :
                // CloudScriptLexer.g:1:95: COLON
                {
                mCOLON(); 

                }
                break;
            case 17 :
                // CloudScriptLexer.g:1:101: DOT
                {
                mDOT(); 

                }
                break;
            case 18 :
                // CloudScriptLexer.g:1:105: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 19 :
                // CloudScriptLexer.g:1:111: OPEN_PARENT
                {
                mOPEN_PARENT(); 

                }
                break;
            case 20 :
                // CloudScriptLexer.g:1:123: CLOSE_PARENT
                {
                mCLOSE_PARENT(); 

                }
                break;
            case 21 :
                // CloudScriptLexer.g:1:136: PRIV
                {
                mPRIV(); 

                }
                break;
            case 22 :
                // CloudScriptLexer.g:1:141: EQ
                {
                mEQ(); 

                }
                break;
            case 23 :
                // CloudScriptLexer.g:1:144: LE
                {
                mLE(); 

                }
                break;
            case 24 :
                // CloudScriptLexer.g:1:147: GE
                {
                mGE(); 

                }
                break;
            case 25 :
                // CloudScriptLexer.g:1:150: LT
                {
                mLT(); 

                }
                break;
            case 26 :
                // CloudScriptLexer.g:1:153: GT
                {
                mGT(); 

                }
                break;
            case 27 :
                // CloudScriptLexer.g:1:156: PLUS
                {
                mPLUS(); 

                }
                break;
            case 28 :
                // CloudScriptLexer.g:1:161: MINUS
                {
                mMINUS(); 

                }
                break;
            case 29 :
                // CloudScriptLexer.g:1:167: MUL
                {
                mMUL(); 

                }
                break;
            case 30 :
                // CloudScriptLexer.g:1:171: DIV
                {
                mDIV(); 

                }
                break;
            case 31 :
                // CloudScriptLexer.g:1:175: MOD
                {
                mMOD(); 

                }
                break;
            case 32 :
                // CloudScriptLexer.g:1:179: AND
                {
                mAND(); 

                }
                break;
            case 33 :
                // CloudScriptLexer.g:1:183: OR
                {
                mOR(); 

                }
                break;
            case 34 :
                // CloudScriptLexer.g:1:186: NOT
                {
                mNOT(); 

                }
                break;
            case 35 :
                // CloudScriptLexer.g:1:190: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 36 :
                // CloudScriptLexer.g:1:197: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 37 :
                // CloudScriptLexer.g:1:205: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 38 :
                // CloudScriptLexer.g:1:213: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\10\14\1\54\13\uffff\1\56\1\60\1\62\12\uffff\1\14\1\64\1"+
        "\14\1\66\6\14\7\uffff\1\14\1\uffff\1\14\1\uffff\1\14\1\102\2\14"+
        "\1\105\2\14\1\uffff\1\14\1\uffff\1\111\1\uffff\1\14\1\114\1\uffff"+
        "\1\116\1\117\1\120\2\uffff\1\122\14\uffff";
    static final String DFA13_eofS =
        "\130\uffff";
    static final String DFA13_minS =
        "\1\11\1\154\1\141\1\146\1\154\1\150\1\145\1\151\1\162\1\60\13\uffff"+
        "\3\75\12\uffff\1\141\1\41\1\154\1\41\1\163\1\144\1\151\2\154\1\165"+
        "\7\uffff\1\163\1\0\1\163\1\0\1\145\1\41\1\154\1\146\1\41\1\145\1"+
        "\163\1\uffff\1\145\1\uffff\1\41\1\0\1\145\1\41\1\0\3\41\1\0\1\uffff"+
        "\1\41\1\0\1\uffff\3\0\1\uffff\1\0\5\uffff";
    static final String DFA13_maxS =
        "\1\174\1\154\1\156\1\146\1\156\1\150\1\145\1\151\1\162\1\71\13\uffff"+
        "\3\75\12\uffff\1\141\1\172\1\154\1\172\1\163\1\144\1\151\2\154\1"+
        "\165\7\uffff\1\163\1\0\1\163\1\0\1\145\1\172\1\154\1\146\1\172\1"+
        "\145\1\163\1\uffff\1\145\1\uffff\1\172\1\0\1\145\1\172\1\0\3\172"+
        "\1\0\1\uffff\1\172\1\0\1\uffff\3\0\1\uffff\1\0\5\uffff";
    static final String DFA13_acceptS =
        "\12\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
        "\3\uffff\1\33\1\35\1\36\1\37\1\40\1\41\1\42\1\44\1\45\1\46\12\uffff"+
        "\1\34\1\26\1\43\1\27\1\31\1\30\1\32\13\uffff\1\2\1\uffff\1\3\11"+
        "\uffff\1\6\2\uffff\1\10\3\uffff\1\4\1\uffff\1\7\1\11\1\1\1\12\1"+
        "\5";
    static final String DFA13_specialS =
        "\64\uffff\1\3\1\uffff\1\0\13\uffff\1\6\2\uffff\1\4\3\uffff\1\1\2"+
        "\uffff\1\5\1\uffff\1\11\1\2\1\10\1\uffff\1\7\5\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\41\1\40\2\uffff\1\40\22\uffff\1\41\1\36\1\13\1\37\1\uffff"+
            "\1\33\1\34\1\uffff\1\22\1\23\1\31\1\30\1\21\1\11\1\20\1\32\12"+
            "\12\1\17\1\16\1\26\1\25\1\27\2\uffff\32\15\4\uffff\1\24\1\uffff"+
            "\2\14\1\1\1\14\1\4\1\2\2\14\1\3\4\14\1\7\4\14\1\6\1\10\2\14"+
            "\1\5\3\14\1\uffff\1\35",
            "\1\42",
            "\1\44\14\uffff\1\43",
            "\1\45",
            "\1\46\1\uffff\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\12\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\57",
            "\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "\1\14\16\uffff\12\14\5\uffff\1\14\1\uffff\32\14\4\uffff\1\14"+
            "\1\uffff\32\14",
            "\1\65",
            "\1\14\16\uffff\12\14\5\uffff\1\14\1\uffff\32\14\4\uffff\1\14"+
            "\1\uffff\32\14",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "\1\uffff",
            "\1\77",
            "\1\uffff",
            "\1\101",
            "\1\14\16\uffff\12\14\5\uffff\1\14\1\uffff\32\14\4\uffff\1\14"+
            "\1\uffff\32\14",
            "\1\103",
            "\1\104",
            "\1\14\16\uffff\12\14\5\uffff\1\14\1\uffff\32\14\4\uffff\1\14"+
            "\1\uffff\32\14",
            "\1\106",
            "\1\107",
            "",
            "\1\110",
            "",
            "\1\14\16\uffff\12\14\5\uffff\1\14\1\uffff\32\14\4\uffff\1\14"+
            "\1\uffff\32\14",
            "\1\uffff",
            "\1\113",
            "\1\14\16\uffff\12\14\5\uffff\1\14\1\uffff\32\14\4\uffff\1\14"+
            "\1\uffff\32\14",
            "\1\uffff",
            "\1\14\16\uffff\12\14\5\uffff\1\14\1\uffff\32\14\4\uffff\1\14"+
            "\1\uffff\32\14",
            "\1\14\16\uffff\12\14\5\uffff\1\14\1\uffff\32\14\4\uffff\1\14"+
            "\1\uffff\32\14",
            "\1\14\16\uffff\12\14\5\uffff\1\14\1\uffff\32\14\4\uffff\1\14"+
            "\1\uffff\32\14",
            "\1\uffff",
            "",
            "\1\14\16\uffff\12\14\5\uffff\1\14\1\uffff\32\14\4\uffff\1\14"+
            "\1\uffff\32\14",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
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
            return "1:1: Tokens : ( CLASS | FN | IF | ELSE | WHILE | END | SELF | NIL | TRUE | FALSE | NUMBER | STRING | NAME | CONSTANT | SEMICOLON | COLON | DOT | COMMA | OPEN_PARENT | CLOSE_PARENT | PRIV | EQ | LE | GE | LT | GT | PLUS | MINUS | MUL | DIV | MOD | AND | OR | NOT | ASSIGN | COMMENT | NEWLINE | WHITESPACE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_54 = input.LA(1);

                         
                        int index13_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 64;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index13_54);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_73 = input.LA(1);

                         
                        int index13_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 81;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index13_73);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_79 = input.LA(1);

                         
                        int index13_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 85;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index13_79);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_52 = input.LA(1);

                         
                        int index13_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 62;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index13_52);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_69 = input.LA(1);

                         
                        int index13_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 77;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index13_69);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_76 = input.LA(1);

                         
                        int index13_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 83;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index13_76);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_66 = input.LA(1);

                         
                        int index13_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 74;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index13_66);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_82 = input.LA(1);

                         
                        int index13_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 87;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index13_82);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_80 = input.LA(1);

                         
                        int index13_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 86;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index13_80);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_78 = input.LA(1);

                         
                        int index13_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 84;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index13_78);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}