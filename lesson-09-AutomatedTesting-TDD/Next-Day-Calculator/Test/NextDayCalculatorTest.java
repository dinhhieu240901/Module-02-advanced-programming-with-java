import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void findNextDay1() {
        int[] input = new int[]{1, 1, 2023};
        int[] result = NextDayCalculator.nextDate(input[0], input[1], input[2]);
        assertArrayEquals(new int[]{2, 1, 2023}, result);
    }
    @org.junit.jupiter.api.Test
    void findNextDay2() {
        int[] input = new int[]{31, 1, 2018};
        int[] result = NextDayCalculator.nextDate(input[0], input[1], input[2]);
        assertArrayEquals(new int[]{1, 2, 2018}, result);
    }

    @org.junit.jupiter.api.Test
    void findNextDay4() {
        int[] input = new int[]{30, 4, 2023};
        int[] result = NextDayCalculator.nextDate(input[0], input[1], input[2]);
        assertArrayEquals(new int[]{1, 5, 2023}, result);
    }
    @org.junit.jupiter.api.Test
    void findNextDay5() {
        int[] input = new int[]{28, 2, 2023};
        int[] result = NextDayCalculator.nextDate(input[0], input[1], input[2]);
        assertArrayEquals(new int[]{1, 3, 2023}, result);
    }
    @org.junit.jupiter.api.Test
    void findNextDay6() {
        int[] input = new int[]{29, 2, 2020};
        int[] result = NextDayCalculator.nextDate(input[0], input[1], input[2]);
        assertArrayEquals(new int[]{1, 3, 2020}, result);
    }
    @org.junit.jupiter.api.Test
    void findNextDay7() {
        int[] input = new int[]{31, 12, 2023};
        int[] result = NextDayCalculator.nextDate(input[0], input[1], input[2]);
        assertArrayEquals(new int[]{1, 1, 2024}, result);
    }

}