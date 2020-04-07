package Exercises;

import java.util.Scanner;

public class Opdracht1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Article: ");
                String article = scanner.nextLine();

        System.out.print("Noun: ");
                String noun = scanner.nextLine();

        System.out.print("Verb: ");
                String verb = scanner.nextLine();

        System.out.println(article + " " + noun + " " + verb);
    }
}
