package Class8;

import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        int number,remainder,sum = 0;
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        while (number>0){
            remainder = number%10;
            sum = sum+remainder;
            number = number/10;

        }
        System.out.println("Sum of the number is: " + sum);
    }
}
