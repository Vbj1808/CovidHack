// Generated by data binding compiler. Do not edit!
package com.example.bourbon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.bourbon.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RvCustomerOrderInfoBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerView;

  protected RvCustomerOrderInfoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerView = recyclerView;
  }

  @NonNull
  public static RvCustomerOrderInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.rv_customer_order_info, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RvCustomerOrderInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RvCustomerOrderInfoBinding>inflateInternal(inflater, R.layout.rv_customer_order_info, root, attachToRoot, component);
  }

  @NonNull
  public static RvCustomerOrderInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.rv_customer_order_info, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RvCustomerOrderInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RvCustomerOrderInfoBinding>inflateInternal(inflater, R.layout.rv_customer_order_info, null, false, component);
  }

  public static RvCustomerOrderInfoBinding bind(@NonNull View view) {
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
  public static RvCustomerOrderInfoBinding bind(@NonNull View view, @Nullable Object component) {
    return (RvCustomerOrderInfoBinding)bind(component, view, R.layout.rv_customer_order_info);
  }
}
