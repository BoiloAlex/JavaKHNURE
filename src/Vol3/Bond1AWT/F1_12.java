package Vol3.Bond1AWT;
/*
*
*
*
* */
import java.awt.*;

public class F1_12 extends Frame {
    FlowLayout manager = new FlowLayout();
    Button[] button = new Button[12];


    public F1_12() {
        try {
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() throws Exception {
        for (int i = 0; i < button.length; i ++){
            button[i] =(new Button());
            button[i].setLabel("F" + (i+1));
        }
        this.setSize(new Dimension(600, 100));
        this.setTitle("FrameTitle");
        this.setLayout(manager);
//        for (int i = 0; i < button.length; i++)
        //this.add(button[i], BorderLayout.AFTER_LAST_LINE);
        Component lable = new Label();
        Component lable1 = new Label();
        this.add(button[0], BorderLayout.AFTER_LAST_LINE);
        this.add(button[1], BorderLayout.AFTER_LAST_LINE);
        this.add(button[2], BorderLayout.AFTER_LAST_LINE);
        this.add(button[3], BorderLayout.AFTER_LAST_LINE);

        this.add(lable, BorderLayout.AFTER_LAST_LINE);

        this.add(button[4], BorderLayout.AFTER_LAST_LINE);
        this.add(button[5], BorderLayout.AFTER_LAST_LINE);
        this.add(button[6], BorderLayout.AFTER_LAST_LINE);
        this.add(button[7], BorderLayout.AFTER_LAST_LINE);
        this.add(lable1, BorderLayout.AFTER_LAST_LINE);
        this.add(button[8], BorderLayout.AFTER_LAST_LINE);
        this.add(button[9], BorderLayout.AFTER_LAST_LINE);
        this.add(button[10], BorderLayout.AFTER_LAST_LINE);
        this.add(button[11], BorderLayout.AFTER_LAST_LINE);
    }

    public static void main(String[] args) {
        F1_12 frame = new F1_12();
        frame.setVisible(true);

    }
}
