package Teken;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Draw extends JFrame implements MouseListener, ActionListener {

    String currentButton;
    Figure figure = new Rectangle();
    ArrayList<Figure> figures = new ArrayList<>();
    JComboBox<String> selectLine = new JComboBox<String>();


    public Draw() throws HeadlessException {

        this.setTitle("Drawing program");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9,1));
        getContentPane().add(panel, BorderLayout.WEST);
        System.out.println(panel.getBackground());

        String[] labels = {
                "Colors",
                "Line",
                "Rectangle",
                "Filled Rectangle",
                "Oval",
                "Filled Oval",
                "Triangle",
                "Eraser",
                "Clear Screen"
        };

        for (int i = 0 ; i < 9; i++) {
            JButton button = new JButton(labels[i]);
            panel.add(button);
            button.addActionListener(this);
        }

        //getContentPane().add(selectLine, BorderLayout.SOUTH);
        //selectLine.setPreferredSize(new Dimension(600,30));
        //selectLine.addItem("Thin");
        //selectLine.addItem("Normal");
        //selectLine.addItem("Thick");

        this.addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(Figure f: figures) {
            f.draw(g);
        }
    }

    public static void main(String[] args) {

        Draw draw = new Draw();
        draw.setSize(600,600);
        draw.setVisible(true);
        draw.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentButton = e.getActionCommand();
        System.out.println(currentButton);

        switch (currentButton) {
            case "Clear Screen":
                figures.clear();
                repaint();
                break;
            case "Colors":
                Color color = JColorChooser.showDialog(null, "Choose a color", Color.RED);
                setForeground(color);
                break;
            default:
                System.out.println("System Error");
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("in pressed");

        switch (currentButton) {
            case "Line":
                figure = new Line();
                break;
            case "Rectangle":
                figure = new Rectangle();
                break;
            case "Filled Rectangle":
                figure = new FilledRect();
                break;
            case "Oval":
                figure = new Oval();
                break;
            case "Filled Oval":
                figure = new FilledOval();
                break;
            case "Triangle":
                figure = new Triangle();
                break;
            case "Eraser":
                figure = new Eraser();
                break;
            default:
                System.out.println("System Error");
        }

        figure.x1 = e.getX();
        figure.y1 = e.getY();
    }


    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("in released");

        figure.x2 = e.getX();
        figure.y2 = e.getY();
        figures.add(figure);
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}


