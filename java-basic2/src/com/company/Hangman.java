package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Hangman extends JFrame implements ActionListener {

    JLabel display = new JLabel("");
    JLabel displayletters = new JLabel("");
    JTextField textField = new JTextField();
    JComboBox<String> selectNiveau = new JComboBox<String>();
    Random generator = new Random();
    int random = generator.nextInt(5);
    String[] Easy = {"made", "have", "shut", "flag", "hugs"};
    String[] Normal = {"absurd", "after", "banjo", "gizmo", "injury"};
    String[] Hard = {"abruptly", "pueblo", "nymph", "fixable", "microwave"};
    String[] Hardest = {"sequoia", "axiom", "zwieback", "nightclub", "kilobyte"};
    String word;
    String correctletters = "";
    int lives = 10;
    int lengthword = 1;

    public Hangman() {
        // Constructor
        this.setTitle("Hangman");

        getContentPane().add(display, BorderLayout.NORTH);
        display.setPreferredSize(new Dimension(500,30));
        display.setFont(new Font("Arial",Font.BOLD,15));
        display.setText("Welcome to hangman! Choose your level of difficulty: ");

        getContentPane().add(selectNiveau, BorderLayout.WEST);
        selectNiveau.setPreferredSize(new Dimension(100,30));

        selectNiveau.addItem("Easy");
        selectNiveau.addItem("Normal");
        selectNiveau.addItem("Hard");
        selectNiveau.addItem("Hardest");
        selectNiveau.addActionListener(this);

        getContentPane().add(displayletters, BorderLayout.EAST);
        displayletters.setPreferredSize(new Dimension(400,30));
        displayletters.setFont(new Font("Arial",Font.BOLD,15));

        getContentPane().add(textField, BorderLayout.SOUTH);
        textField.addActionListener(this);
    }


    public static void main(String[] args) {
        Hangman game = new Hangman();
        game.setSize(500,110);
        game.setVisible(true);
        game.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        System.out.println(action);

        String niveau = (String) selectNiveau.getSelectedItem();
        System.out.println(niveau);

        switch (action) {
            case "comboBoxChanged":
                switch (niveau) {
                    case "Easy":
                        word = Easy[random];
                        break;
                    case "Normal":
                        word = Normal[random];
                        break;
                    case "Hard":
                        word = Hard[random];
                        break;
                    case "Hardest":
                        word = Hardest[random];
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + niveau);
                }
                System.out.println(word);
                lengthword = word.length();
                System.out.println(lengthword);
                selectNiveau.setVisible(false);
                display.setText("Start guessing letters. It's a " + word.length() + "-letter word.");
                break;
            default:
                String letter = action;
                boolean guess = word.contains(letter);

                if (guess == true) {
                    correctletters = action + correctletters;
                    display.setText("Correct. You have still " + lives + " left!");
                    displayletters.setText("It's a " + word.length() + "-letter word. Correct letters: " + correctletters);
                    textField.setText("");
                    lengthword--;
                    System.out.println("Lengte: " + lengthword);
                }
                else if(guess == false) {
                    lives--;
                    display.setText("Wrong, try again. You have " + lives + " lives left!");
                    displayletters.setText("It's a " + word.length() + "-letter word. Correct letters: " + correctletters);
                    textField.setText("");
                    System.out.println("Levens: " + lives);
                }

        }

        if (lengthword == 0) {
            display.setText("Congratulations, you guessed all letters! The word was " + word);
            JOptionPane.showMessageDialog(null, "Congratulations, you have won! The word was " + word);
        }
        else if (lives == 0) {
            display.setText("Game over, you lost all your lives! The word was " + word);
            JOptionPane.showMessageDialog(null, "Game over, you lost all your lives! The word was " + word);
        }
    }
}