package nz.ac.auckland.softeng283;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    PasswordChecker checker = new PasswordChecker();
    @BeforeEach 
    public void setUp() {
        checker = new PasswordChecker();
    }
    @Test 
    public void isValid_shortLengthPassword_returnsFalse() {
        boolean result = checker.isValid("123");
        assertFalse(result);
    }

    @Test 
    public void noneValue() {
        assertThrows(IllegalArgumentException.class, () -> checker.isValid(null));
    }
}
