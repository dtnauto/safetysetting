package com.example.safetysetting.vehicleappservice;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class SafetyInfo {
    int Value;
    int Support;

    public int getSupport() {
        return Support;
    }

    public void setSupport(int support) {
        Support = support;
    }

    public void setValue(int value) {
        Value = value;
    }

    public int getValue() {
        return Value;
    }
}
