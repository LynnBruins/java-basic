package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Opdracht3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length horizontal side: ");
            double horizontal = scanner.nextDouble();

        System.out.print("Length vertical side: ");
            double vertical = scanner.nextDouble();

        double hypotenuse = sqrt(horizontal * horizontal + vertical * vertical);
        System.out.println("The length of the hypotenuse is: " + hypotenuse);
    }
}
