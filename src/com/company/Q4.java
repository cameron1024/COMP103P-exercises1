package com.company;

import java.util.Random;

public class Q4 {

    public static void main(String[] args) {

        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        double min = 0;
        double max = 0;
        double sum = 0;


        for (int i = 0; i < 10000; i++) {
            double d = random.nextDouble();
            d = random.nextBoolean() ? d : d * -1;

            if (d < min) min = d;
            if (d > max) max = d;
            sum += d;

        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        double average = sum / 10000;
        System.out.println("average = " + average);

    }
}
