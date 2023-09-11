package Class2;

import java.util.Scanner;
public class NPR_to_USD {
    public static void main(String[] args) {
        double npr, usd, exchangerate;
        exchangerate = 0.00754598;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the npr amount: ");
        npr = sc.nextDouble();
        usd = npr*exchangerate;
        System.out.println("Your npr has converted to " + usd + " usd" );


    }
}

