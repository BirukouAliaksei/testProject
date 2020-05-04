package task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsCountTest {

    @Test
    public void checkWordsCounter(){
        WordsCount wordsCount = new WordsCount();
        String text = "Selenium is a suite of tools web for automating web browsers";
        String word = "web";
        assertEquals(2, wordsCount.countWordInText(text,word));
    }

}