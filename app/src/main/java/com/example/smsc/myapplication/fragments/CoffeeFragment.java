package com.example.smsc.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smsc.myapplication.lists.ListCoffe;
import com.example.smsc.myapplication.lists.ListCoffeAdpater;
import com.example.smsc.myapplication.R;

import java.util.Random;

public class CoffeeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_coffee,container, false);

        ListCoffe[] listCoffes = new ListCoffe[] {
                new ListCoffe("Expresso", R.drawable.item_1, getNumStars(),"aaaaaaa\nbbbbbb\ncccccccc"),
                new ListCoffe("Cafe com leite", R.drawable.item_2, getNumStars(),"caca me julga"),
                new ListCoffe("Capuccino", R.drawable.item_3, getNumStars(),"o tempo todo"),
                new ListCoffe("Mocha", R.drawable.item_4, getNumStars(), "só pq eu n entendo essa bagaça"),
                new ListCoffe("Pingado", R.drawable.item_5, getNumStars(),"ele não me ama mais"),
                new ListCoffe("Macchiato", R.drawable.item_6, getNumStars(), "e só da risada de mim"),
                new ListCoffe("Expresso",R.drawable.item_1, getNumStars(), "e além de tudo"),
                new ListCoffe("Cafe com leite", R.drawable.item_2, getNumStars(), "diz que vai me bater o tempo todo!"),
                new ListCoffe("Capuccino",R.drawable.item_3, getNumStars(), "fui julgada neste exato momento"),
                new ListCoffe("Mocha", R.drawable.item_4, getNumStars(), "ele vai dormir na sala hoje"),
                new ListCoffe("Pingado", R.drawable.item_5, getNumStars(), "não ta merecendo dormir encostando bumbum com bumbum"),
                new ListCoffe("Macchiato", R.drawable.item_6, getNumStars(), "depois de tanto sofrimento, vou é embora dessa vida!"),
        };

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        ListCoffeAdpater adapter = new ListCoffeAdpater(listCoffes);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return rootView;
    }

    private int getNumStars(){
        return new Random().nextInt(6);

    };
}