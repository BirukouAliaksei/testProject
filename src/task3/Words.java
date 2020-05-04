package task3;

import java.util.*;

public class Words {
    Scanner scanner = new Scanner(System.in);

    private static final Comparator<String> LINE_LENGHT = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

    ArrayList<String> countWords(ArrayList<String> textList) {
        System.out.println("number of words in sentences: " + textList.size());
        return textList;
    }

    private void sortCollection(ArrayList<String> textList) {
        textList.sort(LINE_LENGHT);
//        Collections.sort(textList); //you can use standards Collection method. Alphabet sort.
        System.out.println("Sorted Collection " + textList + " ");
    }

    private void printCollectionInUpperCase(ArrayList<String> textList) {
        for (String e : textList) {
            System.out.print(e.substring(0,1).toUpperCase() + e.substring(1) + " ");
        }
    }

    private String input() {
        System.out.println("Input text with ' ' ");
        String text;
        try {
            text = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error, input text");
            text = input();
        }
        return text;
    }

    public static void main(String[] args) {
        Words words = new Words();
        String text = words.input();
        ArrayList<String> textList = new ArrayList<>(Arrays.asList(text.split(" ")));
        words.countWords(textList);
        words.sortCollection(textList);
        words.printCollectionInUpperCase(textList);
    }
}
