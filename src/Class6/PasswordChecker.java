package Class6;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        int maximumtries = 5;
        int tries = 0;

        String password = "Yunil123";
        Scanner sc = new Scanner(System.in);
        while(tries<maximumtries){

            System.out.println("Enter password: ");
            String correctpassword = sc.next();

            if(correctpassword.equals(password)){
                System.out.println("Correct password");
                break;
            }else{
                System.out.println("Incorrect password. Try Again");
                tries++;
            }if(tries==maximumtries){
                System.out.println("Maximum number of tries detected. Couldn't login");
            }

        }


    }
}

