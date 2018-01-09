package com.company;

import java.util.Scanner;

public class Q6 {

    double d1;
    double d2;

    public static void main(String[] args) {
        Q6 q6 = new Q6();
        q6.setDoubles(q6.read(), q6.read());
        System.out.println(q6.sumSqrt());
    }

    public void setDoubles(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public double sumSqrt() {
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
