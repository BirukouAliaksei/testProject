package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberCheckerTest {

    @Test
    void checkEvenNumber() {
        NumberChecker numberChecker = new NumberChecker();
        assertTrue(numberChecker.checkEvenOrUnevenNumber(0));
        assertTrue(numberChecker.checkEvenOrUnevenNumber(-2));
        assertTrue(numberChecker.checkEvenOrUnevenNumber(2));
    }

    @Test
    void checkUnevenNumber() {
        NumberChecker numberChecker = new NumberChecker();
        assertFalse(numberChecker.checkEvenOrUnevenNumber(-3));
        assertFalse(numberChecker.checkEvenOrUnevenNumber(3));
    }

    @Test
    void checkCompositeNumber() {
        NumberChecker numberChecker = new NumberChecker();
        assertTrue(numberChecker.checkPrimeOrCompoundNumber(12));
    }

    @Test
    void checkPrimeNumber() {
        NumberChecker numberChecker = new NumberChecker();
        assertFalse(numberChecker.checkPrimeOrCompoundNumber(5));
    }

}