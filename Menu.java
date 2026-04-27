import java.util.ArrayList;

public class Menu {

    static ArrayList<FoodItem> items = new ArrayList<>();

    static{

        items.add(new FoodItem(1,"Burger",120));
        items.add(new FoodItem(2,"Pizza",250));
        items.add(new FoodItem(3,"Sandwich",100));
        items.add(new FoodItem(4,"Pasta",180));

    }

    public static void showMenu(){

        System.out.println("\n---- MENU ----");

        for(FoodItem f : items){
            f.display();
        }
    }
}
