import java.util.*;

public class UserToInputArray {

    static void main(String[] args) {



        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int number [] = new int [size];

        // For input
        for(int i = 0; i<size; i++){
            number [i] = sc.nextInt();
        }
        //output
        for(int i = 0; i<size;i++){
            System.out.println(number[i]);
        }

    }
}
