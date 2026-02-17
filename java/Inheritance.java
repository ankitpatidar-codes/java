 class Animal1{
   public  void eat(){
        System.out.println("Animal Was eating ");
    }

 }
 class Dog1 extends Animal{
    void Bark(){
        System.out.println("The dog was Bark");
    }
         }


public class Inheritance {
    static void main(String[] args) {
        Animal1 b1 = new Animal1();
        b1.eat();
        Dog1 b2 =new Dog1();
        b2.Bark();


    }
}
