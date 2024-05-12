package com.example.safetysetting.view.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.safetysetting.R;

import java.util.ArrayList;

public class AdvanceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<AdvanceItem> advanceItemArrayList;
    OnClickListener onClickListener;
    public AdvanceAdapter(ArrayList<AdvanceItem> advanceItemArrayList, OnClickListener onClickListener) {
        this.advanceItemArrayList = advanceItemArrayList;
        this.onClickListener = onClickListener;
    }

    @Override
    public int getItemViewType(int position) {
        return advanceItemArrayList.get(position).type;
    }

    @NonNull
    @Override
    public BuilderHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == R.layout.layout_item_click){
            return new BuilderHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_click,parent,false));
        }
        else if (viewType == R.layout.layout_item_switch){
            return new BuilderHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_switch,parent,false));
        }
        return new BuilderHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_null,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((BuilderHolder) holder).onBind(position);
    }

    @Override
    public int getItemCount() {
        return advanceItemArrayList.size();
    }

    public class BuilderHolder extends RecyclerView.ViewHolder {
        View view;

        public BuilderHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
        }

        void onBind(int position) {
            TextView textTitle = view.findViewById(R.id.textTitle);
            TextView textSValue = view.findViewById(R.id.textSValue);
            Switch switchB = view.findViewById(R.id.switchB);
            textTitle.setText(advanceItemArrayList.get(position).mTitle);
            if (advanceItemArrayList.get(position).type == R.layout.layout_item_click) {
                textSValue.setText(advanceItemArrayList.get(position).mSValue);
            } else if (advanceItemArrayList.get(position).type == R.layout.layout_item_switch) {
                switchB.setChecked(advanceItemArrayList.get(position).mBValue);
            }
            textTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClickListener.onClickListener(position);
                }
            });
        }
    }

    public interface OnClickListener{
        void onClickListener(int position);
    }
}
