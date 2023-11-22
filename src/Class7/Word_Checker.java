package Class7;
import java.util.Scanner;
public class Word_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "Hello";
        System.out.print("Enter a word to check: ");
        String usertext = sc.nextLine();
        if (text.contains(usertext)) {
            System.out.println("The word is present.");
        } else {
            System.out.println("The word is not present.");
        }

    }
}