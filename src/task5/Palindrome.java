package task5;

import java.util.Scanner;

public class Palindrome {

    private void checkPolindomeNumbers(int n){

        for (int i = 0; i <= n;i++) {
            int lastDigit,sum=0,a;
            int inputNumber = i;
            a = inputNumber;
            while (a > 0) {
                lastDigit = a % 10;
                sum = (sum * 10) + lastDigit;
                a = a / 10;
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

