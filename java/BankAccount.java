public class BankAccount {
    private double  balance;

    void Deposite (double amount){
        if(amount > 0){
            balance += amount ;
            System.out.println("Deposited  " + amount);
        }else {
            System.out.println("Invalid  Deposite amount");
        }
    }
    void Withdraw(double amount ){
        if (amount > 0 && amount <= balance ){
            balance -=  amount;
            System.out.println("Withdraw  " + amount);
        }else {
            System.out.println("Invalid or Insufficient balance ");
        }
    }
    public double getbalance(){
        return balance;
    }
    static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.Deposite(1000);
        account.Withdraw(300);
        System.out.println("Current Balance " + account.getbalance());


    }
}
