import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDivision {

    @Test
    public void testDivision1() {
        assertEquals(Division.quotientDiv(5,3), 1);
        assertEquals(Division.remainderDiv(5,3), 2);
    }

    @Test
    public void testDivision2() {
        assertEquals(Division.quotientDiv(12,4), 3);
        assertEquals(Division.remainderDiv(12,4), 0);
    }

    @Test
    public void testDivision3() {
        assertEquals(Division.quotientDiv(2,4), 0);
        assertEquals(Division.remainderDiv(2,4), 4);
    }
}
