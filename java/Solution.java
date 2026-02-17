public class Solution {
   public  static void main(String[] args) {
        Addition c= new Addition();
        System.out.println(c.Add(10,20));
        System.out.println(c.Add(10,20,30));

    }
}
class Addition{
    public int Add(int a, int b){

        return a+b;
    }
    public int Add(int a, int b,int c){
        return a+b+c;
    }
}
