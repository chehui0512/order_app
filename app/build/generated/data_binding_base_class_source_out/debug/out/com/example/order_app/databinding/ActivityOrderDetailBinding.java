// Generated by view binder compiler. Do not edit!
package com.example.order_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

public final class ActivityOrderDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final Button btnOk;

  @NonNull
  public final CheckBox chkTakeOut;

  @NonNull
  public final EditText editName;

  @NonNull
  public final RadioButton rbtnCoffee;

  @NonNull
  public final RadioButton rbtnFullSugar;

  @NonNull
  public final RadioButton rbtnHalfSugar;

  @NonNull
  public final RadioButton rbtnNoSugar;

  @NonNull
  public final RadioButton rbtnTea;

  @NonNull
  public final RadioButton rbtnWater;

  @NonNull
  public final RadioGroup rdgDrink;

  @NonNull
  public final RadioGroup rdgSugar;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView6;

  private ActivityOrderDetailBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnCancel,
      @NonNull Button btnOk, @NonNull CheckBox chkTakeOut, @NonNull EditText editName,
      @NonNull RadioButton rbtnCoffee, @NonNull RadioButton rbtnFullSugar,
      @NonNull RadioButton rbtnHalfSugar, @NonNull RadioButton rbtnNoSugar,
      @NonNull RadioButton rbtnTea, @NonNull RadioButton rbtnWater, @NonNull RadioGroup rdgDrink,
      @NonNull RadioGroup rdgSugar, @NonNull TextView textView, @NonNull TextView textView2,
      @NonNull TextView textView6) {
    this.rootView = rootView;
    this.btnCancel = btnCancel;
    this.btnOk = btnOk;
    this.chkTakeOut = chkTakeOut;
    this.editName = editName;
    this.rbtnCoffee = rbtnCoffee;
    this.rbtnFullSugar = rbtnFullSugar;
    this.rbtnHalfSugar = rbtnHalfSugar;
    this.rbtnNoSugar = rbtnNoSugar;
    this.rbtnTea = rbtnTea;
    this.rbtnWater = rbtnWater;
    this.rdgDrink = rdgDrink;
    this.rdgSugar = rdgSugar;
    this.textView = textView;
    this.textView2 = textView2;
    this.textView6 = textView6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOrderDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOrderDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_order_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOrderDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCancel;
      Button btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.btnOk;
      Button btnOk = ViewBindings.findChildViewById(rootView, id);
      if (btnOk == null) {
        break missingId;
      }

      id = R.id.chkTakeOut;
      CheckBox chkTakeOut = ViewBindings.findChildViewById(rootView, id);
      if (chkTakeOut == null) {
        break missingId;
      }

      id = R.id.editName;
      EditText editName = ViewBindings.findChildViewById(rootView, id);
      if (editName == null) {
        break missingId;
      }

      id = R.id.rbtnCoffee;
      RadioButton rbtnCoffee = ViewBindings.findChildViewById(rootView, id);
      if (rbtnCoffee == null) {
        break missingId;
      }

      id = R.id.rbtnFullSugar;
      RadioButton rbtnFullSugar = ViewBindings.findChildViewById(rootView, id);
      if (rbtnFullSugar == null) {
        break missingId;
      }

      id = R.id.rbtnHalfSugar;
      RadioButton rbtnHalfSugar = ViewBindings.findChildViewById(rootView, id);
      if (rbtnHalfSugar == null) {
        break missingId;
      }

      id = R.id.rbtnNoSugar;
      RadioButton rbtnNoSugar = ViewBindings.findChildViewById(rootView, id);
      if (rbtnNoSugar == null) {
        break missingId;
      }

      id = R.id.rbtnTea;
      RadioButton rbtnTea = ViewBindings.findChildViewById(rootView, id);
      if (rbtnTea == null) {
        break missingId;
      }

      id = R.id.rbtnWater;
      RadioButton rbtnWater = ViewBindings.findChildViewById(rootView, id);
      if (rbtnWater == null) {
        break missingId;
      }

      id = R.id.rdgDrink;
      RadioGroup rdgDrink = ViewBindings.findChildViewById(rootView, id);
      if (rdgDrink == null) {
        break missingId;
      }

      id = R.id.rdgSugar;
      RadioGroup rdgSugar = ViewBindings.findChildViewById(rootView, id);
      if (rdgSugar == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      return new ActivityOrderDetailBinding((ConstraintLayout) rootView, btnCancel, btnOk,
          chkTakeOut, editName, rbtnCoffee, rbtnFullSugar, rbtnHalfSugar, rbtnNoSugar, rbtnTea,
          rbtnWater, rdgDrink, rdgSugar, textView, textView2, textView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
