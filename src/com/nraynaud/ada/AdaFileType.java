package com.nraynaud.ada;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class AdaFileType extends LanguageFileType {
    public static final AdaFileType INSTANCE = new AdaFileType();

    private AdaFileType() {
        super(AdaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Ada file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Ada language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ads";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return null;
    }
}
