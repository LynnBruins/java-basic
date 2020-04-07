package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    JLabel display = new JLabel("");
    JButton button[] = new JButton[9];

    String letter = "";
    ImageIcon X;
    ImageIcon O;
    ImageIcon ltr;
    int turn = 0;
    boolean win = false;
    String[] letters = new String[9];

    public TicTacToe() {
        this.setTitle("Tic Tac Toe");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        getContentPane().add(panel, BorderLayout.CENTER);

        display.setText("Welcome to Tic Tac Toe, player X can start!");
        display.setPreferredSize(new Dimension(500,30));
        display.setFont(new Font("Arial", Font.BOLD,20));
        getContentPane().add(display, BorderLayout.NORTH);


        // Assign images of X and O
        X = new ImageIcon(getClass().getResource("X.png"));
        O = new ImageIcon(getClass().getResource("O.png"));


        for (int i = 0; i < 9; i++) {
            letters[i] = "";
            button[i] = new JButton();
            panel.add(button[i]);
            button[i].addActionListener(this);
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.setSize(500,500);
        game.setVisible(true);
        game.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent a) {
        turn++;
        // Who's Turn
        if (turn % 2 == 1) {
            ltr = X;
            letter = "X";
            display.setText("Player O, it's your turn!");

        }
        if (turn % 2 == 0) {
            ltr = O;
            letter = "O";
            display.setText("Player X, it's your turn!");

        }

        // Display Letters
        for (int i = 0; i < 9; i++) {
            if (a.getSource() == button[i]) {
                button[i].setIcon(ltr);
                button[i].setDisabledIcon(ltr);
                button[i].setEnabled(false);
                letters[i] = letter;
            }
        }

        // Who Won

        // Horizontal
        if (letters[0].equals(letters[1]) && letters[1].equals(letters[2]) && !letters[0].equals("")) {
            win = true;
        } else if (letters[3].equals(letters[4]) && letters[4].equals(letters[5]) && !letters[3].equals("")) {
            win = true;
        } else if (letters[6].equals(letters[7]) && letters[7].equals(letters[8]) && !letters[6].equals("")) {
            win = true;
        }

        // Vertical
        if (letters[0].equals(letters[3]) && letters[3].equals(letters[6]) && !letters[0].equals("")) {
            win = true;
        } else if (letters[1].equals(letters[4]) && letters[4].equals(letters[7]) && !letters[1].equals("")) {
            win = true;
        } else if (letters[2].equals(letters[5]) && letters[5].equals(letters[8]) && !letters[2].equals("")) {
            win = true;
        }

        // Diagonal
        if (letters[0].equals(letters[4]) && letters[4].equals(letters[8]) && !letters[0].equals("")) {
            win = true;
        } else if (letters[2].equals(letters[4]) && letters[4].equals(letters[6]) && !letters[2].equals("")) {
            win = true;
        }

        if (win) {
            display.setText("Player " + letter + " wins!");
            JOptionPane.showMessageDialog(null, "Player " + letter + " wins!");
            for (JButton i : button) {
                i.setEnabled(false);
            }
        } else if (!win && turn == 9) {
            display.setText("The game ended in a tie.");
            JOptionPane.showMessageDialog(null, "The game ended in a tie.");
        }
    }
}