package com.example.borgerkong;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    // class variable that holds the data that we want to adapt
    private ArrayList<Menu> menuitemsToAdapt;

    public void setData(ArrayList<Menu> menuitemsToAdapt) {
        // This is basically a Setter that we use to give data to the adapter
        this.menuitemsToAdapt = menuitemsToAdapt;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // First create a View from the layout file. It'll probably be a ViewGroup like
        // ConstraintLayout that contains more Views inside it.
        // This view now represents your entire one item.
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.menu, parent, false);

        // Then create an instance of your custom ViewHolder with the View you got from inflating
        // the layout.
        MenuViewHolder menuViewHolder = new MenuViewHolder(view);
        return menuViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        final Menu menuAtPosition = menuitemsToAdapt.get(position);

        holder.itemNameTextView.setText(menuAtPosition.getItemName());
        holder.priceTextView.setText(menuAtPosition.getPrice());
        holder.kilojulesTextView.setText(menuAtPosition.getKilojules());


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, MenuDetailActivity.class);
                intent.putExtra("MenuitemID", menuAtPosition.getMenuitemID());
                context.startActivity(intent);
            }
        });

        /*holder.shareImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(Intent.ACTION_SEND);

                intent.putExtra(Intent.EXTRA_TEXT, menuAtPosition.getItemName());
                intent.setType("text/plain");
                context.startActivity(intent);
            }
        });*/

        holder.itemImageView.setImageResource(menuAtPosition.getImageDrawableId());
    }

    @Override
    public int getItemCount() {
        return menuitemsToAdapt.size();
    }

    // ViewHolder represents one item, but doesn't have data when it's first constructed.
    // We assign the data in onBindViewHolder.
    public static class MenuViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView itemNameTextView;
        public TextView priceTextView;
        public TextView kilojulesTextView;
        //public ImageView shareImageView;
        public ImageView itemImageView;

        // This constructor is used in onCreateViewHolder
        public MenuViewHolder(View v) {
            super(v);  // runs the constructor for the ViewHolder superclass
            view = v;
            itemNameTextView = v.findViewById(R.id.itemName);
            priceTextView = v.findViewById(R.id.itemPrice);
            kilojulesTextView = v.findViewById(R.id.itemKilojules);
            //shareImageView = v.findViewById(R.id.itemShareButton);
            itemImageView = v.findViewById(R.id.itemPhoto);
        }
    }


}