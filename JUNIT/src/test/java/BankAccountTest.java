import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayName("Test BankAccount Class")
public class BankAccountTest {

    @Test
    @DisplayName("Withdraw 500 successfully")
    public void testWithdraw(){
        BankAccount bankAccount = new BankAccount(500, -1000);

        bankAccount.withdraw(300);

        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 400 successfully")
    public void testDepost(){
        BankAccount bankAccount = new BankAccount(400, 0);

        bankAccount.depost(500);

        assertEquals(900, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Withdraw will become negative")
    public void testWithdrawNotStuckAtZero(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(800);
        assertNotEquals(0, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Test activation account after creation")
    public void testActive(){
        BankAccount bankAccount = new BankAccount(500, 0);
        assumeTrue(bankAccount == null, "account is not null");
        assertTrue(bankAccount.isActive());
    }

    @Test
    @DisplayName("Test set holder name")
    public void testHolderNameSet(){
        BankAccount bankAccount = new BankAccount(1000, 5);
        bankAccount.setHolderName("Travis");
        assertNotNull(bankAccount.getHolderName());
    }

    @Test
    @DisplayName("Test taht we cant withdraw below min")
    public void NoWithdrawBelowMin(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        assertThrows(RuntimeException.class, () -> bankAccount.withdraw(2000));
    }

    @Test
    @DisplayName("Withdraw no exceptions for withdraw and deposit")
    public void testWithdrawAndDepositWithoutException(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        assertAll(() -> bankAccount.depost(200), () -> bankAccount.withdraw(45500));
    }

    @Test
    @DisplayName("Test speed")
    public void testDepositTimeout(){
        BankAccount bankAccount = new BankAccount(500, 0);
       assertTimeout(Duration.ofNanos(10), () -> bankAccount.depost(4000));
    }
}
