package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int number = scanner.nextInt();
            System.out.println("Largest prime factor = " + LargestPrime.getLargestPrime(number));
        } else {
            System.out.println("Invalid number");
        }
        scanner.nextLine();
        scanner.close();

    }
}
