package Teken;

import java.awt.*;

public class FilledRect extends Figure {

    public void draw(Graphics g) {
        //g.setColor(Color.red);
        g.drawRect(x1,y1,x2-x1,y2-y1);
        g.fillRect(x1,y1,x2-x1,y2-y1);
    }

}
