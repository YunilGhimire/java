package Class1;

import java.util.Scanner;
public class AdditionInput{
    public static void main(String[] args) {
        int num1,num2,sum;
        //object of scanner class
        Scanner sc = new Scanner(System.in);

        //displaying message for input
        System.out.println("Enter first number :");
        num1 = sc.nextInt();
        System.out.println("Enter second number :");
        num2 = sc.nextInt();

        //taking the value from input and storing in variable
        sum = num1+num2;
        System.out.println("The sum is :" +sum);

    }
}

