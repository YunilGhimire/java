package Class4;

import java.util.Scanner;
public class Greatestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter num1: ");
        a = sc.nextInt();
        System.out.println("Enter num2: ");
        b = sc.nextInt();
        System.out.println("Enter num3: ");
        c = sc.nextInt();

        if (a>b && a>c){
            System.out.println("Num1 is greater than Num2 and Num3");
        } else if (b>a && b>c) {
            System.out.println("Num2 is greater than Num1 and Num3");
        }else{
            System.out.println("Num3 is greater than Num1 and Num2");
        }
    }
}
