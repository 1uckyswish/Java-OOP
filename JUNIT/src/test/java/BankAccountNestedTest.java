import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountNestedTest {
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

    class WhenBalanceEqualsZero{
        public void testWithdrawMinBalance(){
            BankAccount bankAccount = new BankAccount(0, 0);
            bankAccount.withdraw(500);
        }

        public void testWithdrawMinBalanceNegative1000(){
            BankAccount bankAccount = new BankAccount(0, -1000);
            bankAccount.withdraw(500);
        }
    }
}
