package seminars.third.coverage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    SomeService service = new SomeService();

    // 3.1.
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    void multipleThreeNotFiveReturnsFizz(int number) {
        assertEquals(service.fizzBuzz(number), "Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {20, 50, 65, 100})
    void multipleThreeNotFiveReturnsBuzz(int number) {
        assertEquals(service.fizzBuzz(number), "Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60})
    void multipleThreeAndFiveReturnsFizzBuzz(int number) {
        assertEquals(service.fizzBuzz(number), "FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 7, 14, 31})
    void testFizzBuzzThrowsException(int number) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            service.fizzBuzz(number);
        });
        String exceptionMessage = "Number %d is not divisible by 3 and 5!";
        assertEquals(String.format(exceptionMessage, number), exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 6, 8, 20})
    void testEvenOddNumberIsEven(int number) {
        assertTrue(service.evenOddNumber(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 7, 9, 31})
    void testEvenOddNumberIsOdd(int number) {
        assertFalse(service.evenOddNumber(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 26, 99, 100})
    void testNumberIsInInterval(int number) {
        assertTrue(service.numberInInterval(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 24, 101, 110})
    void testNumberIsNotInInterval(int number) {
        assertFalse(service.numberInInterval(number));
    }
}
