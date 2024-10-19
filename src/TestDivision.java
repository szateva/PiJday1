import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDivision {

    @Test
    public void testDivision1() {
        assertEquals(1, Division.quotientDiv(5,3));
        assertEquals(2, Division.remainderDiv(5,3));
    }

    @Test
    public void testDivision2() {
        assertEquals(3, Division.quotientDiv(12,4));
        assertEquals(0, Division.remainderDiv(12,4));
    }

    @Test
    public void testDivision3() {
        assertEquals(0, Division.quotientDiv(2,4));
        assertEquals(2, Division.remainderDiv(2,4));
    }

    @Test
    public void testDivision4() {
        assertEquals(3, Division.quotientDiv(20,6));
        assertEquals(2, Division.remainderDiv(20,6));
    }

    @Test
    public void testDivision5() {
        assertEquals(3, Division.quotientDiv(15,5));
        assertEquals(0, Division.remainderDiv(15,5));
    }
}
