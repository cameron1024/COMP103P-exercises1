package com.company;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.next();
            System.out.println(checkPalindrome(Long.parseLong(s)));
        }
    }

    private static boolean checkPalindrome(long input) {
        String s = Long.toString(input);
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
