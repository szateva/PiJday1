import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void testPrime() {
        assertTrue(Prime2.isPrime(7), "7 should be a prime number");
    }

    @Test
    public void testNotPrime() {
        assertFalse(Prime2.isPrime(8), "8 should not be a prime number");
    }

    @Test
    public void testOne() {
        assertFalse(Prime2.isPrime(1), "1 should not be a prime number");
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(Prime2.isPrime(-5), "-5 should not be a prime number");
    }
}
