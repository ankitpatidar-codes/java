public class Employee {

    private String name;
    private int salary;

public String getname(){
    return  name;
}
public void setname(){
    this.name = "Ankit Patidar";
}

public int getsalary(){
    return salary;

}
    void setsalary(){
    this.salary = 500000;
    }


    static void main(String[] args) {
    Employee obj = new Employee();
   obj.setname();
    obj.setsalary();

        System.out.println("MY name is  "+ obj.getname());
        System.out.println("MY Salary is  "+ obj.getsalary());

    }
}
