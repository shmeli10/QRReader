package com.ostin.qrreader.util.code_reader;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/ostin/qrreader/util/code_reader/CodeReaderInterface;", "", "onCodeImgPathDetected", "", "codeImgPath", "", "onCodeValueDetected", "codeValue", "app_debug"})
public abstract interface CodeReaderInterface {
    
    public abstract void onCodeValueDetected(@org.jetbrains.annotations.NotNull()
    java.lang.String codeValue);
    
    public abstract void onCodeImgPathDetected(@org.jetbrains.annotations.NotNull()
    java.lang.String codeImgPath);
}