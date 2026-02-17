import java.util.*;

public class Method {
    public static  void PrintMyName(String name){
        System.out.println(name);
        return;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Plese Enter your name");
        String name = sc.nextLine();

        PrintMyName(name);// calling function
    }
}
