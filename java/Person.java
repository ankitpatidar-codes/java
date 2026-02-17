public class Person {
    String name;

    Person (String n) {
        name = n;
    }
       void SayHello(){
            System.out.println("Hello , my name is  "+ name);

    }
    static void main(String[] args) {
        Person p1 = new Person ("Ankit ");
        p1.SayHello();

    }
}
