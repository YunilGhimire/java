package Class1;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        String name;
        //object of scanner class
        Scanner sc = new Scanner(System.in);
        //displaying message for input
        System.out.println("Enter name:");
        //taking the value from input and storing in variable
        name = sc.next();
        System.out.println("The name is " + name);

    }
}

