package com.example.borgerkong;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;

public class MenuDetailActivity extends AppCompatActivity{

        private TextView itemNameTextView;
        private TextView priceTextView;
        private TextView kilojulesTextView;
        private TextView descriptionTextView;
        private ImageView imageView;
        //ElegantNumberButton orderUpdateButton;




        private ListView LView;
        ArrayList <String>ar = new ArrayList<String>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu_detail);

            // Get the intent that was used to travel to this activity
            Intent intent = getIntent();

            // Get the extra identified by "ArticleID" that was put into the intent at the origin.
            int menuitemID = intent.getIntExtra("MenuitemID", 0);

            // Now that we were passed the ID of the clicked item, we can get the rest of the data
            // from the "database". Imagine this could be a real SQL database.
            Menu menu = MenuDatabase.getMenuItemById(menuitemID);

            itemNameTextView = findViewById(R.id.detailItemName);
            priceTextView = findViewById(R.id.detailItemPrice);
            kilojulesTextView = findViewById(R.id.detailItemKilojules);
            descriptionTextView = findViewById(R.id.detailItemDescription);
            imageView = findViewById(R.id.detailItemPhoto);

            // Set the views to show the data of our object
            itemNameTextView.setText(menu.getItemName());
            priceTextView.setText(menu.getPrice());
            kilojulesTextView.setText(menu.getKilojules());
            descriptionTextView.setText(menu.getDescription());


            //Init view
            //orderUpdateButton = findViewById(R.id.orderUpdateButton);


            // Don't worry too much about images for now (but if you can get something to work then do)
            // Generally you don't want to store image data in your app (too much space required)
            // We'll learn the way to load images from the internet in a later week.

            // BUT we have included a way to show images that works for now.
            imageView.setImageResource(menu.getImageDrawableId());


            /*LView = (ListView) findViewById(R.id.ListView01);
            // Set option as Multiple Choice. So that user can able to select more
            // the one option
            final ArrayAdapter<String> adpt=new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_multiple_choice, ar);
            LView.setAdapter(adpt);
            LView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

            Button b = (Button) findViewById(R.id.add_item);
            final EditText d = (EditText) findViewById(R.id.title);
            b.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    ar.add(d.getText().toString());
                    adpt.setNotifyOnChange(true);
                    LView.setAdapter(adpt);
                }
            });*/

            /*/button
            final Button addtocartbtn = findViewById(R.id.addToOrder);
            addtocartbtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Code here executes on main thread after user presses button
                    AddedtoOrder.add();
                    Intent intent = new Intent(MenuDetailActivity.this, Cart.class);
                    startActivity(intent);
                }
            });*/



        }

}



