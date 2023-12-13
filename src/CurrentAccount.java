public class CurrentAccount implements Account {

    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public double calculateInterest() {
        // Current account may not have interest
        return 0;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void performCurrentOperation() {
        System.out.println("Performing current account operation.");
    }

}
