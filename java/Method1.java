import java.util.*;

public class Method1 {

    public static int AddSum(int a, int b){
       int  sum = a + b;

        return sum;

    }

    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the two number for sum");

        int a = sc.nextInt();
        int b =sc.nextInt();




       int sum =  AddSum( a,  b);
        System.out.println(sum);



    }

}
