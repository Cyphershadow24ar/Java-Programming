// 5: Create a Simple menu driven program for an ATM. Employ different methods
// like withdraw, check_balance, deposit, etc using an object of the ATM.

public class ATM {
    private double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Remaining balance: " + this.balance);
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + this.balance);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Remaining balance: " + this.balance);
    }

    public static void main(String[] args) {
        ATM atm = new ATM(1000);
        atm.checkBalance();
        atm.withdraw(500);
        atm.deposit(1000);
    }
}