package Class7;
import java.util.Scanner;
public class Word_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "Hello";
        System.out.print("Enter a word to check: ");
        String word = sc.nextLine();
        if (text.contains(word)) {
            System.out.println("The word is present in the string.");
        } else {
            System.out.println("The word is not present in the string.");
        }

    }
}