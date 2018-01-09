package com.company;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Q5 q5 = new Q5();
        System.out.println(q5.sumSqrt(q5.read(), q5.read()));

    }


    public double sumSqrt(double d1, double d2) {
        return Math.sqrt(d1 + d2);
    }


    public double read() {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        try {
            Double.parseDouble(s);
        } catch (NumberFormatException ex) {
            return 0;
        }

        return Double.parseDouble(s);
    }
}
