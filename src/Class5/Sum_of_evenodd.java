package Class5;

public class Sum_of_evenodd {
    public static void main(String[] args) {
        int sumofeven = 0 ;
        int sumofOdd = 0;
        for(int i = 1; i <=10; i++){
            if(i%2 == 0){
                sumofeven += i;
            }
            else{
                sumofOdd += i;
            }

        }
        System.out.println("Sum of even number " +sumofeven);
        System.out.println("Sum of odd number " +sumofOdd);
        if (sumofeven>sumofOdd){
            System.out.println("Sum of even is greater");
        }else {
            System.out.println("Sum of odd is greater");
        }
    }

}
