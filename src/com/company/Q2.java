package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> doubles = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String s = scanner.next();
            doubles.add(Double.parseDouble(s));
        }

        double average = doubles.stream().reduce(0d, (a, b) -> a + b) / doubles.size();

        System.out.println("average = " + average);
    }
}
