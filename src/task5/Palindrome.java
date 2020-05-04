package task5;

import java.util.Scanner;

public class Palindrome {

    private void checkPolindomeNumbers(int n) {
        for (int i = 0; i <= n;i++) {
            int lastDigit,sum=0,balance;
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

    public static void main(String[] args){
        Palindrome palindrome = new Palindrome();
        palindrome.checkPolindomeNumbers(55);
    }
}