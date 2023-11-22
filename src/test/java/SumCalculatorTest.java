import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sum.calculator.SumCalculator;

class SumCalculatorTest {

    private SumCalculator sumCalculator;
    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }
    @Test
    void testCase1() {
        Assertions.assertEquals(1, SumCalculator.sum(1));
    }

    @Test
    void testCase2() {
        Assertions.assertEquals(6, SumCalculator.sum(3));
    }

    @Test
    void testCaseExceprion(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SumCalculator.sum(0);
        }, "Input of 0 should throw IllegalArgumentException");
    }

}
