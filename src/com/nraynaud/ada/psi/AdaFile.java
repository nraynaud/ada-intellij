package com.nraynaud.ada.psi;


import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.nraynaud.ada.AdaFileType;
import com.nraynaud.ada.AdaLanguage;
import org.jetbrains.annotations.NotNull;

public class AdaFile extends PsiFileBase {
    public AdaFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, AdaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return AdaFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Ada File";
    }
}
