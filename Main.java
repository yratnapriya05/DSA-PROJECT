import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==== Smart Online Food Ordering System ====");

        System.out.println("1. Signup");
        System.out.println("2. Login");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if(choice == 1){
            Signup.register();
        }

        if(Login.login()){

            Menu.showMenu();

            System.out.print("Enter item number: ");
            int item = sc.nextInt();

            Cart.addItem(Menu.items.get(item-1));

            Cart.viewCart();

            Order.placeOrder();
        }
        else{
            System.out.println("Login Failed!");
        }

    }
}
