package Class3;

import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        String book1 = "Math";
        int price1 = 500;
        String book2 = "Physics";
        int price2 = 700;
        String book3 = "Chemistry";
        int price3 = 650;
        String book;
        int quantity;
        System.out.println("Enter the book you want: ");
        Scanner sc = new Scanner(System.in);
        book = sc.next();


        if (book.equals(book1) ){
            System.out.println("The book you have selected is " + book1 + " and its price is " + price1);
        } else if (book.equals(book2)) {
            System.out.println("The book you have selected is " + book2 + " and its price is " + price2);


        } else if (book.equals(book3)) {
            System.out.println("The book you have selected is " + book3 + " and its price is " + price3);

        }
        else{
            System.out.println("The book is not here");
        }
        System.out.println("Enter the quantity of book you want: ");
        quantity = sc.nextInt();

        if (book.equals(book1) ){
            int total1 = quantity*price1;
            System.out.println("Your total price is:" + total1);
        } else if (book.equals(book2)) {
            int total2= quantity*price2;
            System.out.println("Your total price is:" + total2);

        } else if (book.equals(book3)) {
            int total3 = quantity*price3;
            System.out.println("Your total price is:" + total3);

        }


    }
}
