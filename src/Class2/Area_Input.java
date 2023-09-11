package Class2;

import java.util.Scanner;

public class Area_Input {
    public static void main(String[] args) {
        double pi, r,area; // r = radius
        Scanner sc = new Scanner(System.in);
        pi = 3.14;
        System.out.println("Enter radius of the circle: ");
        r = sc.nextDouble();
        area = pi*r*r;
        System.out.println("Area of the circle is: " + area);
    }
}
