import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationTest {

    @org.junit.jupiter.api.Test
    void factPositive() {
        assertEquals(6, MathOperation.fact(3));
    }

    @org.junit.jupiter.api.Test
    void factZero() {
        assertEquals(1, MathOperation.fact(0));
    }

    @org.junit.jupiter.api.Test
    void factNegative() {
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () ->
        {
            MathOperation.fact(-10);
        });
        Assertions.assertEquals("ЧИСЛО НЕ МОЖЕТ БЫТЬ ОТРИЦАТЕЛЬНЫМ", thrown.getMessage());

    }

    @org.junit.jupiter.api.Test
    void signPositive() {
        assertEquals(1,MathOperation.sign(12.4));
    }
    @Test
    void signZero() {
        assertEquals(0,MathOperation.sign(0));
    }
    @Test
    void signNegative() {
        assertEquals(-1,MathOperation.sign(-10.99));
    }
}
