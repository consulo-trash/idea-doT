package com.webschik.doT.psi.impl;

import com.webschik.doT.psi.DotComment;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class DotCommentImpl extends DotPsiElementImpl implements DotComment {
    public DotCommentImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
