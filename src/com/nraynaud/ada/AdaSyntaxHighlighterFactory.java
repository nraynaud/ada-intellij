package com.nraynaud.ada;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

public class AdaSyntaxHighlighterFactory extends SyntaxHighlighterFactory {
    @NotNull
    @Override
    public SyntaxHighlighter getSyntaxHighlighter(Project project, VirtualFile virtualFile) {
        if (virtualFile.getFileType() instanceof GnatProjectFileType)
            return new AdaSyntaxHighlighter(new GprLexer((Reader) null));
        else
            return new AdaSyntaxHighlighter(new AdaLexer((Reader) null));
    }
}
