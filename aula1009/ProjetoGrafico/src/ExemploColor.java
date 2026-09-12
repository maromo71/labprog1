import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class ExemploColor extends JFrame {
    public ExemploColor(){
        setSize(400, 130);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(255, 0, 0));
        g.fillRect(25, 25, 100, 20);
        g.drawString("Cor corrente" + g.getColor(), 130,40);
    }
}
