package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    @Test
    public void checkEvenNumber() {
        NumberChecker numberChecker = new NumberChecker();
        assertTrue(numberChecker.checkEvenOrUnevenNumber(0));
        assertTrue(numberChecker.checkEvenOrUnevenNumber(-2));
        assertTrue(numberChecker.checkEvenOrUnevenNumber(2));
    }

    @Test
    public void checkUnevenNumber() {
        NumberChecker numberChecker = new NumberChecker();
        assertFalse(numberChecker.checkEvenOrUnevenNumber(-3));
        assertFalse(numberChecker.checkEvenOrUnevenNumber(3));
    }

    @Test
    public void checkCompositeNumber() {
        NumberChecker numberChecker = new NumberChecker();
        assertTrue(numberChecker.checkPrimeOrCompoundNumber(12));
    }

    @Test
    public void checkPrimeNumber() {
        NumberChecker numberChecker = new NumberChecker();
        assertFalse(numberChecker.checkPrimeOrCompoundNumber(5));
    }

}