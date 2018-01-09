package com.company;

import java.util.Random;
import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound:");
        String lowerString = scanner.next();
        System.out.print("Enter the upper bound:");
        String upperString = scanner.next();

        Range range = new Range(Long.parseLong(lowerString), Long.parseLong(upperString));
        System.out.println("answer is: " + range.compute());
    }

    static class Range {
        long lowerBound;
        long upperBound;


        Range(long lowerBound, long upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public long compute() {
            if (lowerBound == upperBound) return upperBound;
            return lowerBound * new Range(lowerBound + 1, upperBound).compute();
        }
    }
}
