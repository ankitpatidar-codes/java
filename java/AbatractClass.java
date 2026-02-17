public class AbatractClass {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car2();

        v1.start();
        v2.start();

    }
}
abstract class Vehicle {
   public  abstract void start();

}
    class Bike extends Vehicle {
   public  void start(){ 
        System.out.println("Bike Start using the petrol");
 }
    }
    class Car2 extends Vehicle{
    public void start(){
        System.out.println("Car start usnig the diseal");
    }

    }

