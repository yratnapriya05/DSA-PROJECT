import java.util.Scanner;

public class Login {

    public static boolean login(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.next();

        System.out.print("Enter Password: ");
        String password = sc.next();

        if(Signup.users.containsKey(email) &&
           Signup.users.get(email).equals(password)){

            System.out.println("Login Successful!");
            return true;
        }

        System.out.println("Invalid Credentials");
        return false;
    }
}
