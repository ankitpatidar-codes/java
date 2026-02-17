// Factorial using recursion

public class Recursion2 {
    public static int fact(int n){
        if(n==1 || n == 0){
            return 1;
        }
         int fact_nm1 = fact(n-1);
         int fact_n = n * fact_nm1;
         return fact_n;
    }
    static void main(String[] args) {

        int ans = fact(5);
        System.out.println(ans);

    }
}
