package com.company;

import java.util.Scanner;

public class Opdracht19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        char[] letters = word.toCharArray();

        int count = 0;
        for (char a : letters) {
            if (a == 'a') {
               count++;
            }
        }
        System.out.println("The number of occurrences of the letter a in " + word + " is " + count);

    }
}
