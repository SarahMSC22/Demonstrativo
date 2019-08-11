package com.example.smsc.myapplication.lists;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.smsc.myapplication.R;
import com.example.smsc.myapplication.activitys.CoffeeActivity;

public class ListCoffeAdpater extends RecyclerView.Adapter<ListCoffeAdpater.ViewHolder> {
    private ListCoffe[] listCoffesdata;

    // RecyclerView recyclerView;
    public ListCoffeAdpater(ListCoffe[] listCoffesdata) {
        this.listCoffesdata = listCoffesdata;
    }

    @Override
    public ListCoffeAdpater.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_coffe_item, parent, false);
        ListCoffeAdpater.ViewHolder viewHolder = new ListCoffeAdpater.ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ListCoffeAdpater.ViewHolder holder, final int position) {
        final ListCoffe myListData = listCoffesdata[position];
        holder.textView.setText(listCoffesdata[position].getTitle());
        holder.imageView.setImageResource(listCoffesdata[position].getImgId());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(), "click em: " + listCoffesdata[position].getTitle(), Toast.LENGTH_LONG).show();
                Intent intent = (new Intent(view.getContext(), CoffeeActivity.class));
                Bundle bundle = new Bundle();
                bundle.putSerializable("item", listCoffesdata[position]);
                intent.putExtra("pacote1", bundle);
                view.getContext().startActivity(intent);


            }
        });
        holder.ratingView.setProgress(listCoffesdata[position].getNumStars());
    }


    @Override
    public int getItemCount() {
        return listCoffesdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final RatingBar ratingView;
        public ImageView imageView;
        public TextView textView;
        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
            this.textView = (TextView) itemView.findViewById(R.id.textView);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayout);
            ratingView = (RatingBar) itemView.findViewById(R.id.ratingBar);
        }

//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//
//            BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.menu);
//
//        }
    }
}
