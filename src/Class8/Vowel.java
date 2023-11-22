package Class8;
import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
    String word = "APPLE".toLowerCase();
        for(int i = 0;i<word.length();i++){
            char vowel = word.charAt(i);
            if (vowel == 'a' ||vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u'){
                System.out.println(vowel + " is a vowel");
            }

        }

    }
}
