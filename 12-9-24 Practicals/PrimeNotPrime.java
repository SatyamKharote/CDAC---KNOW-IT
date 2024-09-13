import java.util.Scanner;

public class PrimeNotPrime {
    public static void main(String[] args) {
          
        int num=13, count = 0, i;
        
        
        for (i = 2; i < num ; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Entered number is prime");
        }
         else {
            System.out.println("Entered number is not prime");
        }
        
    }
}
