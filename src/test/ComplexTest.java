package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import demo.parallel.Complex;
import org.junit.jupiter.api.BeforeEach;

public class ComplexTest {
    private Complex complex1;
    private Complex complex2;

    @Test
    public void testMinus() {
        complex1 = new Complex(4, 3);
        complex2 = new Complex(2, 1);
        Complex result = complex1.minus(complex2);
        assertEquals(2.0, result.getReal(), 0.001);
        assertEquals(2.0, result.getImag(), 0.001);
    }

    @Test
    public void testDivision() {
        complex1 = new Complex(4, 3);
        complex2 = new Complex(2, 1);
        Complex result = complex1.division(complex2);
        assertEquals(2.4, result.getReal(), 0.001);
        assertEquals(0.4, result.getImag(), 0.001);
    }
}
