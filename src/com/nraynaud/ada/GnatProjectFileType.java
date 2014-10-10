package com.nraynaud.ada;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class GnatProjectFileType extends LanguageFileType {
    public static final GnatProjectFileType INSTANCE = new GnatProjectFileType();

    private GnatProjectFileType() {
        super(AdaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Gnat Project File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Gnat Project manager File";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "gpr";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return null;
    }
}
