package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Words {

    private static final Comparator<String> LINE_LENGHT = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

    private void wordCounter(ArrayList<String> textList){
        System.out.println("number of words in sentences: " + textList.size());

    }

    private void sortCollection(ArrayList<String> textList){
        textList.sort(LINE_LENGHT);
        System.out.println("Sorted Collection" + textList + " ");
    }

    private void changeCollectionToUpperCase(ArrayList<String> textList){
        for (String e : textList){
            System.out.print(e.substring(0,1).toUpperCase() + e.substring(1) + " ");
        }
    }

    public static void main(String[] args) {
        Words words = new Words();
        String text = "Selenium is a suite of tools for automating web browsers";
        ArrayList<String> textList = new ArrayList<>(Arrays.asList(text.split(" ")));
        words.wordCounter(textList);
        words.sortCollection(textList);
        words.changeCollectionToUpperCase(textList);
    }
}
