package com.ostin.qrreader.home.qr_code.reader;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\"\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\bJ\b\u0010#\u001a\u00020\u001aH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, d2 = {"Lcom/ostin/qrreader/home/qr_code/reader/CodeReaderViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "appContext", "Landroid/content/Context;", "codeImgPath", "", "getCodeImgPath", "()Ljava/lang/String;", "setCodeImgPath", "(Ljava/lang/String;)V", "codeValue", "getCodeValue", "setCodeValue", "permListeners", "", "Lcom/ostin/qrreader/util/permission/PermStatusListener;", "vibrator", "Landroid/os/Vibrator;", "getVibrator", "()Landroid/os/Vibrator;", "vibrator$delegate", "Lkotlin/Lazy;", "init", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "cameraObserver", "Landroidx/lifecycle/Observer;", "Lcom/ostin/qrreader/util/permission/PermStatus;", "storageObserver", "onCodeImgPathDetected", "onCodeValueDetected", "vibrate", "app_debug"})
public final class CodeReaderViewModel extends androidx.lifecycle.AndroidViewModel {
    private final android.content.Context appContext = null;
    private final java.util.List<com.ostin.qrreader.util.permission.PermStatusListener> permListeners = null;
    private final kotlin.Lazy vibrator$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String codeValue;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String codeImgPath;
    
    private final android.os.Vibrator getVibrator() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCodeValue() {
        return null;
    }
    
    public final void setCodeValue(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCodeImgPath() {
        return null;
    }
    
    public final void setCodeImgPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<com.ostin.qrreader.util.permission.PermStatus> cameraObserver, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<com.ostin.qrreader.util.permission.PermStatus> storageObserver) {
    }
    
    public final void onCodeValueDetected(@org.jetbrains.annotations.NotNull()
    java.lang.String codeValue) {
    }
    
    public final void onCodeImgPathDetected(@org.jetbrains.annotations.NotNull()
    java.lang.String codeImgPath) {
    }
    
    private final void vibrate() {
    }
    
    public CodeReaderViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}