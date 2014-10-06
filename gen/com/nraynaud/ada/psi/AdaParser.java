// This is a generated file. Not intended for manual editing.
package com.nraynaud.ada.psi;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static com.nraynaud.ada.psi.AdaTypes.*;
import static org.intellij.grammar.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class AdaParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("com.nraynaud.ada.psi.AdaParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == TEXT) {
      result_ = text(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return packageSpec(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // text|COMMENT|CRLF
  static boolean item_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item_")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = text(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, COMMENT);
    if (!result_) result_ = consumeToken(builder_, CRLF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // item_*
  static boolean packageSpec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "packageSpec")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!item_(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "packageSpec", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // KEYWORD|IDENTIFIER|STRING_LITERAL|CHARACTER_LITERAL|NUMERIC_LITERAL|OTHER
  public static boolean text(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "text")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<text>");
    result_ = consumeToken(builder_, KEYWORD);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = consumeToken(builder_, STRING_LITERAL);
    if (!result_) result_ = consumeToken(builder_, CHARACTER_LITERAL);
    if (!result_) result_ = consumeToken(builder_, NUMERIC_LITERAL);
    if (!result_) result_ = consumeToken(builder_, OTHER);
    exit_section_(builder_, level_, marker_, TEXT, result_, false, null);
    return result_;
  }

}
