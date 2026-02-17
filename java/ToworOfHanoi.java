public class ToworOfHanoi {
    public static void Towor(int n, String src,String helper , String dest){
        if(n==1){
            System.out.println("Transfer disk "+ n +" from " + src + " to " +dest);
           return;
        }

        Towor(n-1,src, dest, helper);
        System.out.println("Transfer disk "+ n +" from " + src + " to " + dest);
        Towor(n-1,helper, src,dest);
    }
    static void main(String[] args) {

        int n = 2;
        Towor(n,"S","H","D");



    }
}
