package task5;

import java.util.Scanner;

public class Palindrome {
    Scanner scanner = new Scanner(System.in);

    private void checkPalindomeNumbers(int n) {
        for (int i = 0; i <= n; i++) {
            int lastDigit, sum=0, balance;
            int inputNumber = i;
            balance = inputNumber;
            while (balance > 0) {
                lastDigit = balance % 10;
                sum = (sum * 10) + lastDigit;
                balance = balance / 10;
            }
            if (sum == inputNumber)
                System.out.println("Number "+ i +" is palindrome ");
        }
    }
    private int inputNumber() {
        System.out.println("Input the number from 0 to 100");
        int number;
        try {
            number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error, input integer");
            number = inputNumber();
        }
        if (number > 100) {
            return inputNumber();
        }
        return number;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int n = palindrome.inputNumber();
        palindrome.checkPalindomeNumbers(n);
    }
}