package com.example.borgerkong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.rv_mainmenu);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        MenuAdapter menuAdapter = new MenuAdapter();

        // We wrote our setData method to be like a setter, so we give our ArrayList from
        // MenuDatabase to the Adapter.

        menuAdapter.setData(MenuDatabase.getAllMenuitems());
        recyclerView.setAdapter(menuAdapter);


        //cart stuff
        Button vieworderbtn = (Button) findViewById(R.id.vieworder);
        vieworderbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openCart();
            }
        });

    }

    public void openCart() {
        Intent intent = new Intent(this, Cart.class);
        startActivity(intent);
    }



}
