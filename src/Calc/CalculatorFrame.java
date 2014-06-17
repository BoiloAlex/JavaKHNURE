package Calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        this.setTitle("Calculator");
        CalculatorPanel panel = new CalculatorPanel();
        this.add(panel);

        JMenuBar menubar = new JMenuBar();
        JMenu mClose = new JMenu("Close");
        JMenuItem mCloseI = new JMenuItem("Exit");
        this.setJMenuBar(menubar);
        menubar.add(mClose);
        mClose.add(mCloseI);

        this.pack();// мин размер для отображения всех элементов

        mCloseI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
