package com.webschik.doT.inspections;

import com.webschik.doT.DotBundle;
import com.webschik.doT.psi.DotPath;
import com.intellij.codeInsight.CodeInsightUtilBase;
import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Condition;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiDocumentManager;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;

class DotBlockMismatchFix implements IntentionAction {
    private final String myCorrectedName;
    private final String myOriginalName;

    public DotBlockMismatchFix(String correctedName, String originalName, boolean updateOpenMustache) {
        myCorrectedName = correctedName;
        myOriginalName = originalName;
    }

    @NotNull
    @Override
    public String getText() {
        return getName();
    }

    @NotNull
    @Override
    public String getFamilyName() {
        return getName();
    }

    @Override
    public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile file) {
        return true;
    }

    @Override
    public void invoke(@NotNull Project project, Editor editor, PsiFile file)
            throws IncorrectOperationException {
    }

    @Override
    public boolean startInWriteAction() {
        return true;
    }

    private String getName() {
        return "Dot.block.mismatch.intention.rename.close";
    }
}
