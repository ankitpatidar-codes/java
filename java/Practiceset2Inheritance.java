  class Person1 {
      String name;
      int age;


      Person1(String name, int age) {
          this.name = name;
          this.age = age;
      }
  }
  class Student2 extends Person1 {
    String grade;

   public  Student2(String name, int age, String grade){
       super(name,age);
       this.grade = grade;

    }
    void DisplayDeatials(){
        System.out.println("Name  "+name);
        System.out.println("age  "+age);
        System.out.println("grade  "+grade);
    }

  }


public class Practiceset2Inheritance {
    static void main(String[] args) {

        Student2 obj = new Student2("Ankit",21,"A");
        obj.DisplayDeatials();

    }
}

