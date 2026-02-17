public class Array5 {
    static void main(String[] args) {
        int count=0;
        int arr[] = {-1,3,-5,6,0};

        for(int i = 0; i<arr.length;i++){
            if(arr[i] < 0){
                count++;


            }
        }
        System.out.println(count);
    }
}
