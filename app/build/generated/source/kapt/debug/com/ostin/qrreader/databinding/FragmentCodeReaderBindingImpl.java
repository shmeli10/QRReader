package com.ostin.qrreader.databinding;
import com.ostin.qrreader.R;
import com.ostin.qrreader.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCodeReaderBindingImpl extends FragmentCodeReaderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCodeReaderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentCodeReaderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.view.SurfaceView) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.ToggleButton) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            );
        this.allowCameraPermission.setTag(null);
        this.barCodeValue.setTag(null);
        this.cameraPreview.setTag(null);
        this.codeImg.setTag(null);
        this.contentWrapper.setTag(null);
        this.flashLight.setTag(null);
        this.noCameraPermission.setTag(null);
        this.reader.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.hasStoragePermission == variableId) {
            setHasStoragePermission((boolean) variable);
        }
        else if (BR.hasCameraPermission == variableId) {
            setHasCameraPermission((boolean) variable);
        }
        else if (BR.codeDetected == variableId) {
            setCodeDetected((boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHasStoragePermission(boolean HasStoragePermission) {
        this.mHasStoragePermission = HasStoragePermission;
    }
    public void setHasCameraPermission(boolean HasCameraPermission) {
        this.mHasCameraPermission = HasCameraPermission;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.hasCameraPermission);
        super.requestRebind();
    }
    public void setCodeDetected(boolean CodeDetected) {
        this.mCodeDetected = CodeDetected;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.codeDetected);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean hasCameraPermission = mHasCameraPermission;
        boolean HasCameraPermission1 = false;
        boolean codeDetected = mCodeDetected;
        boolean CodeDetected1 = false;

        if ((dirtyFlags & 0xaL) != 0) {



                // read !hasCameraPermission
                HasCameraPermission1 = !hasCameraPermission;
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read !codeDetected
                CodeDetected1 = !codeDetected;
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            com.ostin.qrreader.adapters.BindingAdaptersKt.bindIsGone(this.allowCameraPermission, hasCameraPermission);
            com.ostin.qrreader.adapters.BindingAdaptersKt.bindIsGone(this.barCodeValue, HasCameraPermission1);
            com.ostin.qrreader.adapters.BindingAdaptersKt.bindIsGone(this.noCameraPermission, hasCameraPermission);
            com.ostin.qrreader.adapters.BindingAdaptersKt.bindIsGone(this.reader, HasCameraPermission1);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.ostin.qrreader.adapters.BindingAdaptersKt.bindIsGone(this.cameraPreview, codeDetected);
            com.ostin.qrreader.adapters.BindingAdaptersKt.bindIsGone(this.codeImg, CodeDetected1);
            com.ostin.qrreader.adapters.BindingAdaptersKt.bindIsGone(this.flashLight, codeDetected);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): hasStoragePermission
        flag 1 (0x2L): hasCameraPermission
        flag 2 (0x3L): codeDetected
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}