package Class2;

import java.util.Scanner;
public class SI_Input {
    public static void main(String[] args) {
        // p = principle, t = time, r= rate
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        float r = sc.nextFloat();
        double SI = (p*t*r)/100;
        System.out.println("The simple interest is: " + SI);

    }
}
