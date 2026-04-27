public class Order {

    public static void placeOrder(){

        if(Cart.cart.isEmpty()){
            System.out.println("Cart is empty");
            return;
        }

        System.out.println("\nOrder Placed Successfully!");
        System.out.println("Thank you for ordering.");
    }
}
