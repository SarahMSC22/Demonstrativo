package com.example.smsc.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.smsc.myapplication.R;
import com.example.smsc.myapplication.lists.ItenFastFood;
import com.example.smsc.myapplication.lists.ItenFastFoodAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class FastFoodFragment extends Fragment {

    ItenFastFoodAdapter mAdapter;

    @BindView (R.id.edit_text_ff)
    EditText input;

    @BindView(R.id.button_ff)
    Button button;



    List<ItenFastFood> list = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fast_food,container, false);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                int value = Integer.parseInt(text);

                for (int i = 0; i < value; i++){
                    list.add(new ItenFastFood("position: "+ i));
                }
                mAdapter.notifyDataSetChanged();

            }
        });
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_ff);
        ItenFastFoodAdapter adapter = new ItenFastFoodAdapter(list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return rootView;


        return rootView;

    }
}
