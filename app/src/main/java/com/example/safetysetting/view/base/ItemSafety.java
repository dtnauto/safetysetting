package com.example.safetysetting.view.base;


import com.example.safetysetting.vehicleappservice.SafetyInfo;
import com.example.safetysetting.vehicleappservice.SafetyValueInfo;

public class ItemSafety<T> {
    private final T vidu;
    int index;

    public T getVidu() {
        return (T) vidu;
    }

    public ItemSafety(T vidu) {
        this.vidu = vidu;
    }

    interface ItemInterface{
        <T extends ItemInterface>boolean getSupport(T vidu);
    }
}
