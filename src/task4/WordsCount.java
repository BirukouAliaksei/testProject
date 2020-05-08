package task4;

import java.util.Scanner;

public class WordsCount {
    Scanner scanner = new Scanner(System.in);

    int countWordInText(String text, String word) {
        int counter = 0;
        String[] textList = text.split(" ");

        for (String e : textList) {
            if (e.equalsIgnoreCase(word)) {
                counter++;
            }
        }
        System.out.println("Input text contain: " + counter + " Numbers of word: " + word);
        return counter;
    }

    private String input() {
        String text;
        try {
            text = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error, input again");
            text = input();
        }
        return text;
    }

    public static void main(String[] args) {
        WordsCount main = new WordsCount();
        System.out.println("Input text with ' ' ");
        String text = main.input();
        System.out.println("Input searching word");
        String word = main.input();
        main.countWordInText("Count words " + word + " in text :" + text, word);
    }
}