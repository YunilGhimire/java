package Class5;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        int maximumtries = 3;
        int tries = 0;
        String name = "Yunil";
        String password = "Yunil123";
        Scanner sc = new Scanner(System.in);
        while(tries<maximumtries){
            System.out.println("Enter username: ");
            String username = sc.next();
            System.out.println("Enter password: ");
            String correctpassword = sc.next();

            if(username.equals(name) && correctpassword.equals(password)){
                System.out.println("Logged in");
                break;
            }else{
                System.out.println("Login failed");
                tries++;
            }if(tries==maximumtries){
                System.out.println("Maximum number of tries detected. Couldn't login");
            }

        }


    }
}
