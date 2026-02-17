public class MultilevelInheritance {
    static void main(String[] args) {
        Manager b1  = new Manager();
        b1.Information();
        b1.EmployeeInfo();
        b1.InfoManager();





    }
}
class Person3 {
    public void Information() {

        String name = "ankit Patidar";
        int age = 21;
        int roll_no = 68;
        System.out.println("Name of Person  "+ name + "  And its age  "+ age + "  and its roll_no is "+roll_no);

    }
}

    class Employee2 extends Person3 {
        public void EmployeeInfo() {
            String name;
            int age;
            int Salary = 200000;
            float pfF = 20.5F;
            System.out.println("Salary of Employee  "+ Salary + "  And its pff  "+ pfF);
        }
    }
    class Manager extends Employee2 {
                public void InfoManager() {
                    String name;
                    int age;
                    int Salary;
                    float pfF;
                    String Manager_name = "Patidar";
                    int Manga_Salary = 500000;
                    System.out.println("Name of Manager is  "+ Manager_name + "  And its Salary   "+ Manga_Salary );

                }
            }





