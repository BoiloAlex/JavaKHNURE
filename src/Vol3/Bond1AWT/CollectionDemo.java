package Vol3.Bond1AWT;
/*
* Создать придлжние  с окнеом, в кортором распооложеит максимальное количество компонентов библиотеки AWT
* */
import java.awt.*;

public class CollectionDemo extends Frame{
    FlowLayout manager = new FlowLayout();
    Label label = new Label();
    Button button = new Button();
    Checkbox checkbox = new Checkbox();



    public CollectionDemo() {
        try {
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() {
        this.setSize(new Dimension(600, 100));
        label.setText("label");
        button.setLabel("button");
        checkbox.setLabel("checkbox");
        this.setLayout(manager);
        this.add(label,BorderLayout.AFTER_LAST_LINE);
        this.add(button, BorderLayout.AFTER_LAST_LINE);
        this.add(checkbox,BorderLayout.AFTER_LAST_LINE);
    }

    public static void main(String[] args) {
        CollectionDemo frame = new CollectionDemo();
        frame.setVisible(true);
    }
}
