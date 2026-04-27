import java.util.ArrayList;

public class Cart {

    static ArrayList<FoodItem> cart = new ArrayList<>();

    public static void addItem(FoodItem item){

        cart.add(item);
        System.out.println(item.name + " added to cart");
    }

    public static void viewCart(){

        double total = 0;

        System.out.println("\n---- CART ----");

        for(FoodItem f : cart){
            f.display();
            total += f.price;
        }

        System.out.println("Total = ₹" + total);
    }
}
