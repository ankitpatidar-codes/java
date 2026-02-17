public class PrintVowals {

    static void main(String[] args) {
        String str = "Ankit";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));


            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
          count++;
            }
        }
        System.out.println("Vowals are   " +count);

    }
}




