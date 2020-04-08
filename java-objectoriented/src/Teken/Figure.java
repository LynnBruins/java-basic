package Teken;

import java.awt.*;

public abstract class Figure {

    int x1, y1, x2, y2, x3, y3;
    int x[] = {x1, x2, x3};
    int y[] = {y1, y2, y3};
    Color color;

    public abstract void draw(Graphics g);

}
