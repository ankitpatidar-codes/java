public class Car1 {
    String Brand ;
    int price ;

    Car1(String b, int p){
        Brand = b;
        price = p;
    }

    void DisplayInfo(){
        System.out.println("Brand of car  "+ Brand);
        System.out.println("Price of car is  "+ price);
    }
    static void main(String[] args) {
        Car1 c1 = new Car1("Toyota",5000000 );
        Car1 c2 = new Car1("Mhindra", 1500000);
        c1.DisplayInfo();
        c2.DisplayInfo();



    }
}
