package nz.ac.auckland.softeng283.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class UserTest {
    @Test 
    public void withdraw() {
        //arrange
        //defalt value is 0, so we need to set it to a value greater than 100
        BankAccount account = Mockito.mock(BankAccount.class);
        // when(要执行的方法).thenReturn(返回值)
        Mockito.when(account.getBalance()).thenReturn(200);
        User user = new User(account);
        //act
        boolean result = user.withdraw(100);
        //assert
        assertTrue(result);
        // verifies that the setBalance method was called with the expected value
        Mockito.verify(account, Mockito.times(1)).setBalance(100);
    }
}
