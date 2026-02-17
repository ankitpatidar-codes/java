
import java.util.*;
public class Method3 {

    public static int  EvenNumber( int num) {
        int fact = 1;
        for (int i= 1; i<=num; i++) {
             fact = fact * i;


        }
        return fact;
    }


    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number ");
        int num =sc.nextInt();

        int fact = EvenNumber(num);

        System.out.println(fact);

    }
}
