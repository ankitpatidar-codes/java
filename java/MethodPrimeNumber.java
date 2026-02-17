
import java.util.Scanner;
public class MethodPrimeNumber {

    public static int  CheckPrime(int num){
        if(num <= 1){

            System.out.println("It is a not prime number");
        }
        for(int i= 2; i<=num;i++){
            if(num % i == 0){
                System.out.println("It is a  prime number");

            }
        }

        return 0;
    }

    static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter a number for check it is a prime or not ");

        int num = sc.nextInt();

        CheckPrime(num);
    }
}
