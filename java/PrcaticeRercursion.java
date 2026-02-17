import org.w3c.dom.ls.LSOutput;

public class PrcaticeRercursion {
    public static void PrintSum(int n,int sum) {
        if (n == 0) {
            System.out.println(sum);
            return ;

        }
        sum += n;
        PrintSum(n - 1, sum);
    }




    static void main(String[] args) {
        int sum = 0;
        int n = 5;

        PrintSum(n,sum);




    }
}
