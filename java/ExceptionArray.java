public class ExceptionArray {
    public static void main(String[] args) throws Exception {
        int age  = 17;
        try {
            if (age < 18) {
                throw new ArithmeticException("You are not eligible to vote");
            } else {
                System.out.println("You can Vote ");
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program excuation has finished ");

    }
    }
