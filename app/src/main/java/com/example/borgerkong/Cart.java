package com.example.borgerkong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);


        //cart stuff
        Button ordermorebtn = (Button) findViewById(R.id.orderMore);
        ordermorebtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openMainMenu();
            }
        });

    }

    public void openMainMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}