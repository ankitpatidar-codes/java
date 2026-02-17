
// fibonacci sequence to n th term

public class RecursionFibonacci {
    public static void PrintFib(int a , int b , int n){

        if(n == 0){
            return ;
        }

     int c = a+b;
        System.out.println(c);
        PrintFib(b,c,n-1);// ye n-1 es liye liya hai n ki vlaue decrement hoti jaye
    }

    static void main(String[] args) {
        int a = 0 , b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        PrintFib(a,b,n-2);// ye jo n-2 hai vo isliye ki apne ko phele se hi a and b diya hai
    }
}
