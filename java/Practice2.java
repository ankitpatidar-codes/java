class Person2 {
    private String name;
    private int age;


    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getname() {
        return name;
    }

    public void setname() {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage() {
        this.age = age;
    }

    public void display(){
        System.out.println("Name  "+ name);
        System.out.println("age  "+ age);
    }

}
class Employee1 extends Person2{
    private double salary;

    Employee1(String name , int age , double salary ){
        super(name,age);
        this.salary = salary;

    }
    public double getsalary(){
        return salary;
    }
    public void  setsalary(){
        this.salary = salary;
    }
   public  void display(){
        super.display();
       System.out.println("Salary "+salary);
    }

}

public class Practice2 {
    static void main(String[] args) {

        Employee1 emp = new Employee1("Ankit",21,5000);
        emp.display();

    }
}
