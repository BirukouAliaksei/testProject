package task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordsCountTest {
    WordsCount wordsCount = new WordsCount();

    @Test
    void checkWordsCounter() {
        String text = "Selenium is a suite of tools web for automating web browsers";
        String word = "web";
        assertEquals(2, wordsCount.countWordInText(text, word));
    }

}