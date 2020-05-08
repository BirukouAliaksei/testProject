package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersCheckerTest {
    NumbersChecker numbersChecker = new NumbersChecker();
    @Test
    void checkLastCommonMultiple() {
        assertEquals(25, numbersChecker.countLeastCommonMultiple(5, 25));
    }

    @Test
    void ckeckGratestCommonDivisior() {
        assertEquals(5, numbersChecker.countGreatestCommonDivisor(5, 25));
    }

}