package com.company;

import java.util.ArrayList;

public class Opdracht16 {
    public static void main(String[] args) {

        ArrayList<Integer> sequence = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++) {
            sequence.add(1+((i+1)*4));
        }
        System.out.println("" + sequence);
    }
}
