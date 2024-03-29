lexer grammar CloudScriptLexer;

// Stuff added on top of the Lexer class.
@header { package cloudscript.lang; }

// Methods added to the Lexer class.
@members {
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
}

// Keywords
                    // {...}?=> to allow keyword as method name
CLASS:              {!methodMode}?=> 'class';
FN:                 {!methodMode}?=> 'fn';
IF:                 {!methodMode}?=> 'if';
ELSE:               {!methodMode}?=> 'else';
WHILE:              {!methodMode}?=> 'while';
END:                {!methodMode}?=> 'end';
SELF:               {!methodMode}?=> 'self';
NIL:                {!methodMode}?=> 'nil';
TRUE:               {!methodMode}?=> 'true';
FALSE:              {!methodMode}?=> 'false';


// Literals
fragment INTEGER:;
fragment FLOAT:;
NUMBER:             '-'? DIGIT+
                      // Fix ambiguity with dot for message sending (DOT NAME).
                      ( {isNum(input.LA(2))}?=> '.' DIGIT+  { $type = FLOAT; }
                      |                                     { $type = INTEGER; }
                      );
STRING:             '"' ~('\\' | '"')* '"';
NAME:               LOWER ID_CHAR* ('!' | '?')? { methodMode = false; };
CONSTANT:           UPPER ID_CHAR*;
URL:				('http://' | 'https://') URL_CHAR*;

// Operators
SEMICOLON:          ';';
COLON:              ':';
DOT:                '.' { methodMode = true; };
COMMA:              ',';
OPEN_PARENT:        '(';
CLOSE_PARENT:       ')';
PRIV:               '_';
EQ:                 '==';
LE:                 '<=';
GE:                 '>=';
LT:                 '<';
GT:                 '>';
PLUS:               '+';
MINUS:              '-';
MUL:                '*';
DIV:                '/';
MOD:                '%';
AND:                '&&';
OR:                 '||';
NOT:                '!';
ASSIGN:             '=';

COMMENT:            '#' ~('\r' | '\n')* (NEWLINE | EOF) { skip(); };

NEWLINE:            '\r'? '\n';
WHITESPACE:         SPACE+ { $channel = HIDDEN; }; // ignore whitespace

fragment LETTER:    LOWER | UPPER;
fragment ID_CHAR:   LETTER | DIGIT | '_';
fragment LOWER:     'a'..'z';
fragment UPPER:     'A'..'Z';
fragment DIGIT:     '0'..'9';
fragment SPACE:     ' ' | '\t';
fragment URL_CHAR:	'a'..'z' | 'A'..'Z' | '0'..'9' | '-' | '+' | '?' | '&' | '_' | '%' | '.' | '/';
