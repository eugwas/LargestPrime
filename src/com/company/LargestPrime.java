package com.company;

public class LargestPrime {
    private int number;

    public LargestPrime(int number) {
        this.number = number;
    }

    public int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int prime = 2;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.println("Prime factor = " + i);
                number /= i;
                prime = i;
                i--;
            }
        }
        return prime;
    }
}
