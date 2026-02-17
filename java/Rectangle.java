public class Rectangle {
    int  length;
    int width;

    public void SetDimensional(int l, int w){
        length = l;
        width = w;
        System.out.println("ankit patidar");
    }
     public int Area(){
       return length * width;


    }
    static void main(String[] args) {

        Rectangle rect = new Rectangle ();
        rect.SetDimensional(5,10);
//        rect.Area();
        System.out.println(rect.Area());

    }
}
