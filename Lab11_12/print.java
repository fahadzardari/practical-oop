import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class print {
    JFrame f;
    print(String name, String roll, String batch, String section, String gender, String quali, String address, String country){
        f = new JFrame();
        JLabel l1 = new JLabel(name);
        JLabel l2 = new JLabel(roll);
        JLabel l3 = new JLabel(batch);
        JLabel l4 = new JLabel(section);
        JLabel l5 = new JLabel(gender);
        JLabel l6 = new JLabel(quali);
        JLabel l7 = new JLabel(address);
        JLabel l8 = new JLabel(country);

        l1.setText(name);
        l2.setText(roll);
        l3.setText(batch);
        l4.setText(section);
        l5.setText(gender);
        l6.setText(quali);
        l7.setText(address);
        l8.setText(country);
        l1.setBounds(100, 10, 200, 60);
        l2.setBounds(100, 60, 200, 60);
        l3.setBounds(100, 120, 200, 60);
        l4.setBounds(100, 180, 200, 60);
        l5.setBounds(100, 240, 200, 60);
        l6.setBounds(100, 300, 200, 60);
        l7.setBounds(100, 360, 200, 60);
        l8.setBounds(100, 400, 200, 60);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.setSize(500,600);
        f.setLayout(null);
        f.setVisible(true); 

    }
}
