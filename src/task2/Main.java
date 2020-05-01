package task2;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    private int inputNumber(){

        System.out.println("Input the number");
        int number = 0;

        try {
            number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error, input whole number");
            number = inputNumber();
        }
        return number;
    }

    private static int countLeastCommonMultiple(int firstNumber, int secondNumber){
        if (secondNumber == 0){
            return firstNumber;
        }
        return (firstNumber*secondNumber)/countGreatestCommonDivisior(firstNumber, secondNumber);
    }

    private static int countGreatestCommonDivisior(int firstNumber, int secondNumber) {

        if (firstNumber == 0)
            return Math.abs(secondNumber);
        if (secondNumber == 0)
            return Math.abs(firstNumber);
        for ( ; ; )
            if ((firstNumber %= secondNumber) == 0)
                return Math.abs(secondNumber);
            else if ((secondNumber %= firstNumber) == 0)
                return Math.abs(firstNumber);
    }

    public static void main(String[] args) {
        Main main = new Main();
        int firstNumber = main.inputNumber();
        int secondNumber = main.inputNumber();
        System.out.println(countGreatestCommonDivisior(firstNumber,secondNumber) + " Greatest Common Divisior");
        System.out.println(countLeastCommonMultiple(firstNumber,secondNumber) + " Last Common Multiple");
    }
}
