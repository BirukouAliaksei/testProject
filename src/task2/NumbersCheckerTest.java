package task2;

import org.junit.jupiter.api.Test;
import task1.NumberChecker;

import static org.junit.jupiter.api.Assertions.*;

class NumbersCheckerTest {

    @Test
    public void checkLastCommonMultiple() {
        NumbersChecker numbersChecker = new NumbersChecker();
        assertEquals(25, numbersChecker.countLeastCommonMultiple(5,25));
    }

    @Test
    public void ckeckGratestCommonDivisior() {
        NumbersChecker numbersChecker = new NumbersChecker();
        assertEquals(5, numbersChecker.countGreatestCommonDivisor(5,25));
    }

}