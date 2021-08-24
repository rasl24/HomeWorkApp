import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow(){
        setVisible(true);

        setLocation(650, 500);
        setSize(500, 500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1, 2));

        JButton btn1 = new JButton("Выход");

        ActionListener listener = new CloseActionListener();
        btn1.addActionListener(listener);
        panel.add(btn1);

        JButton btn2 = new JButton("Кнопка 2");
        panel.add(btn2);

        add(panel, BorderLayout.SOUTH);
    }
}
