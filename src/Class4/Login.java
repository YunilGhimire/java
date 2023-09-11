package Class4;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.next();

        System.out.print("Enter password: ");
        String password = sc.next();

        if (username.equals("Yunil") && password.equals("Yunil123")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Try again");
        }

    }
}