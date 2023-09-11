package Class2;

import java.util.Scanner;

public class Area_Square {
    public static void main(String[] args) {
        double length, area;
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        area = length * length;
        System.out.println("The area of square " + area);

    }
}
