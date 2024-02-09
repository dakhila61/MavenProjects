package customexceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    void testSuccessfulWithdrawal() throws InsufficientFundsException, InvalidWithdrawalException {
        BankAccount account = new BankAccount(1000);
        account.withdraw(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    void testWithdrawMoreThanBalance() {
        BankAccount account = new BankAccount(1000);
        assertThrows(InsufficientFundsException.class, () -> account.withdraw(1500));
    }

    @Test
    void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount(1000);
        assertThrows(InvalidWithdrawalException.class, () -> account.withdraw(-200));
    }
}

