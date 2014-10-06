// This is a generated file. Not intended for manual editing.
package com.nraynaud.ada.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.nraynaud.ada.psi.AdaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.nraynaud.ada.psi.*;

public class AdaTextImpl extends ASTWrapperPsiElement implements AdaText {

  public AdaTextImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AdaVisitor) ((AdaVisitor)visitor).visitText(this);
    else super.accept(visitor);
  }

}
