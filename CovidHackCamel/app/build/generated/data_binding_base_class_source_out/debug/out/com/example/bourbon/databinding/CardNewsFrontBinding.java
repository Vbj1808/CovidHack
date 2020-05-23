// Generated by data binding compiler. Do not edit!
package com.example.bourbon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.bourbon.R;
import com.example.bourbon.activities.harish_activities.model.NewsClassModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CardNewsFrontBinding extends ViewDataBinding {
  @NonNull
  public final ImageView newsImg;

  @Bindable
  protected NewsClassModel mPd;

  protected CardNewsFrontBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView newsImg) {
    super(_bindingComponent, _root, _localFieldCount);
    this.newsImg = newsImg;
  }

  public abstract void setPd(@Nullable NewsClassModel pd);

  @Nullable
  public NewsClassModel getPd() {
    return mPd;
  }

  @NonNull
  public static CardNewsFrontBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.card_news_front, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CardNewsFrontBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CardNewsFrontBinding>inflateInternal(inflater, R.layout.card_news_front, root, attachToRoot, component);
  }

  @NonNull
  public static CardNewsFrontBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.card_news_front, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CardNewsFrontBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CardNewsFrontBinding>inflateInternal(inflater, R.layout.card_news_front, null, false, component);
  }

  public static CardNewsFrontBinding bind(@NonNull View view) {
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
  public static CardNewsFrontBinding bind(@NonNull View view, @Nullable Object component) {
    return (CardNewsFrontBinding)bind(component, view, R.layout.card_news_front);
  }
}
