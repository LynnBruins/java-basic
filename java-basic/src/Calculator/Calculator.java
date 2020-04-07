package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    JLabel display = new JLabel("");
    String operator;
    double firstNumber, secondNumber;


    public Calculator() {
        //constructor
        this.setTitle("Calculator");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        getContentPane().add(panel, BorderLayout.CENTER);

        getContentPane().add(display, BorderLayout.NORTH);
        display.setPreferredSize(new Dimension(400,30));
        display.setFont(new Font("Arial",Font.BOLD,25));
        display.setForeground(Color.DARK_GRAY);

        String[] labels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "+",
                "C", "0", "=", "-"
        };

        for (int i = 0; i < 16; i++) {
            JButton button = new JButton(labels[i]);
            panel.add(button);
            button.addActionListener(this);
            button.setFont(new Font("Arial",Font.BOLD,20));
            button.setForeground(Color.WHITE);
            button.setBackground(Color.DARK_GRAY);
        }
    }

    public static void main(String[] args) {
	// write your code here
        Calculator calculator = new Calculator();                // new function calculator?
        calculator.setSize(400,400);               // Grootte scherm in pixels
        calculator.setVisible(true);                            // Maakt scherm zichtbaar, anders staat hij op achtergrond
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);     // Scherm echt uit, niet op achtergrond
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String currentButton = e.getActionCommand();
        System.out.println(currentButton);

        // actionPerformed
        switch (currentButton) {
            // number state
            case "0": case "1": case"2": case "3": case "4": case"5": case "6": case"7": case "8": case "9":
                display.setText("");
                display.setText(display.getText() + currentButton);
            break;

            // operator state
            case "/": case "*": case "+": case "-":
                operator = currentButton;
                firstNumber = Integer.parseInt(display.getText());
                display.setText(operator);
            break;

            // reset state
            case "C":
                firstNumber = secondNumber = 0;
                display.setText("");
            break;

            // calculator state
            case "=":
                secondNumber = Integer.parseInt(display.getText());
                double result = 0;
                switch (operator) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case "/":
                        result= firstNumber / secondNumber;
                        break;
                }
                display.setText(firstNumber + operator + secondNumber + "=" + result);
            break;

            // you should never come here
            default:
                System.out.println("System Error");
        }
    }
}
