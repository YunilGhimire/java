package Class7;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.next();

        System.out.print("Enter password: ");
        String password = sc.next();

        if (password.length() == 8 && password.contains("@")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid password. Make sure the password is 8 characters long and includes '@'");
        }
    }
}
