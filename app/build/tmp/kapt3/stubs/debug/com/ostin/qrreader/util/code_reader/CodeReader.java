package com.ostin.qrreader.util.code_reader;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u0006\u0010\u001c\u001a\u00020\u0018J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u0006\u0010\u001e\u001a\u00020\u0018J\n\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002J\u0006\u0010 \u001a\u00020\u0018J\b\u0010!\u001a\u00020\u0012H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020\u0018H\u0002J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u0018H\u0002J\b\u0010,\u001a\u00020\u0018H\u0002J\b\u0010-\u001a\u00020\u0018H\u0002J\u000e\u0010.\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010/\u001a\u00020\u0018R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u00060"}, d2 = {"Lcom/ostin/qrreader/util/code_reader/CodeReader;", "", "context", "Landroid/content/Context;", "callback", "Lcom/ostin/qrreader/util/code_reader/CodeReaderInterface;", "(Landroid/content/Context;Lcom/ostin/qrreader/util/code_reader/CodeReaderInterface;)V", "barcodeDetector", "Lcom/google/android/gms/vision/barcode/BarcodeDetector;", "camera", "Landroid/hardware/Camera;", "cameraSource", "Lcom/google/android/gms/vision/CameraSource;", "getCameraSource", "()Lcom/google/android/gms/vision/CameraSource;", "setCameraSource", "(Lcom/google/android/gms/vision/CameraSource;)V", "canDetectCode", "", "isCameraStarted", "()Z", "setCameraStarted", "(Z)V", "cameraStart", "", "surfaceHolder", "Landroid/view/SurfaceHolder;", "disableCodeDetection", "disableFlashlight", "enableCodeDetection", "enableFlashLight", "getCamera", "getCodeImg", "isBarCodeDetectorReady", "releaseBarCodeDetector", "releaseCamera", "saveCodeImg", "codeImg", "Landroid/graphics/Bitmap;", "setBarCodeProcessor", "setFlashlightMode", "flashMode", "", "setupBarCodeDetector", "setupCamera", "setupCameraSource", "startReader", "stopReader", "app_debug"})
public final class CodeReader {
    private com.google.android.gms.vision.barcode.BarcodeDetector barcodeDetector;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.vision.CameraSource cameraSource;
    private android.hardware.Camera camera;
    private boolean canDetectCode = true;
    private boolean isCameraStarted = false;
    private final android.content.Context context = null;
    private final com.ostin.qrreader.util.code_reader.CodeReaderInterface callback = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.vision.CameraSource getCameraSource() {
        return null;
    }
    
    public final void setCameraSource(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.vision.CameraSource p0) {
    }
    
    public final boolean isCameraStarted() {
        return false;
    }
    
    public final void setCameraStarted(boolean p0) {
    }
    
    public final void startReader(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder surfaceHolder) {
    }
    
    private final void setupBarCodeDetector() {
    }
    
    private final void setupCameraSource() {
    }
    
    private final void setupCamera() {
    }
    
    private final void cameraStart(android.view.SurfaceHolder surfaceHolder) {
    }
    
    private final void setBarCodeProcessor() {
    }
    
    public final void getCodeImg() {
    }
    
    private final void saveCodeImg(android.graphics.Bitmap codeImg) {
    }
    
    private final boolean canDetectCode() {
        return false;
    }
    
    private final void enableCodeDetection() {
    }
    
    private final boolean isBarCodeDetectorReady() {
        return false;
    }
    
    public final void enableFlashLight() {
    }
    
    public final void disableFlashlight() {
    }
    
    private final void setFlashlightMode(java.lang.String flashMode) {
    }
    
    private final android.hardware.Camera getCamera() {
        return null;
    }
    
    public final void stopReader() {
    }
    
    private final void disableCodeDetection() {
    }
    
    private final void releaseBarCodeDetector() {
    }
    
    private final void releaseCamera() {
    }
    
    public CodeReader(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ostin.qrreader.util.code_reader.CodeReaderInterface callback) {
        super();
    }
}