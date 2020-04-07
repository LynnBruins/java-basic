package Teken;

import java.awt.*;

public class FilledOval extends Figure {

    public void draw(Graphics g) {
        g.drawOval(x1,y1,x2-x1,y2-y1);
        g.fillOval(x1,y1,x2-x1,y2-y1);
    }

}
