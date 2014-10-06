package com.nraynaud.ada;

import com.intellij.lang.Language;

public class AdaLanguage extends Language {
    public static final AdaLanguage INSTANCE = new AdaLanguage();

    private AdaLanguage() {
        super("Ada");
    }
}
