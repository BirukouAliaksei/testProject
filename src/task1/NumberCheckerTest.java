package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberCheckerTest {
    NumberChecker numberChecker = new NumberChecker();

    @Test
    void checkEvenNumber() {
        assertTrue(numberChecker.checkEvenOrUnevenNumber(0));
        assertTrue(numberChecker.checkEvenOrUnevenNumber(-2));
        assertTrue(numberChecker.checkEvenOrUnevenNumber(2));
    }

    @Test
    void checkUnevenNumber() {
        assertFalse(numberChecker.checkEvenOrUnevenNumber(-3));
        assertFalse(numberChecker.checkEvenOrUnevenNumber(3));
    }

    @Test
    void checkCompositeNumber() {
        assertTrue(numberChecker.checkPrimeOrCompoundNumber(12));
    }

    @Test
    void checkPrimeNumber() {
        assertFalse(numberChecker.checkPrimeOrCompoundNumber(5));
    }

}