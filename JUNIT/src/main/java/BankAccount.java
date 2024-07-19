public class BankAccount {
    private double balance;
    private double minBalance;

    public BankAccount(double balance, double minBalance) {
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public double withdraw(double amount) {
        if (balance - amount > minBalance) {
            balance -= amount;
            return amount;
        } else {
            throw new RuntimeException();
        }
    }

    public double depost(double amount){
        return balance += amount;
    }
}

