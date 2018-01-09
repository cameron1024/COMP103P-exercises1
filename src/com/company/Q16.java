package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = scanner.next();
        System.out.print("Enter second string: ");
        String s2 = scanner.next();

        System.out.println(permutations(s1.toCharArray(), s2.toCharArray()) ? "permutations" : "not permutations");
    }

    private static boolean permutations(char[] chars1, char[] chars2) {
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}
