
class Animal{
     void MakeSound(){
         System.out.println("Animal makes sound");
     }
}
class Dog extends Animal{
    void MakeSound(){
        System.out.println("Dog barks");
    }
}


public class PracticeSetInheritance {
    static void main(String[] args) {

        Animal obj1 = new  Animal();
        obj1.MakeSound();
        Dog obj2 = new Dog();
        obj2.MakeSound();

    }


}
