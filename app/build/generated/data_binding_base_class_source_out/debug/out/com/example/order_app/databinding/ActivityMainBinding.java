// Generated by view binder compiler. Do not edit!
package com.example.order_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.order_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnOrder;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView txtDrink;

  @NonNull
  public final TextView txtSugar;

  @NonNull
  public final TextView txtTakeOut;

  @NonNull
  public final TextView txtUserName;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnOrder,
      @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5,
      @NonNull TextView textView7, @NonNull TextView txtDrink, @NonNull TextView txtSugar,
      @NonNull TextView txtTakeOut, @NonNull TextView txtUserName) {
    this.rootView = rootView;
    this.btnOrder = btnOrder;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView7 = textView7;
    this.txtDrink = txtDrink;
    this.txtSugar = txtSugar;
    this.txtTakeOut = txtTakeOut;
    this.txtUserName = txtUserName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnOrder;
      Button btnOrder = ViewBindings.findChildViewById(rootView, id);
      if (btnOrder == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.txtDrink;
      TextView txtDrink = ViewBindings.findChildViewById(rootView, id);
      if (txtDrink == null) {
        break missingId;
      }

      id = R.id.txtSugar;
      TextView txtSugar = ViewBindings.findChildViewById(rootView, id);
      if (txtSugar == null) {
        break missingId;
      }

      id = R.id.txtTakeOut;
      TextView txtTakeOut = ViewBindings.findChildViewById(rootView, id);
      if (txtTakeOut == null) {
        break missingId;
      }

      id = R.id.txtUserName;
      TextView txtUserName = ViewBindings.findChildViewById(rootView, id);
      if (txtUserName == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnOrder, textView3, textView4,
          textView5, textView7, txtDrink, txtSugar, txtTakeOut, txtUserName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
