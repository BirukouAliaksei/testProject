package task4;

import java.util.ArrayList;

public class WordsCount {

    public void counterWordInText(String text, String word){
        int counter = 0;
        ArrayList<String> textList = new ArrayList<>();
        for (String e : text.split(" ")){
            textList.add(e);
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
        main.counterWordInText(text, word);
    }
}
