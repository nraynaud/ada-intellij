package com.nraynaud.ada;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class GprLexerAdapter extends FlexAdapter {
    public GprLexerAdapter() {
        super(new GprLexer((Reader) null));
    }
}
