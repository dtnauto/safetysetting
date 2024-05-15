package com.example.safetysetting.view.base;

public class ItemSafetyInfo implements ItemSafety.ItemInterface {
    @Override
    public <T extends ItemSafety.ItemInterface> boolean getSupport(T vidu) {
        return false;
    }
}
