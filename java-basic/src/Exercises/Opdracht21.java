package Exercises;

import java.util.Scanner;

public class Opdracht21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int sum = 0;

        while (number > 0){
            int n = number % 10;
            sum = sum + n;
            number = number / 10;
        }
        System.out.println("The sum of the digits: " + sum);

    }
}
