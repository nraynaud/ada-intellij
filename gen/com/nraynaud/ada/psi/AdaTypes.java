// This is a generated file. Not intended for manual editing.
package com.nraynaud.ada.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.nraynaud.ada.psi.impl.*;

public interface AdaTypes {

  IElementType TEXT = new AdaElementType("TEXT");

  IElementType CHARACTER_LITERAL = new AdaTokenType("CHARACTER_LITERAL");
  IElementType COMMENT = new AdaTokenType("COMMENT");
  IElementType CRLF = new AdaTokenType("CRLF");
  IElementType IDENTIFIER = new AdaTokenType("IDENTIFIER");
  IElementType KEYWORD = new AdaTokenType("KEYWORD");
  IElementType NUMERIC_LITERAL = new AdaTokenType("NUMERIC_LITERAL");
  IElementType OTHER = new AdaTokenType("OTHER");
  IElementType STRING_LITERAL = new AdaTokenType("STRING_LITERAL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == TEXT) {
        return new AdaTextImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
