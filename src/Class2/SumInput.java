package Class2;

import java.util.Scanner;
public class SumInput {
    public static void main(String[] args) {
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sum = num1+num2;
        System.out.println("The sum is: " + sum);

    }
}

