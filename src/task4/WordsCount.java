package task4;

import java.util.ArrayList;

public class WordsCount {

    private void countWordInText(String text, String word) {
        int counter = 0;
        String[] textList = text.split(" ");

        for (String e : textList){
            if (e.equalsIgnoreCase(word)){
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        WordsCount main = new WordsCount();
        String text = "Selenium is a suite of tools web for automating web browsers";
        String word = "web";
        main.countWordInText(text, word);
    }
}
// сдкелать из командной строки