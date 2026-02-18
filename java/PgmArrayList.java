import java.util.ArrayList;
import java.util.Scanner;

public class PgmArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();



        list.add(10);
        list.add(20);
        list.add(25);
        list.add(40);
        list.remove(2);
        //list.set(3,30);
//       int size  = list.size();
//        System.out.println(list);
//        System.out.println("size of the ArrayList are  " + size );

        // How loop work using to print all ArrayList Element
        for(int i = 0; i<list.size();i++){
            System.out.print(list.get(i) + "  ");

        }

       // System.out.println(list.set(2,30));

       // System.out.println( list.remove(2));


        //System.out.println(element);

        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Ankit");
        s1.add("Patidar");
        System.out.println(s1);

    }
}
