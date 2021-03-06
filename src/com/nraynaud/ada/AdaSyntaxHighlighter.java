package com.nraynaud.ada;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.nraynaud.ada.psi.AdaTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class AdaSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{createTextAttributesKey("ADA_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{createTextAttributesKey("ADA_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)};
    private static final TextAttributesKey[] STRING_LITERAL = new TextAttributesKey[]{createTextAttributesKey("ADA_STRING", DefaultLanguageHighlighterColors.STRING)};
    private static final TextAttributesKey[] NUMERIC_LITERAL = new TextAttributesKey[]{createTextAttributesKey("ADA_NUMBER", DefaultLanguageHighlighterColors.NUMBER)};
    private FlexLexer lexer;

    public AdaSyntaxHighlighter(final FlexLexer lexer) {
        this.lexer = lexer;
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new FlexAdapter(lexer);
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(AdaTypes.COMMENT))
            return COMMENT_KEYS;
        if (tokenType.equals(AdaTypes.KEYWORD))
            return KEYWORD_KEYS;
        if (tokenType.equals(AdaTypes.STRING_LITERAL) || tokenType.equals(AdaTypes.CHARACTER_LITERAL))
            return STRING_LITERAL;
        if (tokenType.equals(AdaTypes.NUMERIC_LITERAL))
            return NUMERIC_LITERAL;
        return new TextAttributesKey[0];
    }
}
