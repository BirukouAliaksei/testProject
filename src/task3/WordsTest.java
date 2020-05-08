package task3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordsTest {

    @Test
    public void checkNumberOfWordsInText() {
        Words words = new Words();
        String text = "Selenium is a suite of tools for automating web browsers";
        ArrayList<String> textList = new ArrayList<>(Arrays.asList(text.split(" ")));
        assertEquals(10, words.countWords(textList).size());
    }
}