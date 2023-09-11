package Class4;

import java.util.Scanner;
public class Weekend_or_Weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number: ");
        num = sc.nextInt();
        switch (num){
            case 1:
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");

            default:
                System.out.println("Invalid");

        }
    }
}
