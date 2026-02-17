public class Car {
    String Brand;
    int Speed;

    Car(String b , int  s){
        Brand = b;
        Speed = s;
    }

    void accerlate(){
        Speed += 10;
        System.out.println(Brand +    "   Speed is increrase  " + Speed + "km/h" );
    }
    void Break(){
       Speed -= 10;
       if (Speed < 0) {
           Speed = 0;
       }
           System.out.println(Brand +  "   Slowed Down . corrent speed :  " +Speed  +"km/h");

    }

    static void main(String[] args) {
        Car car1 = new Car("Toyota",60);
        car1.accerlate();
        car1.Break();
        car1.accerlate();
        car1.accerlate();
        car1.accerlate();
        car1.accerlate();
        car1.Break();
        car1.Break();





    }
}
