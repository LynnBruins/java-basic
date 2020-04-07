package Exercises;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Opdracht6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a test score between 1 and 10: ");
            int a = scanner.nextInt();
            if (a > 7) {
                count++;
            }
        }

        System.out.println("The number of scores greater than 7: " + count);

    }
}
