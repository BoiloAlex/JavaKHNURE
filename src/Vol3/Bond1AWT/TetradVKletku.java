package Vol3.Bond1AWT;
/*
* Тетрадь в клетку
*
* */

import java.awt.*;

public class TetradVKletku extends Frame {
    // FlowLayout manager = new FlowLayout();

    public void paint(Graphics g) {
//        this.setLayout(manager);
        g.setColor(Color.red);
        int w = this.getWidth();
        int h = this.getHeight();
       // int side = w < h ? w / 2 : h / 2;
       // g.fillRect(w / 4, h / 4, side, side);
        g.setXORMode(Color.cyan);
        //g.setColor(Color.gray);
        //g.drawLine(20,20,20,w);
        for (int i = 20; i < w; i = i + 20)
            g.drawLine(i, 20, i, h);
        for (int i = 20; i < h; i = i + 20)
            g.drawLine(20, i, w, i);
    }


    public static void main(String[] args) {
        TetradVKletku frame = new TetradVKletku();
        frame.setSize(new Dimension(600, 400));
        frame.setVisible(true);

        TetradVKletku frame1 = new TetradVKletku();
        frame1.setSize(new Dimension(400, 600));

    }
}
