package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Numberguessinggame extends JFrame implements ActionListener {

    JLabel display = new JLabel("");
    JLabel displayanswer = new JLabel("");
    JTextField textField = new JTextField();
    int guess;
    Random generator = new Random();
    int random = generator.nextInt(1000) + 1;

    public Numberguessinggame() {
        // constructor
        this.setTitle("Number Guessing Game");
        System.out.println(random);
        display.setText("Enter a guess (1-1000):");

        getContentPane().add(display, BorderLayout.NORTH);
        display.setPreferredSize(new Dimension(400,30));
        display.setFont(new Font("Arial",Font.BOLD,25));

        getContentPane().add(displayanswer, BorderLayout.CENTER);
        display.setPreferredSize(new Dimension(400,30));
        display.setFont(new Font("Arial",Font.BOLD,20));

        getContentPane().add(textField, BorderLayout.SOUTH);
        textField.addActionListener(this);
    }


    public static void main(String[] args){
        Numberguessinggame game = new Numberguessinggame();
        game.setSize(400, 120);
        game.setVisible(true);
        game.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = e.getActionCommand();
        System.out.println(text);

        guess = Integer.parseInt(text);

        if (random != guess) {
            if (guess < random) {
                displayanswer.setText("Wrong, your guess is too low.");
                textField.setText("");
            }
            else if (guess > random) {
                displayanswer.setText("Wrong, your guess is too high.");
                textField.setText("");
            }
        }
        else {
            displayanswer.setText("Your guess is correct. Congratulations!");
        }

    }
}

