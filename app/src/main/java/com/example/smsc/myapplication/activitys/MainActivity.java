package com.example.smsc.myapplication.activitys;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.smsc.myapplication.R;
import com.example.smsc.myapplication.fragments.BarFragment;
import com.example.smsc.myapplication.fragments.CakeFragment;
import com.example.smsc.myapplication.fragments.CoffeeFragment;
import com.example.smsc.myapplication.fragments.FastFoodFragment;
import com.example.smsc.myapplication.fragments.PizzaFragment;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.menu);

        if (bottomNavigationView != null) {

            // Select first menu item by default and show Fragment accordingly.
//            Menu menu = bottomNavigationView.getMenu();
//            selectFragment(menu.getItem(0));

            // Set action to perform when any menu-item is selected.
            bottomNavigationView.setOnNavigationItemSelectedListener(
                    new BottomNavigationView.OnNavigationItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                            selectFragment(item);
                            return false;
                        }
                    });
        }
        FloatingActionButton button = (FloatingActionButton) findViewById(R.id.floating_button);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = (new Intent(MainActivity.this, ScreenFloatButton.class));
                startActivity(intent);
            }
        });


    }


    public BottomNavigationView getBottomNavigationView() {
        return bottomNavigationView;
    }

    protected void selectFragment(MenuItem item) {

        item.setChecked(true);

        switch (item.getItemId()) {
            case R.id.local_cafe:
                // Action to perform when Coffee Menu item is selected.
                pushFragment(new CoffeeFragment());
                break;
            case R.id.local_cake:
                // Action to perform when Cake Menu item is selected.
                pushFragment(new CakeFragment());
                break;
            case R.id.local_bar:
                // Action to perform when Bar Menu item is selected.
                pushFragment(new BarFragment());
                break;
            case R.id.local_fastfood:
                // Action to perform when Fast Food Menu item is selected.
                pushFragment(new FastFoodFragment());
                break;
            case R.id.local_pizza:
                // Action to perform when Pizza Menu item is selected.
                pushFragment(new PizzaFragment());
                break;
        }
    }

    protected void pushFragment(Fragment fragment) {
        if (fragment == null)
            return;

        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            FragmentTransaction ft = fragmentManager.beginTransaction();
            if (ft != null) {
                ft.replace(R.id.container, fragment);
                ft.commit();
            }
        }
    }
}