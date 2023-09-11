package Class4;

import java.util.Scanner;
public class Highestnote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int amount = sc.nextInt();

        int[] money = {1000, 500, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Highest note:");

        for (int note : money) {
            if (amount >= note) {
                int count = amount / note;
                System.out.println(count + "-" + note + " note");
                amount = amount % note;
            }
        }

        if (amount > 0) {
            System.out.println("Other: " + amount);
        }
    }
}
