package com.nraynaud.ada;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class AdaBodyFileType extends LanguageFileType {
    public static final AdaBodyFileType INSTANCE = new AdaBodyFileType();

    private AdaBodyFileType() {
        super(AdaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Ada Body file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Ada Body file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "adb";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return IconLoader.getIcon("/com/nraynaud/ada/adbIcon.png");
    }
}
