public class MethodOverloading {
    static void main(String[] args) {
        Circle c1 = new Circle();
        c1.Draw(10, "Circle");
        c1.Draw(20);
        //Shape1 s = new Shape1();
        //s.Draw(10);




    }
}

 class Shape1{
    void Draw(int a){
        System.out.println(a);
    }

        }
        class Circle extends Shape1{
     void Draw(int a , String ab){
         System.out.println(ab);
     }
        }



