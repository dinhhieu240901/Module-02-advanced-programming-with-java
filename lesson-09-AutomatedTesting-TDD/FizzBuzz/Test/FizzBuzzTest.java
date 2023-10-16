import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.assertEquals;

class FizzBuzzTest {

    @Test
    void findFizzBuzz() {
        int a = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(a);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void findFizzBuzz1() {
        int a = 3;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(a);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void findFizzBuzz2() {
        int a = -5;
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(a);
        Assertions.assertEquals(expected, result);
    }

}