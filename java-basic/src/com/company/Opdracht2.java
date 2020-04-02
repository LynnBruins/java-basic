package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperature in degrees Celsius: ");
            double C = scanner.nextDouble();

            double F = (1.8 * C) + 32;

        System.out.println("Temperature in degrees Fahrenheit: " + F);
    }
}
