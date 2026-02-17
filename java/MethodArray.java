public class MethodArray {
    public static int Array() {
        int sum = 0;
        int arr [] = {10,20,30,40};

            for(int i = 0;i<arr.length;i++){
                sum =+arr[i];

            }


        return sum;

    }

    static void main(String[] args) {
      int sum;
       sum =  Array();
        System.out.println(sum);

    }
}
