public class Recursion1 {
    public static void PrintSum(int i , int  n , int sum){
        if( i == n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        PrintSum(i+1, n,sum);
    }

    static void main(String[] args) {
        PrintSum(1,5,0);
    }
}
