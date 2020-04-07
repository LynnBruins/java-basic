package Exercises;

import java.util.Scanner;

public class Opdracht8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n1 = scanner.nextDouble();
        System.out.print("Enter a number: ");
        double n2 = scanner.nextDouble();
        System.out.print("Enter a number: ");
        double n3 = scanner.nextDouble();

        double[] numbers = {n1, n2, n3};
        double max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The largest number is: " + max);
    }
}
