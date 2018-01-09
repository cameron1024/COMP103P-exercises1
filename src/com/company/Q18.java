package com.company;

import java.util.Scanner;

public class Q18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.next();
            try {
                int n = Integer.parseInt(s);
                System.out.println(verbalise(n));
            } catch (NumberFormatException ex) {
                System.out.println("enter a valid integer between 0 and 999");
            }
        }
    }

    public static String verbalise(int n) {
        if (n < 0 || n > 999) throw new NumberFormatException();
        if (n < 100) return sub100(n);
        if (n % 100 == 0) return hundreds(n);
        return singleDigit(n / 100) + " hundred and " + sub100(n % 100);


    }



    public static String sub100(int n) {
        if (n == 0) return singleDigit(0);
        if (n % 10 == 0) return tens(n);
        if (n < 10) return singleDigit(n);
        if (n < 20) return teens(n);
        return tens(n - (n % 10)) + " " + singleDigit(n % 10);
    }

    public static String hundreds(int n) {
        if (n == 0) return "zero";
        if (n % 100 == 0) return singleDigit(n / 100) + " hundred";
        return "";
    }

    public static String tens(int n) {
        if (n == 10) return "ten";
        if (n == 20) return "twenty";
        if (n == 30) return "thirty";
        if (n == 40) return "forty";
        if (n == 50) return "fifty";
        if (n == 60) return "sixty";
        if (n == 70) return "seventy";
        if (n == 80) return "eighty";
        if (n == 90) return "ninety";
        return "";
    }

    public static String teens(int n) {
        if (n == 11) return "eleven";
        if (n == 12) return "twelve";
        if (n == 13) return "thirteen";
        if (n == 14) return "fourteen";
        if (n == 15) return "fifteen";
        if (n == 16) return "sixteen";
        if (n == 17) return "seventeen";
        if (n == 18) return "eighteen";
        if (n == 19) return "nineteen";
        return "";
    }

    public static String singleDigit(int n) {
        if (n == 0) return "zero";
        if (n == 1) return "one";
        if (n == 2) return "two";
        if (n == 3) return "three";
        if (n == 4) return "four";
        if (n == 5) return "five";
        if (n == 6) return "six";
        if (n == 7) return "seven";
        if (n == 8) return "eight";
        if (n == 9) return "nine";
        return "";
    }
}
