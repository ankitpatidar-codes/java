public class Calculator {
    ;

    public int Add(int a, int b){

        return a + b;
    }
    public int Subtract(int a, int b){

        return a - b;
    }


    void main(String[] args) {

        Calculator cal = new Calculator();

        int sum = cal.Add(20,30);
        int difference = cal.Subtract(20,30);

        System.out.println("Sum   " + sum);
        System.out.println("Differnce  "+difference);
    }
    }

