package com.company;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your message:");

        String message = scanner.next();
        int length = message.length();

        if (length > 80) {
            System.out.println("message must be 80 characters or fewer");
            System.exit(0);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 40 - length / 2; i++) {
            stringBuilder.append(" ");
        }

        stringBuilder.append(message);
        System.out.println(stringBuilder.toString());
    }
}
