import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    @Test
    public void testBankOperations() {
        Bank bank = new Bank();

        //Given
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(500);

        //When
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        //Then
        assertEquals(2, bank.getAccounts().size());

        // Test SavingsAccount operations
        savingsAccount.deposit(500);
        assertEquals(1500, savingsAccount.getBalance());

        savingsAccount.withdraw(200);
        assertEquals(1300, savingsAccount.getBalance());

        assertEquals(65, savingsAccount.calculateInterest());

        // Test CurrentAccount operations
        currentAccount.deposit(300);
        assertEquals(800, currentAccount.getBalance());

        currentAccount.withdraw(700);
        assertEquals(100, currentAccount.getBalance());

    }
}
