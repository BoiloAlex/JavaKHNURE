package Calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorPanel extends JPanel {
    JPanel panel;
    public Label ekran;
    double result;
    boolean begin;
    String lastCommand;

    public CalculatorPanel() {
        setLayout(new BorderLayout());//
        begin = true;
        result = 0;
        lastCommand = "=";
        ekran = new Label("0");
        ekran.setFont(new Font("sansserif", Font.ITALIC, 23));
        ekran.setAlignment(Label.CENTER);
        this.add(ekran, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));
        //setLayout(new GridLayout( 4,5));// менеджер расположения
        this.add(panel, BorderLayout.CENTER);

        ActionListener addNum = new AddNumAction();

        ActionListener command = new CommandAction();

        addButton("1", addNum);
        addButton("2", addNum);
        addButton("3", addNum);
        addButton("+", command);
        addButton("4", addNum);
        addButton("5", addNum);
        addButton("6", addNum);
        addButton("-", command);
        addButton("7", addNum);
        addButton("8", addNum);
        addButton("9", addNum);
        addButton("-", command);
        addButton("0", addNum);
        addButton(".", addNum);
        addButton("=", command);
        addButton("/", command);
        addButton("C", command);
    }

    public void addButton(String label, ActionListener listener) {
        Button but = new Button(label);
        but.addActionListener(listener);
        but.setFont(new Font("sansserif", Font.ITALIC, 25));
        panel.add(but);

    }

    private class AddNumAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String input = event.getActionCommand();

            if (begin) {
                ekran.setText("0");
                begin = false;
            }

            if (input.equals("0") && ekran.getText().equals("0"))
                return;

            if (input.equals(".") && ekran.getText().contains("."))
                return;

            if (!input.equals(".") && ekran.getText().equals("0"))
                ekran.setText("");

            if (ekran.getText().length() < 10)
                ekran.setText(ekran.getText() + input);
        }
    }

    private class CommandAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();

            if (command.equals("C")) {
                ekran.setText("0");
                begin = true;
                result = 0;
            } else if (begin) {
                lastCommand = command;
            } else {
                calculate(Double.parseDouble(ekran.getText()));
                lastCommand = command;
                begin = true;
            }

        }
    }

    public void calculate(double x) {
        if (lastCommand.equals("+"))
            result += x;
        else if (lastCommand.equals("-"))
            result -= x;
        else if (lastCommand.equals("*"))
            result *= x;
        else if (lastCommand.equals("/"))
            result /= x;
        else if (lastCommand.equals("="))
            result = x;
        ekran.setText("" + result);
    }
}
