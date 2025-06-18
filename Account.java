import java.io.Serializable;

public class Account implements Serializable {
    private int accountNo;
    private String name;
    private double balance;

    public Account(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNo() { return accountNo; }
    public String getName() { return name; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}