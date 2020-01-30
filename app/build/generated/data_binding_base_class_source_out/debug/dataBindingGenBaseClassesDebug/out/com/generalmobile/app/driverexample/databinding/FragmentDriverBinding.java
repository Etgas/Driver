// Generated by data binding compiler. Do not edit!
package com.generalmobile.app.driverexample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.generalmobile.app.driverexample.R;
import com.generalmobile.app.driverexample.ui.drivers.DriverViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentDriverBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView driverList;

  @Bindable
  protected DriverViewModel mViewModel;

  protected FragmentDriverBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView driverList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.driverList = driverList;
  }

  public abstract void setViewModel(@Nullable DriverViewModel viewModel);

  @Nullable
  public DriverViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentDriverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_driver, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDriverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDriverBinding>inflateInternal(inflater, R.layout.fragment_driver, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDriverBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_driver, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDriverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDriverBinding>inflateInternal(inflater, R.layout.fragment_driver, null, false, component);
  }

  public static FragmentDriverBinding bind(@NonNull View view) {
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
  public static FragmentDriverBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDriverBinding)bind(component, view, R.layout.fragment_driver);
  }
}
