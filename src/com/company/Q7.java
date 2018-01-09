package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            System.out.println(toBase(Integer.parseInt(s.split(",")[0]), Integer.parseInt(s.split(",")[1])));
        }
    }


    public static String toBase(int n, int base) {
        BigInteger bigInteger = BigInteger.valueOf(n);
        return bigInteger.toString(base);
    }
}
