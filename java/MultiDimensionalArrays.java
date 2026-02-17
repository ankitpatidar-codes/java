public class MultiDimensionalArrays {
    static void main(String[] args) {
        int arr[] [] = new  int [2] [3];

        arr[0][0] = 100;
        arr[0][1] = 200;
        arr[0][2] = 100;
        arr[1][0] = 200;
        arr[1][1] = 100;
        arr[1][2] = 200;

        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length;j++){
                System.out.print(arr[i][j]);
                System.out.println(" ");

            }
            System.out.println();
        }

    }
}
