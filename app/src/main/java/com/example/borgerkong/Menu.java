package com.example.borgerkong;

public class Menu {

    // unique identifier of a menu item
    private int menuitemID;

    // Name of the Menu Item
    private String itemName;
    // Amount of Kilojules
    private String kilojules;
    // Price of the Menu Item
    private String price;
    // Description of the Menu Item
    private String description;
    // Resource ID of associated image (e.g. R.drawable.my_image)
    private int imageDrawableId;




    public Menu(int menuitemID, String itemName, String kilojules, String price, String description, int imageDrawableId) {
        this.menuitemID = menuitemID;
        this.itemName = itemName;
        this.kilojules = kilojules;
        this.price = price;
        this.description = description;

        // Added this line for temporary way of showing images
        this.imageDrawableId = imageDrawableId;
    }


    public int getMenuitemID() {
        return menuitemID;
    }

    public void setMenuitemID(int menuitemID) {
        this.menuitemID = menuitemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getKilojules() {
        return kilojules;
    }

    public void setKilojules(String kilojules) {
        this.kilojules = kilojules;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }
}
