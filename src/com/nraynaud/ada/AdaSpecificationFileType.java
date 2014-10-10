package com.nraynaud.ada;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class AdaSpecificationFileType extends LanguageFileType {
    public static final AdaSpecificationFileType INSTANCE = new AdaSpecificationFileType();

    private AdaSpecificationFileType() {
        super(AdaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Ada Spec file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Ada Specification file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ads";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return IconLoader.getIcon("/com/nraynaud/ada/adsIcon.png");
    }
}
