package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    private void checkWholeorNotwholeNumber(int number) {

        if (number % 1 == 0) {
            System.out.println(number + " whole number");
        }
    }

    private void checkEvenOrUnevenNumber(int number) {

        int i = 2;
        if (number % 2 == 0) {
            System.out.println(number + " even number");
        }
        if (number % 2 != 0) {
            System.out.println(number + " uneven number");
        }
    }

    private void checkSimpleOrCompoundNumber(int number) {

        int i;
        boolean isCompound = false;

        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                isCompound = true;
                break;
            }
        }
        if (isCompound) {
            System.out.println(number + " composite number ");
        } else {
            System.out.println(number + " simple number ");
        }
    }

    private void checkAllMethods(int number) {

        checkWholeorNotwholeNumber(number);
        checkEvenOrUnevenNumber(number);
        checkSimpleOrCompoundNumber(number);
    }

    private int inputNumber(){

        System.out.println("Input the number");

        int number;

            try {
                number = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error, input whole number");
                number = inputNumber();
            }
        return number;
    }

    public static void main(String[] args) {

        Main main = new Main();
        int number = main.inputNumber();
        main.checkAllMethods(number);
    }
}
