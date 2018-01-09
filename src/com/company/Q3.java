package com.company;

import java.util.*;

public class Q3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(scanner.next());
        }

        strings.sort(Comparator.reverseOrder());

        System.out.println(strings.toString());
    }
}
