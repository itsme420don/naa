import javax.swing.*;
import java.awt.*;

public class TextStyle extends JFrame {

    public TextStyle() {
        setSize(300,200);
        setLayout(null);

        JTextArea ta = new JTextArea("Hello BCA");
        ta.setBounds(10,10,250,100);

        JComboBox<String> size = new JComboBox<>(new String[]{"Small","Medium","Large"});
        size.setBounds(10,120,100,30);

        add(ta);
        add(size);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TextStyle();   // Correct object creation
    }
}
