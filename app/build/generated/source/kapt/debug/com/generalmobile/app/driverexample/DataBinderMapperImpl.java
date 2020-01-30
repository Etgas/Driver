package com.generalmobile.app.driverexample;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.generalmobile.app.driverexample.databinding.ActivityDashboardBindingImpl;
import com.generalmobile.app.driverexample.databinding.ActivityMainBindingImpl;
import com.generalmobile.app.driverexample.databinding.FragmentDetayBindingImpl;
import com.generalmobile.app.driverexample.databinding.FragmentDriverAdapterBindingImpl;
import com.generalmobile.app.driverexample.databinding.FragmentDriverBindingImpl;
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
  private static final int LAYOUT_ACTIVITYDASHBOARD = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_FRAGMENTDETAY = 3;

  private static final int LAYOUT_FRAGMENTDRIVER = 4;

  private static final int LAYOUT_FRAGMENTDRIVERADAPTER = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.generalmobile.app.driverexample.R.layout.activity_dashboard, LAYOUT_ACTIVITYDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.generalmobile.app.driverexample.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.generalmobile.app.driverexample.R.layout.fragment_detay, LAYOUT_FRAGMENTDETAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.generalmobile.app.driverexample.R.layout.fragment_driver, LAYOUT_FRAGMENTDRIVER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.generalmobile.app.driverexample.R.layout.fragment_driver_adapter, LAYOUT_FRAGMENTDRIVERADAPTER);
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
        case  LAYOUT_ACTIVITYDASHBOARD: {
          if ("layout/activity_dashboard_0".equals(tag)) {
            return new ActivityDashboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_dashboard is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAY: {
          if ("layout/fragment_detay_0".equals(tag)) {
            return new FragmentDetayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detay is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDRIVER: {
          if ("layout/fragment_driver_0".equals(tag)) {
            return new FragmentDriverBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_driver is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDRIVERADAPTER: {
          if ("layout/fragment_driver_adapter_0".equals(tag)) {
            return new FragmentDriverAdapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_driver_adapter is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_dashboard_0", com.generalmobile.app.driverexample.R.layout.activity_dashboard);
      sKeys.put("layout/activity_main_0", com.generalmobile.app.driverexample.R.layout.activity_main);
      sKeys.put("layout/fragment_detay_0", com.generalmobile.app.driverexample.R.layout.fragment_detay);
      sKeys.put("layout/fragment_driver_0", com.generalmobile.app.driverexample.R.layout.fragment_driver);
      sKeys.put("layout/fragment_driver_adapter_0", com.generalmobile.app.driverexample.R.layout.fragment_driver_adapter);
    }
  }
}
