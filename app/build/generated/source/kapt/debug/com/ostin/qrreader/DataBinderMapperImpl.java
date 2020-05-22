package com.ostin.qrreader;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ostin.qrreader.databinding.ActivityMainBindingImpl;
import com.ostin.qrreader.databinding.FragmentCodeReaderBindingImpl;
import com.ostin.qrreader.databinding.FragmentViewPagerBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTCODEREADER = 2;

  private static final int LAYOUT_FRAGMENTVIEWPAGER = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ostin.qrreader.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ostin.qrreader.R.layout.fragment_code_reader, LAYOUT_FRAGMENTCODEREADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ostin.qrreader.R.layout.fragment_view_pager, LAYOUT_FRAGMENTVIEWPAGER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCODEREADER: {
          if ("layout/fragment_code_reader_0".equals(tag)) {
            return new FragmentCodeReaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_code_reader is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVIEWPAGER: {
          if ("layout/fragment_view_pager_0".equals(tag)) {
            return new FragmentViewPagerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_view_pager is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "codeDetected");
      sKeys.put(2, "hasCameraPermission");
      sKeys.put(3, "hasStoragePermission");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_main_0", com.ostin.qrreader.R.layout.activity_main);
      sKeys.put("layout/fragment_code_reader_0", com.ostin.qrreader.R.layout.fragment_code_reader);
      sKeys.put("layout/fragment_view_pager_0", com.ostin.qrreader.R.layout.fragment_view_pager);
    }
  }
}
