package com.example.borgerkong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MenuDatabase {

    public static Menu getMenuItemById(int menuitemID) {
        return menuitems.get(menuitemID);
    }


    public static ArrayList<Menu> getAllMenuitems() {
        return new ArrayList<Menu>((List) Arrays.asList(menuitems.values().toArray()));
    }

    private static final HashMap<Integer, Menu> menuitems = new HashMap<>();


    static {
        menuitems.put(1, new Menu(
                1, "Grilled Chicken Caesar",
                "1710KJ", "$8.60",
                "Flame grilled Aussie chicken breast and premium eye bacon, topped with creamy Caesar sauce, parmesan cheese, tomato and lettuce on a toasted sesame seed bun.\n" +
                        "\n" + "➤ Contains Gluten, Eggs, Milk & milk products, Soy and Sesame.",
                R.drawable.grilledchickencaesar));

        menuitems.put(2, new Menu(
                2, "Classic Cheeseburger",
                "1320KJ", "$3.35",
                "Classic combo of a flame-grilled Aussie beef patty topped with cheese, crunchy pickle, mustard and tomato sauce, served on a freshly toasted sesame seed bun. Basic - but brilliant.\n" +
                        "\n" + "➤ Contains Gluten, Eggs, Milk & milk products, Soy and Sesame.",
                R.drawable.cheeseburger
        ));

        menuitems.put(3, new Menu(
                3, "Double Cheeseburger",
                "1920KJ", "$5.40",
                "The Classic Cheeseburger with twice the flavour. Two flame-grilled 100% beef patties, two slices of cheese, pickles, mustard and tomato sauce on a toasted sesame seed bun.\n" +
                        "\n" + "➤ Contains Gluten, Eggs, Milk & milk products, Soy and Sesame.",
                R.drawable.doublecheeseburger
        ));

        menuitems.put(4, new Menu(
                4, "Grilled Chicken",
                "1440KJ", "$6.80",
                "Flame-grilled chicken breast fillet, topped with fresh salad and our creamy Ranch dressing on a toasted sesame seed bun. If you love chicken, you will love our succulent flame-grilled breast fillet chicken burger.\n" +
                        "\n" + "➤ Contains Gluten, Eggs, Milk & milk products, Soy and Sesame.",
                R.drawable.grilledchickenburger
        ));

        menuitems.put(5, new Menu(
                5, "Grilled Chicken AVO BLT",
                "2170KJ", "$9.25",
                "Flame-grilled Aussie chicken breast fillet, premium eye bacon, melted cheese, smashed avocado with a drizzle of lemon dressing, topped with ripe hand-cut tomato, crisp lettuce and ranch sauce on a toasted sesame seed bun.\n" +
                        "\n" + "➤ Contains Gluten, Eggs, Milk & milk products, Soy and Sesame.",
                R.drawable.grilledchickenblt
        ));

        menuitems.put(6, new Menu(
                6, "Big Fish",
                "1410KJ", "$5.35",
                "100% Fish Fillet topped with creamy, zesty tartar sauce, melted cheese topped with fresh shredded lettuce. \n" +
                        "\n" + "➤ Contains Gluten, Eggs, Milk & milk products, Soy and Sesame.",
                R.drawable.fishburger
        ));

        menuitems.put(7, new Menu(
                7, "Vegan Cheeseburger",
                "2700KJ", "$7.60",
                "Yes, 100% Vegan! Double vegan patty (made from corn, capsicum and carrot), vegan cheese and vegan mayonnaise with tomato sauce, onions, fresh tomato and crisp lettuce on a delicious seeded bun.\n" +
                        "\n" + "➤ Contains Gluten, Soy and Sesame.",
                R.drawable.vegancheeseburger
        ));

        menuitems.put(8, new Menu(
                8, "Chicken Nuggets",
                "1190KJ", "$3.95",
                "6 pieces of crispy, golden nuggets made with 100% chicken breast, cooked in sunflower and canola oil for a better tasting golden finish. Our nuggets are as good as gold. Choose from our delicious dipping sauces BBQ (258KJ), Spicy (520KJ), Honey Mustard (360KJ) or Sweet 'n Sour sauce (193KJ).\n" +
                        "\n" + "➤ Contains Gluten and Eggs.",
                R.drawable.chickennuggets
        ));

        menuitems.put(9, new Menu(
                9, "Soft Serve Cone",
                "860KJ", "$0.70",
                "They say the simple things in life are often the best and our soft serve is no exception. Rich creamy vanilla soft serve in a crispy cone.\n" +
                        "\n" + "➤ Contains Gluten, Milk & milk products and Soy.",
                R.drawable.softserve
        ));

        menuitems.put(10, new Menu(
                10, "Chocolate Sundae",
                "1090KJ", "$2.00",
                "Finish a meal or treat yourself with our rich and velvety vanilla soft serve chocolate sundae topped with a wicked gooey chocolate fudge sauce.\n" +
                        "\n" + "➤ Contains Milk & milk products.",
                R.drawable.chocolatesundae
        ));

        menuitems.put(11, new Menu(
                11, "Caramel Sundae",
                "1130KJ", "$2.00",
                "If you love the taste of warm sweet caramel sauce then you'll find this hard to resist. The Borger King classic rich creamy vanilla ice cream topped with a creamy caramel fudge sauce.\n" +
                        "\n" + "➤ Contains Milk & milk products.",
                R.drawable.caramelsundae
        ));

        menuitems.put(12, new Menu(
                12, "Apple Pie",
                "1080KJ", "$1.50",
                "Crisp pastry, lovingly filled with aussie apples for that extra sweet taste. Served piping hot.\n" +
                        "\n" + "➤ Contains Gluten, Milk & milk products, Soy and Sesame.",
                R.drawable.applepie
        ));

        menuitems.put(13, new Menu(
                13, "Chocolate Pie",
                "1010KJ", "$1.50",
                "Crisp pastry, lovingly filled with gooey chocolate custard for that extra sweet taste. Served piping hot.\n" +
                        "\n" + "➤ Contains Gluten, Eggs, Milk & milk products, Soy and Sesame.",
                R.drawable.chocolatepie
        ));

        menuitems.put(14, new Menu(
                14, "Coco-Cola",
                "751KJ", "$3.40",
                "Your favourite thirst-quenching Coca-Cola. Medium-sized 500ml.",
                R.drawable.coke
        ));

        menuitems.put(15, new Menu(
                15, "Sprite",
                "751KJ", "$3.40",
                "Let Sprite refresh your day with the great taste of lemon-lime. Medium-sized 500ml.",
                R.drawable.sprite
        ));

        menuitems.put(16, new Menu(
                16, "Mount Franklin Spring Water",
                "0KJ", "$3.40",
                "Need a hydration top up? We have Australia's favourite water brand, Mount Franklin® Spring Water - 600ml.",
                R.drawable.water
        ));

    }
}
