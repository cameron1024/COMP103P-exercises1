package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = bufferedReader.readLine();
            System.out.println(checkPalindrome(tidyString(s)));
        }
    }

    private static String tidyString(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "");
    }

    private static boolean checkPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
