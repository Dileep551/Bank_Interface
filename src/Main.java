public class Main {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank();

        // Create accounts and add them to the bank
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(500);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Perform operations on accounts
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);

        currentAccount.deposit(300);
        currentAccount.withdraw(700);

        // Display information
        System.out.println("Bank Accounts:");
        for (Account account : bank.getAccounts()) {
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).performSavingsOperation();
            } else if (account instanceof CurrentAccount) {
                ((CurrentAccount) account).performCurrentOperation();
            }
            System.out.println("--------------");
        }
    }
}
