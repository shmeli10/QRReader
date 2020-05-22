package com.ostin.qrreader.home.qr_code.reader;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\u0012\u0010\u001e\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010\'\u001a\u00020\u0017H\u0016J\b\u0010(\u001a\u00020\u0017H\u0016J\b\u0010)\u001a\u00020\u0017H\u0016J\b\u0010*\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006+"}, d2 = {"Lcom/ostin/qrreader/home/qr_code/reader/CodeReaderFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/ostin/qrreader/util/code_reader/CodeReaderInterface;", "()V", "appContext", "Landroid/content/Context;", "binding", "Lcom/ostin/qrreader/databinding/FragmentCodeReaderBinding;", "cameraObserver", "Landroidx/lifecycle/Observer;", "Lcom/ostin/qrreader/util/permission/PermStatus;", "codeReader", "Lcom/ostin/qrreader/util/code_reader/CodeReader;", "requestCameraPermId", "", "storageObserver", "viewModel", "Lcom/ostin/qrreader/home/qr_code/reader/CodeReaderViewModel;", "getViewModel", "()Lcom/ostin/qrreader/home/qr_code/reader/CodeReaderViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "disableAllowCameraPermBtn", "", "enableFlashlightBtn", "onCodeImgPathDetected", "codeImgPath", "", "onCodeValueDetected", "codeValue", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onResume", "setupAllowCameraPermBtn", "app_debug"})
public final class CodeReaderFragment extends androidx.fragment.app.Fragment implements com.ostin.qrreader.util.code_reader.CodeReaderInterface {
    private com.ostin.qrreader.databinding.FragmentCodeReaderBinding binding;
    private android.content.Context appContext;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.ostin.qrreader.util.code_reader.CodeReader codeReader;
    private final int requestCameraPermId = 1001;
    private androidx.lifecycle.Observer<com.ostin.qrreader.util.permission.PermStatus> cameraObserver;
    private androidx.lifecycle.Observer<com.ostin.qrreader.util.permission.PermStatus> storageObserver;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ostin.qrreader.home.qr_code.reader.CodeReaderViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onCodeValueDetected(@org.jetbrains.annotations.NotNull()
    java.lang.String codeValue) {
    }
    
    @java.lang.Override()
    public void onCodeImgPathDetected(@org.jetbrains.annotations.NotNull()
    java.lang.String codeImgPath) {
    }
    
    private final void setupAllowCameraPermBtn() {
    }
    
    private final void enableFlashlightBtn() {
    }
    
    private final void disableAllowCameraPermBtn() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public CodeReaderFragment() {
        super();
    }
}