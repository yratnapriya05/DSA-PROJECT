import java.util.HashMap;
import java.util.Scanner;

public class Signup {

    static HashMap<String,String> users = new HashMap<>();

    public static void register(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.next();

        System.out.print("Enter Password: ");
        String password = sc.next();

        users.put(email,password);

        System.out.println("Signup Successful!");
    }
}
