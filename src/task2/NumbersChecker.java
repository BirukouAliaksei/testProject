package task2;

import java.util.Scanner;

public class NumbersChecker {

    private static Scanner scanner = new Scanner(System.in);

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

    int countLeastCommonMultiple(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return (firstNumber * secondNumber) / countGreatestCommonDivisor(firstNumber, secondNumber);
    }

    int countGreatestCommonDivisor(int firstNumber, int secondNumber) {
        if (firstNumber == 0)
            return Math.abs(secondNumber);
        if (secondNumber == 0)
            return Math.abs(firstNumber);
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber)
                firstNumber = firstNumber - secondNumber;
            else
                secondNumber = secondNumber - firstNumber;
        }
        return secondNumber;
    }

    public static void main(String[] args) {
        NumbersChecker numbersChecker = new NumbersChecker();
        int firstNumber = numbersChecker.inputNumber();
        int secondNumber = numbersChecker.inputNumber();
        System.out.println(numbersChecker.countGreatestCommonDivisor(firstNumber, secondNumber) + " Greatest Common Divisor");
        System.out.println(numbersChecker.countLeastCommonMultiple(firstNumber, secondNumber) + " Last Common Multiple");
    }
}
