grammar Formula;

@header {
package com.github.tacigar.qalculator.parser;
}

plusMinusExp
  : plusMinusExp PLUS timesDivExp   # Plus
  | plusMinusExp MINUS timesDivExp  # Minus
  | timesDivExp                     # ToTimesDiv
  ;

timesDivExp
  : timesDivExp TIMES value         # Times
  | timesDivExp DIV value           # Div
  | value                           # ToValue
  ;

value
  : MINUS? DIGIT + (DOT DIGIT +)?   # Number
  | LPAREN plusMinusExp RPAREN      # Paren
  ;

LPAREN : '(';
RPAREN : ')';
PLUS   : '+';
MINUS  : '-';
TIMES  : '×';
DIV    : '/';
DOT    : '.';
DIGIT  : ('0' .. '9');