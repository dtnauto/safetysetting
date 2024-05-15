package com.example.safetysetting.view.base;
public class AdapterSafety<T extends ItemSafety.ItemInterface>{

    ItemSafety<T> itemSafety;

    public AdapterSafety(ItemSafety<T> itemSafety) {
        this.itemSafety = itemSafety;
    }

    public boolean abc(){
        return itemSafety.getVidu().getSupport(itemSafety.getVidu());
    }

}
