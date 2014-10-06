package com.nraynaud.ada;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.nraynaud.ada.psi.AdaTypes;
%%
%class AdaLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}
DIGIT = [0-9]
EXTENDED_DIGIT = [0-9a-zA-Z]
INTEGER = ({DIGIT}(_?{DIGIT})*)
EXPONENT = ([eE](\+?|-){INTEGER})
DECIMAL_LITERAL = {INTEGER}(\.?{INTEGER})?{EXPONENT}?
BASE = {INTEGER}
BASED_INTEGER = {EXTENDED_DIGIT}(_?{EXTENDED_DIGIT})*
BASED_LITERAL = {BASE}#{BASED_INTEGER}(\.{BASED_INTEGER})?#{EXPONENT}?

NUMERIC_LITERAL = {DECIMAL_LITERAL}|{BASED_LITERAL}

LETTER_UPPERCASE = [A-Z]
LETTER_LOWERCASE = [a-z]

IDENTIFIER_START = {LETTER_UPPERCASE}|{LETTER_LOWERCASE}
IDENTIFIER_EXTEND = _|{DIGIT}
IDENTIFIER = {IDENTIFIER_START}({IDENTIFIER_START}|{IDENTIFIER_EXTEND})*

CRLF= \n|\r|\r\n
WHITE_SPACE=[\ \t\f]
END_OF_LINE_COMMENT=("--")[^\r\n]*

QUOTATION_MARK=\"
QUOTATION_MARK_PAIR={QUOTATION_MARK}{QUOTATION_MARK}
STRING_ELEMENT={QUOTATION_MARK_PAIR}|[^\"]
STRING_LITERAL={QUOTATION_MARK}{STRING_ELEMENT}*{QUOTATION_MARK}

APOSTROPHE='
CHARACTER_LITERAL={APOSTROPHE}.{APOSTROPHE}
%%
abort                                           { return AdaTypes.KEYWORD; }
"abs"                                           { return AdaTypes.KEYWORD; }
"abstract"                                      { return AdaTypes.KEYWORD; }
"accept"                                        { return AdaTypes.KEYWORD; }
"access"                                        { return AdaTypes.KEYWORD; }
"aliased"                                       { return AdaTypes.KEYWORD; }
"all"                                           { return AdaTypes.KEYWORD; }
"and"                                           { return AdaTypes.KEYWORD; }
"array"                                         { return AdaTypes.KEYWORD; }
"at"                                            { return AdaTypes.KEYWORD; }
"begin"                                         { return AdaTypes.KEYWORD; }
"body"                                          { return AdaTypes.KEYWORD; }
"case"                                          { return AdaTypes.KEYWORD; }
"constant"                                      { return AdaTypes.KEYWORD; }
"declare"                                       { return AdaTypes.KEYWORD; }
"delay"                                         { return AdaTypes.KEYWORD; }
"delta"                                         { return AdaTypes.KEYWORD; }
"digits"                                        { return AdaTypes.KEYWORD; }
"do"                                            { return AdaTypes.KEYWORD; }
"else"                                          { return AdaTypes.KEYWORD; }
"elsif"                                         { return AdaTypes.KEYWORD; }
"end"                                           { return AdaTypes.KEYWORD; }
"entry"                                         { return AdaTypes.KEYWORD; }
"exception"                                     { return AdaTypes.KEYWORD; }
"exit"                                          { return AdaTypes.KEYWORD; }
"for"                                           { return AdaTypes.KEYWORD; }
"function"                                      { return AdaTypes.KEYWORD; }
"generic"                                       { return AdaTypes.KEYWORD; }
"goto"                                          { return AdaTypes.KEYWORD; }
"if"                                            { return AdaTypes.KEYWORD; }
"in"                                            { return AdaTypes.KEYWORD; }
"is"                                            { return AdaTypes.KEYWORD; }
"limited"                                       { return AdaTypes.KEYWORD; }
"loop"                                          { return AdaTypes.KEYWORD; }
"mod"                                           { return AdaTypes.KEYWORD; }
"new"                                           { return AdaTypes.KEYWORD; }
"not"                                           { return AdaTypes.KEYWORD; }
"null"                                          { return AdaTypes.KEYWORD; }
"of"                                            { return AdaTypes.KEYWORD; }
"or"                                            { return AdaTypes.KEYWORD; }
"others"                                        { return AdaTypes.KEYWORD; }
"out"                                           { return AdaTypes.KEYWORD; }
package                                         { return AdaTypes.KEYWORD; }
"pragma"                                        { return AdaTypes.KEYWORD; }
"private"                                       { return AdaTypes.KEYWORD; }
"procedure"                                     { return AdaTypes.KEYWORD; }
"protected"                                     { return AdaTypes.KEYWORD; }
"raise"                                         { return AdaTypes.KEYWORD; }
"range"                                         { return AdaTypes.KEYWORD; }
"record"                                        { return AdaTypes.KEYWORD; }
"rem"                                           { return AdaTypes.KEYWORD; }
"renames"                                       { return AdaTypes.KEYWORD; }
"requeue"                                       { return AdaTypes.KEYWORD; }
"return"                                        { return AdaTypes.KEYWORD; }
"reverse"                                       { return AdaTypes.KEYWORD; }
"select"                                        { return AdaTypes.KEYWORD; }
"separate"                                      { return AdaTypes.KEYWORD; }
"subtype"                                       { return AdaTypes.KEYWORD; }
"tagged"                                        { return AdaTypes.KEYWORD; }
"task"                                          { return AdaTypes.KEYWORD; }
"terminate"                                     { return AdaTypes.KEYWORD; }
"then"                                          { return AdaTypes.KEYWORD; }
"type"                                          { return AdaTypes.KEYWORD; }
"until"                                         { return AdaTypes.KEYWORD; }
"use"                                           { return AdaTypes.KEYWORD; }
"when"                                          { return AdaTypes.KEYWORD; }
"while"                                         { return AdaTypes.KEYWORD; }
"with"                                          { return AdaTypes.KEYWORD; }
"xor"                                           { return AdaTypes.KEYWORD; }

{STRING_LITERAL}                                { return AdaTypes.STRING_LITERAL; }
{CHARACTER_LITERAL}                             { return AdaTypes.CHARACTER_LITERAL; }
{NUMERIC_LITERAL}                               { return AdaTypes.NUMERIC_LITERAL; }
{END_OF_LINE_COMMENT}                           { return AdaTypes.COMMENT; }

{IDENTIFIER}                                    { return AdaTypes.IDENTIFIER; }

{CRLF}                                                     { yybegin(YYINITIAL); return AdaTypes.CRLF; }

{WHITE_SPACE}+                                              { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return AdaTypes.OTHER; }
