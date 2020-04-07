package Exercises;

import java.util.Scanner;

public class Opdracht11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Product number: ");
        double product = scanner.nextDouble();

        System.out.print("Quantity sold: ");
        double quantity = scanner.nextDouble();

        double total = 0;

        if (product == 1) {
            total =  quantity * 2.95;
        }
        if (product == 2) {
            total = quantity * 4.99;
        }
        if (product == 3) {
            total = quantity * 5.49;
        }
        if (product == 4) {
            total = quantity * 7.80;
        }
        if (product == 5) {
            total = quantity * 8.85;
        }

        System.out.println("The total retail value is: €" + String.format("%.2f", total));
    }
}
