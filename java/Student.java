

class Student {
    String name;
    int age;

    public void displayInfo() {
        System.out.println("Name  " + name);
        System.out.println("Age  " +age);
    }


    void main(String[] args) {

        Student s1 = new Student();

        s1.name="Ankit";
        s1.age = 21;

        s1.displayInfo();
    }
}