package com.example.smsc.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CafeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_cafe,container, false);

        ListCoffe[] listCoffes = new ListCoffe[] {
                new ListCoffe("Chocolate", R.drawable.item_1),
                new ListCoffe("Cafe Forte", R.drawable.item_2),
                new ListCoffe("Trufado", R.drawable.item_3),
                new ListCoffe("Ao leite", R.drawable.item_4),
                new ListCoffe("Menta", R.drawable.item_5),
                new ListCoffe("Amendoim", R.drawable.item_6),
                new ListCoffe("Chocolate",R.drawable.item_1),
                new ListCoffe("Cafe Forte", R.drawable.item_2),
                new ListCoffe("Trufado",R.drawable.item_3),
                new ListCoffe("Ao leite", R.drawable.item_4),
                new ListCoffe("Menta", R.drawable.item_5),
                new ListCoffe("Amendoim", R.drawable.item_6),
        };

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        ListCoffeAdpater adapter = new ListCoffeAdpater(listCoffes);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return rootView;
    }
}