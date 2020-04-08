package Teken;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class Eraser extends Figure {

    public void draw(Graphics g) {
        g.setColor(UIManager.getColor("Panel.background"));
        g.drawRect(x1,y1,x2-x1,y2-y1);
        g.fillRect(x1,y1,x2-x1,y2-y1);
    }

}
