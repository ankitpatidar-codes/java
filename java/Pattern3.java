import java.sql.SQLOutput;

public class Pattern3 {
    static void main(String[] args) {

//        reversed pyramid
        for(int i = 4; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
