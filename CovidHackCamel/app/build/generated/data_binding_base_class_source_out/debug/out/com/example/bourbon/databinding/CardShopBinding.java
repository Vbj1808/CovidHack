// Generated by data binding compiler. Do not edit!
package com.example.bourbon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.bourbon.R;
import com.example.bourbon.activities.harish_activities.model.Shop;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CardShopBinding extends ViewDataBinding {
  @NonNull
  public final TextView addressLabel;

  @NonNull
  public final TextView addressText;

  @NonNull
  public final Button shopHere;

  @NonNull
  public final TextView shopId;

  @NonNull
  public final TextView shopName;

  @NonNull
  public final TextView shopTypeLabel;

  @NonNull
  public final TextView shopTypeText;

  @Bindable
  protected Shop mPd;

  protected CardShopBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView addressLabel, TextView addressText, Button shopHere, TextView shopId,
      TextView shopName, TextView shopTypeLabel, TextView shopTypeText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addressLabel = addressLabel;
    this.addressText = addressText;
    this.shopHere = shopHere;
    this.shopId = shopId;
    this.shopName = shopName;
    this.shopTypeLabel = shopTypeLabel;
    this.shopTypeText = shopTypeText;
  }

  public abstract void setPd(@Nullable Shop pd);

  @Nullable
  public Shop getPd() {
    return mPd;
  }

  @NonNull
  public static CardShopBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.card_shop, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CardShopBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CardShopBinding>inflateInternal(inflater, R.layout.card_shop, root, attachToRoot, component);
  }

  @NonNull
  public static CardShopBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.card_shop, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CardShopBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CardShopBinding>inflateInternal(inflater, R.layout.card_shop, null, false, component);
  }

  public static CardShopBinding bind(@NonNull View view) {
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
  public static CardShopBinding bind(@NonNull View view, @Nullable Object component) {
    return (CardShopBinding)bind(component, view, R.layout.card_shop);
  }
}
