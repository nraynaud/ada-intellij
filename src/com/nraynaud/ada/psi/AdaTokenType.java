package com.nraynaud.ada.psi;

import com.intellij.psi.tree.IElementType;
import com.nraynaud.ada.AdaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class AdaTokenType extends IElementType {
    public AdaTokenType(@NotNull @NonNls String debugName) {
        super(debugName, AdaLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "AdaTokenType." + super.toString();
    }
}
