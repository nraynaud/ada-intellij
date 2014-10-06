package com.nraynaud.ada;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class AdaLexerAdapter extends FlexAdapter {
    public AdaLexerAdapter() {
        super(new AdaLexer((Reader) null));
    }
}
