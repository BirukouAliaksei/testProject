package task1;

import java.util.Scanner;

public class NumberChecker {
    private static Scanner scanner = new Scanner(System.in);

    private void printNumber(int number) {
            System.out.println(number + " integer");
    }

    boolean checkEvenOrUnevenNumber(int number) {
        boolean results = false;
        if (number % 2 == 0) {
            System.out.println(number + " even number");
            results = true;
        }
        else {
            System.out.println(number + " uneven number");
        }
        return  results;
    }

    boolean checkPrimeOrCompoundNumber(int number) {
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
            System.out.println(number + " prime number ");
        }
        return isCompound;
    }

    private void checkAllMethods(int number) {
        printNumber(number);
        checkEvenOrUnevenNumber(number);
        checkPrimeOrCompoundNumber(number);
    }
// вводим число несколько раз число, пока не будет введено правильно
    private int inputNumber() {
        System.out.println("Input the number");
        int number;
            try {
                number = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error, input integer");
                number = inputNumber();
            }
        return number;
    }

    public static void main(String[] args) {
        NumberChecker numberChecker = new NumberChecker();
        int number = numberChecker.inputNumber();
        numberChecker.checkAllMethods(number);
    }
}

