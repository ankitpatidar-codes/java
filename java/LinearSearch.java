public class LinearSearch {
    static void main(String[] args) {
        int num []  = {20,23,4,3,43,5,3,525,25};

        int target = 3;
        int ans = Linear(num,target);
        System.out.println(ans);


    }
    static int Linear(int arr [], int target){

        if(arr.length == 0){
            return -1;

        }
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return element;
            }
        }
        return -1;
    }



    }

