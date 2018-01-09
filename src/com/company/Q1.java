package com.company;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.next();
            if (s.equals("stop")) System.exit(0);
        }
    }
}
