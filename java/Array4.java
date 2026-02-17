public class Array4 {
    static void main(String[] args) {
      int arr [] = {20,30,40,50,88,568,670};
      int max = 0;

      for(int i = 0; i<arr.length;i++){
          if(arr[i]>max){
              max = arr[i];
          }
      }
        System.out.println(max);
    }
}
