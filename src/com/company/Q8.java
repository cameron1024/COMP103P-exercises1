package com.company;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        System.out.println("1. Convert millimeters to feet.");
        System.out.println("2. Convert metres to inches.");
        System.out.println("3. Convert kilometers to yards.");
        System.out.println("4. Quit.");

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {


            String s = scanner.next();

            try {
                int i = Integer.parseInt(s);
                if (i < 1 || i > 4) throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid integer");
            }

            int i = Integer.parseInt(s);
            if (i == 4) System.exit(0);

            if (i == 1) {
                System.out.print("Number of millimeters: ");
                double input = Double.parseDouble(scanner.next());
                System.out.println((0.00328084D * input) + " feet.");
            }

            if (i == 2) {
                System.out.print("Number of meters: ");
                double input = Double.parseDouble(scanner.next());
                System.out.println((39.3701D * input) + " inches.");
            }

            if (i == 3) {
                System.out.print("Number of kilometers: ");
                double input = Double.parseDouble(scanner.next());
                System.out.println((1093.61D * input) + " yards.");
            }

            System.out.println("1. Convert millimeters to feet.");
            System.out.println("2. Convert metres to inches.");
            System.out.println("3. Convert kilometers to yards.");
            System.out.println("4. Quit.");
        }
    }
}
