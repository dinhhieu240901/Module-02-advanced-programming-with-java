
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    void testFindAbsoluteNegative1(){
        int number = -1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    void testFindAbsoluteSmallestNegative() {
        int number = Integer.MIN_VALUE;
        int expected = -Integer.MIN_VALUE;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    void testFindAbsoluteLargestPositive() {
        int number = Integer.MAX_VALUE;
        int expected = Integer.MAX_VALUE;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    void testFindAbsolute(){
        int number = Integer.MIN_VALUE+1;
        long expected = Integer.MAX_VALUE;;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

}