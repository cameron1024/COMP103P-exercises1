package com.company;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q17 {

    Set<Long> primes = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Test individual prime");
            System.out.println("2. Generate primes up to n");
            System.out.println("3. Exit");

            String input = scanner.next();

            if (input.equals("1")) {
                System.out.print("Enter number to test: ");
                String s = scanner.next();
                try {
                    long l = Long.parseLong(s);
                    System.out.println(checkPrime(l) ? "prime" : "not prime");
                } catch (NumberFormatException ex) {
                    System.out.println("Enter a valid long");
                }


            }

            if (input.equals("2")) {
                System.out.print("Enter upper bound: ");
                String s = scanner.next();
                try {
                    long l = Long.parseLong(s);
                    Q17 q17 = new Q17();
                    q17.sieve(l);
                    q17.displayList();
                } catch (NumberFormatException ex) {
                    System.out.println("Enter a valid long");
                }
            }

            if (input.equals("3")) System.exit(0);
        }


    }

    public void sieve(long n) {
        primes.clear();

        for (long i = 2; i < n + 1; i++) {
            primes.add(i);
        }

        double limit = Math.sqrt((double) n);
        for (long i = 2; i < limit; i++) {
            long temp = 2 * i;

            while (temp < n) {
                primes.remove(temp);
                temp += i;
            }
        }
    }

    public void displayList() {
        primes.forEach(System.out::println);
    }

    private static boolean checkPrime(long l) {
        return BigInteger.valueOf(l).isProbablePrime(50);
    }
}
