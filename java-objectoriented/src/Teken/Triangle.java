package Teken;

import java.awt.*;

public class Triangle extends Figure {
    @Override
    public void draw(Graphics g) {
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x1,y1,x1*2,y1*2);
        g.drawLine(x2,y2,x1*2,y1*2);
        // g.drawPolygon(x,y,3);
    }
}
