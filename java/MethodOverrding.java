public class MethodOverrding {
     public static void main(String[] args) {
         Shape2 s = new Circle1();
         s.draw();


    }
}
 class Shape2{
    void draw(){
        System.out.println("Drawing a shape");
    }
 }
 class Circle1 extends Shape2{
    void draw(){
        System.out.println("Drawing a Circle ");
    }

 }
