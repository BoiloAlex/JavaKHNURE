package Vol3.Bond1AWT;

import java.awt.*;
import java.util.Random;

public class Circle20 extends Frame {

    public void paint(Graphics g) {
//        this.setLayout(manager);
        g.setColor(Color.red);
        int w = this.getWidth();
        int h = this.getHeight();
        int r = (w < h ? w / 2 : h / 2) *3/2 ;
        //g.drawOval(w / 10, h / 10, r, r);
        int delta = r / 20;
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            g.setColor(Color.getHSBColor(rnd.nextFloat(),rnd.nextFloat(),rnd.nextFloat()));
            g.drawOval( w / 10 + delta * i, h / 10+ delta * i, r - delta * i*2, r - delta * i * 2);
        }
        

        //g.setXORMode(Color.cyan);

    }


    public static void main(String[] args) {
        Circle20 frame = new Circle20();
        frame.setSize(new Dimension(600, 400));
        frame.setVisible(true);

    }
}


