package com.nraynaud.ada.psi;

import com.intellij.psi.tree.IElementType;
import com.nraynaud.ada.AdaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class AdaElementType extends IElementType {
    public AdaElementType(@NotNull @NonNls String debugName) {
        super(debugName, AdaLanguage.INSTANCE);
    }
}