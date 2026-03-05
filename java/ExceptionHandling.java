import java.util.Scanner;


public class ExceptionHandling {
    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number a and b");

        a = sc.nextInt();
        b = sc.nextInt();
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Division error");
        }
        finally{
            System.out.println("this is finally block");
        }
        c = a*b;
        System.out.println(c);
        c = a+b;
        System.out.println(c);

    }
}
