import java.util.*;
public class Practice10 {

//    public static void printArray(int arr[]){
//        System.out.print("Sorted array is: ");
//        for( int i = 0 ; i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//    }

   public  static void main(String[] args) {

       int arr[] = {8, 3, 5, 6, 2, 4, 1};


       for (int i = 0; i < arr.length-1; i++) {
           for (int j = 0; j < arr.length-i-1; i++) {

               if (arr[j] > arr[j + 1]) {

                  int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j+1] = temp;
               }
           }
       }
       
       // printArray(arr);
       System.out.print("Sorted array is: ");
       for (int num : arr) {
           System.out.print(num + " ");
       }

   }


}



