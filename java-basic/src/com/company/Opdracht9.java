package com.company;

import java.util.Scanner;

public class Opdracht9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        while (n < 1) {
            System.out.print("Invalid input. Please enter again: ");
            n = scanner.nextInt();
        }
        while (n > 10) {
            System.out.print("Invalid input. Please enter again: ");
            n = scanner.nextInt();
        }
    }
}
