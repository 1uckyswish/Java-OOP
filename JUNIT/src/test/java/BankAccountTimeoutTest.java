import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParamRes.class)
public class BankAccountTimeoutTest {

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    public void testDepositTimeoutAsser(BankAccount bankAccount) {
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        bankAccount.depost(300);
        assertEquals(300, bankAccount.getBalance());
    }

    @Test
//    @Timeout()
    public void testDepositTimeoutAnno(BankAccount bankAccount) {
    
    }
}
