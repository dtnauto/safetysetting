package com.example.safetysetting.view.base;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleViewSafety<T extends RecycleViewSafety.RecycleViewListener> {
    ArrayList<T> tArrayList;
    RecyclerView.Adapter adapter;

    public RecycleViewSafety(ArrayList<T> tArrayList, RecyclerView.Adapter adapter) {
        this.tArrayList = tArrayList;
        this.adapter = adapter;
    }

    void update(ArrayList<T> observerArrayList) {
        for (RecycleViewListener item : observerArrayList) {

        }
        adapter.notifyDataSetChanged();
    }

    interface RecycleViewListener {
        int getIndex();
    }
}
