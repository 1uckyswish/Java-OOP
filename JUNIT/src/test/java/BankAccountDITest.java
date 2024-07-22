import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParamRes.class)
public class BankAccountDITest {
    @Test
    @DisplayName("Deposit 400 successfully")
    public void testDepost(BankAccount bankAccount){

        bankAccount.depost(500);

        assertEquals(900, bankAccount.getBalance());
    }
}
