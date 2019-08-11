package com.example.smsc.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.smsc.myapplication.activitys.MainActivity;
import com.example.smsc.myapplication.R;

public class BarFragment  extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bar,container, false);

        Button button =(Button) rootView.findViewById(R.id.button_bar);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick (View v) {
                ((MainActivity)getContext()).getBottomNavigationView().setSelectedItemId(R.id.local_fastfood);
            }
        });




        return rootView;
    }
}
