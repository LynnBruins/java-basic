package Exercises;

public class Opdracht15 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i < 21; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of all odd integers between 1-20 : " + sum);

    }
}
