import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMultiplication {
    @Test
    public void testMultiplication1(){
        assertEquals(Multiplication.multiply(5, 3), 15 );
    }

    @Test
    // first negative
    public void testMultiplication2(){
        assertEquals(Multiplication.multiply(-5, 3), -15 );
    }

    @Test
    // second negative
    public void testMultiplication3(){
        assertEquals(Multiplication.multiply(5, -3), -15 );
    }

    @Test
    // both negative
    public void testMultiplication4(){
        assertEquals(Multiplication.multiply(-5, -3), 15 );
    }

}
