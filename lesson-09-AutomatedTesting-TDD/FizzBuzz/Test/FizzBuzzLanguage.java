import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzLanguage {

    @org.junit.jupiter.api.Test
    void convertToEnglish0() {
        int number = 53;
        String expected = "BuzzFizz";
        assertEquals(FizzBuzz.convertToEnglish(number),expected);
    }
    @org.junit.jupiter.api.Test
    void convertToEnglish1() {
        int number = 10;
        String expected = "OneZero";
        assertEquals(FizzBuzz.convertToEnglish(number),expected);
    }

}