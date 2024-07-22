import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParamRes.class)
public class BankAccountRepeatedTestTest {
    @RepeatedTest(5)
    @DisplayName("Deposit 400 successfully")
    public void testDepost(BankAccount bankAccount){
        bankAccount.depost(500);
        assertEquals(500, bankAccount.getBalance());
    }

    @RepeatedTest(5)
    @DisplayName("Deposit 400 successfully")
    public void testDepostInfo(BankAccount bankAccount, RepetitionInfo rep){
        bankAccount.depost(500);
        assertEquals(500, bankAccount.getBalance());
        System.out.println("NR" + rep.getCurrentRepetition());
    }
}
