package Class2;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        double F, C; // F = fahrenheit and C = Celsius
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit: " );
        F = sc.nextDouble();
        C = (F-32)*5/9;
        System.out.println("The temperature in celsius is: " + C);



    }
}

