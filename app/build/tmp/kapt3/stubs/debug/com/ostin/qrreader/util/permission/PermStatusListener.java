package com.ostin.qrreader.util.permission;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ostin/qrreader/util/permission/PermStatusListener;", "Landroidx/lifecycle/LiveData;", "Lcom/ostin/qrreader/util/permission/PermStatus;", "context", "Landroid/content/Context;", "permission", "", "(Landroid/content/Context;Ljava/lang/String;)V", "handlePermissionCheck", "", "isGranted", "", "app_debug"})
public class PermStatusListener extends androidx.lifecycle.LiveData<com.ostin.qrreader.util.permission.PermStatus> {
    private final android.content.Context context = null;
    private final java.lang.String permission = null;
    
    public final void handlePermissionCheck() {
    }
    
    private final boolean isGranted() {
        return false;
    }
    
    public PermStatusListener(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        super(null);
    }
}