package com.example.safetysetting.view.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.safetysetting.R;
import com.example.safetysetting.view.base.AdvanceAdapter;
import com.example.safetysetting.view.base.AdvanceItem;

import java.util.ArrayList;

public class HMISTSF003Fragment extends Fragment {
    String TAG = HMISTSF003Fragment.class.getSimpleName();
    AdvanceAdapter advanceAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.st_sf_003_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.recycle_view);

        ArrayList<AdvanceItem> advanceItemArrayList = new ArrayList<>();
        advanceItemArrayList.add(new AdvanceItem.Builder(R.layout.layout_item_click).addSValue("clicky").addTitle("blabla").build());
        advanceItemArrayList.add(new AdvanceItem.Builder(R.layout.layout_item_click).addSValue("clicky").addTitle("blabla").build());
        advanceItemArrayList.add(new AdvanceItem.Builder(R.layout.layout_item_click).addSValue("clicky").addTitle("blabla").build());
        advanceItemArrayList.add(new AdvanceItem.Builder(R.layout.layout_item_switch).addBValue(true).addTitle("ahihi").build());
        advanceItemArrayList.add(new AdvanceItem.Builder(R.layout.layout_item_switch).addBValue(true).addTitle("ahihi").build());
        advanceItemArrayList.add(new AdvanceItem.Builder(R.layout.layout_item_switch).addBValue(true).addTitle("ahihi").build());
        advanceItemArrayList.add(new AdvanceItem.Builder(R.layout.layout_item_click).addSValue("clicky").addTitle("blabla").build());
        advanceItemArrayList.add(new AdvanceItem.Builder(R.layout.layout_item_switch).addBValue(false).addTitle("hihihu").build());
        advanceItemArrayList.add(new AdvanceItem.Builder(R.layout.layout_item_switch).addBValue(false).addTitle("hihihu").build());
        advanceItemArrayList.add(new AdvanceItem.Builder(R.layout.layout_item_switch).addBValue(true).addTitle("hihihu").build());
        advanceItemArrayList.add(new AdvanceItem.Builder(R.layout.layout_item_switch).addBValue(false).addTitle("hihihu").build());
        advanceItemArrayList.add(new AdvanceItem.Builder(R.layout.layout_item_switch).addBValue(false).addTitle("hihihu").build());
        advanceItemArrayList.add(new AdvanceItem.Builder(R.layout.layout_item_switch).addBValue(true).addTitle("hihihu").build());
        advanceItemArrayList.add(new AdvanceItem.Builder(R.layout.layout_item_click).addSValue("clicky").addTitle("blabla").build());
        advanceItemArrayList.add(new AdvanceItem.Builder(R.layout.layout_item_click).addSValue("clicky").addTitle("blabla").build());

        advanceAdapter = new AdvanceAdapter(advanceItemArrayList,
                new AdvanceAdapter.OnClickListener() {
                    @Override
                    public void onClickListener(int position) {
                        Log.i(TAG, position+"");
                        advanceItemArrayList.remove(position);
                        advanceAdapter.notifyItemRemoved(position);
                        advanceAdapter.notifyItemRangeChanged(position, advanceItemArrayList.size());
                    }
                });

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(
                getContext(), // màn hình hiển thị
                LinearLayoutManager.VERTICAL, // chiều hiển thị
                false // đảo ngược danh sách
        ));
        recyclerView.setAdapter(advanceAdapter);
    }
}