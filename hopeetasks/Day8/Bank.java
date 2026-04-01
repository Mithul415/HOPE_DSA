class BankAccount{
    private double balance;
    void deposit(int amount){
        balance += amount;
        getBalance();
    }
    void withdraw(int amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Amount withdrawed is: "+ amount);
        } else {
            System.out.println("Balance Insufficient");
        }
    }
    void getBalance(){
        System.out.println("Account Balance is: "+ balance);
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount ksp = new BankAccount();
        ksp.deposit(500);
        ksp.withdraw(100);
        ksp.getBalance();
        BankAccount ksp1 = new BankAccount();
        ksp1.getBalance();
    }
}
