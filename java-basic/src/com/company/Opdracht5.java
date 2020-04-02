package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Opdracht5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        double x = scanner.nextDouble();

        System.out.print("y: ");
        double y = scanner.nextDouble();

        if (x / y == 5) {
            x = 100;
        }
        if (x * y == 5) {
            x = 1;
        }
        if (x < y) {
            x = x * 2;
        }
        if (x > y) {
            x++;
        }

        System.out.println("The new value for x is: " + x);
    }
}
