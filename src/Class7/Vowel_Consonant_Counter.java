package Class7;

import java.util.Scanner;

public class Vowel_Consonant_Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userString = sc.nextLine();

        userString = userString.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < userString.length(); i++) {
            char currentChar = userString.charAt(i);

            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            } else if (Character.isLetter(currentChar)) {
                consonantCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

    }
}
