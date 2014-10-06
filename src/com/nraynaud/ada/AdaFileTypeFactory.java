package com.nraynaud.ada;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class AdaFileTypeFactory extends FileTypeFactory {
    public AdaFileTypeFactory() {
    }

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(AdaFileType.INSTANCE, "ads");
        fileTypeConsumer.consume(AdaFileType.INSTANCE, "adb");
    }
}
