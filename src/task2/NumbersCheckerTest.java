package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersCheckerTest {

    @Test
    void checkLastCommonMultiple() {
        NumbersChecker numbersChecker = new NumbersChecker();
        assertEquals(25, numbersChecker.countLeastCommonMultiple(5, 25));
    }

    @Test
    void ckeckGratestCommonDivisior() {
        NumbersChecker numbersChecker = new NumbersChecker();
        assertEquals(5, numbersChecker.countGreatestCommonDivisor(5, 25));
    }

}