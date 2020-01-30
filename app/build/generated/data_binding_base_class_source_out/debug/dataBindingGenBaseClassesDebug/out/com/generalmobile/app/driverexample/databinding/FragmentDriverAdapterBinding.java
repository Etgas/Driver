// Generated by data binding compiler. Do not edit!
package com.generalmobile.app.driverexample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.generalmobile.app.driverexample.R;
import com.generalmobile.app.driverexample.ui.adapter.DriverAdapterViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentDriverAdapterBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout driverAdapterList;

  @NonNull
  public final TextView driverId;

  @NonNull
  public final TextView driverName;

  @NonNull
  public final TextView driverPoint;

  @Bindable
  protected DriverAdapterViewModel mViewModel;

  protected FragmentDriverAdapterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout driverAdapterList, TextView driverId, TextView driverName,
      TextView driverPoint) {
    super(_bindingComponent, _root, _localFieldCount);
    this.driverAdapterList = driverAdapterList;
    this.driverId = driverId;
    this.driverName = driverName;
    this.driverPoint = driverPoint;
  }

  public abstract void setViewModel(@Nullable DriverAdapterViewModel viewModel);

  @Nullable
  public DriverAdapterViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentDriverAdapterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_driver_adapter, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDriverAdapterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDriverAdapterBinding>inflateInternal(inflater, R.layout.fragment_driver_adapter, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDriverAdapterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_driver_adapter, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDriverAdapterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDriverAdapterBinding>inflateInternal(inflater, R.layout.fragment_driver_adapter, null, false, component);
  }

  public static FragmentDriverAdapterBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentDriverAdapterBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDriverAdapterBinding)bind(component, view, R.layout.fragment_driver_adapter);
  }
}
