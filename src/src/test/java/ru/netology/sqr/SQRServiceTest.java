package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'TwoAndThreeHandrend',200,300,3",
            "'TwoAndFourHandrend',200,400,6",
            "'TwoAndFiveHandrend',200,500,8",
            "'TwoAndSixHandrend',200,600,10"})
    void shouldCalculate(String testName, int belowLimit, int topLimit, int expected) {
        SQRService sqrService = new SQRService();
        int actual = sqrService.sqrtCount(belowLimit, topLimit);
        assertEquals(expected, actual);
    }


    @Test
    void shouldsqrtCountTwoAndThreeHandrend() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int actual = sqrService.sqrtCount(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldsqrtCountTwoAndFourHandrend() {
        SQRService sqrService = new SQRService();
        int expected = 6;
        int actual = sqrService.sqrtCount(200, 400);

        assertEquals(expected, actual);
    }

    @Test
    void shouldsqrtCountTwoAndFiveHandrend() {
        SQRService sqrService = new SQRService();
        int expected = 8;
        int actual = sqrService.sqrtCount(200, 500);

        assertEquals(expected, actual);
    }
}