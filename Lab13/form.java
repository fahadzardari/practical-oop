package Lab13;
import javax.swing.JButton;
import org.json.simple.JSONObject;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;

public class form{
    JFrame f;
    form(){
        f = new JFrame();
        JLabel l1 = new JLabel("Name");
        JLabel l2 = new JLabel("Roll no");
        JLabel l3 = new JLabel("Batch");
        JLabel l4 = new JLabel("Section");
        JLabel l5 = new JLabel("Gender");
        JLabel l6 = new JLabel("Education");
        JLabel l7 = new JLabel("Address");
        JLabel l8 = new JLabel("Country");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JTextField t4 = new JTextField();
        JButton b1 = new JButton("Print");
        JButton b2 = new JButton("Save");
        JButton b3 = new JButton("Save To DB");
        JButton b4 = new JButton("Fetch From DB");

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JCheckBox c1 = new JCheckBox("Matric");
        JCheckBox c2 = new JCheckBox("Intermediate");
        JCheckBox c3 = new JCheckBox("Graduate");
        JCheckBox c4 = new JCheckBox("High School");
        JTextArea a1 = new JTextArea();
        JList list = new JList();
        String[] country = {"Pakistan","Spain","China"};
        JComboBox cb = new JComboBox(country);
        ButtonGroup group = new ButtonGroup();

        l1.setBounds(150,50,100,30);
        l2.setBounds(150,100,100,30);
        l3.setBounds(150,150,100,30);
        l4.setBounds(150,200,100,30);
        l5.setBounds(150,250,100,30);
        l6.setBounds(150,300,100,30);
        l7.setBounds(150,400,100,30);
        l8.setBounds(150,480,100,30);
        t1.setBounds(250,50,150,30);
        t2.setBounds(250,100,150,30);
        t3.setBounds(250,150,150,30);
        t4.setBounds(250,200,150,30);
        male.setBounds(250,250,100,30);
        female.setBounds(350,250,100,30);
        c1.setBounds(250,300,100,30);
        c2.setBounds(350,300,100,30);
        c3.setBounds(250,350,100,30);
        c4.setBounds(350,350,100,30);
        a1.setBounds(250,400,200,60);
        cb.setBounds(250,480,100,30);
        b1.setBounds(50,530,100,30);
        b2.setBounds(160,530,100,30);
        b3.setBounds(270,530,100,30);
        b4.setBounds(380,530,150,30);

        male.setActionCommand("Male");
        female.setActionCommand("Female");
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
 
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String name = t1.getText();
                String roll = t2.getText();
                String batch = t3.getText();
                String section = t4.getText();
                String Gender = group.getSelection().getActionCommand();
                String Qualification = c1.isSelected() ? "Matric" : "";
                Qualification += c2.isSelected() ? ",Intermediate" : "";
                Qualification += c3.isSelected() ? ",Graduate"  : "";
                Qualification += c4.isSelected() ? ",High School":  "";
                String Address = a1.getText();
                String Country = cb.getSelectedItem().toString();
                new print(name, roll, batch, section, Gender, Qualification, Address, Country);
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String Gender = group.getSelection().getActionCommand();
                String Qualification = c1.isSelected() ? "Matric," : "";
                Qualification += c2.isSelected() ? ",Intermediate" : "";
                Qualification += c3.isSelected() ? ",Bachelors" : "";
                Qualification += c4.isSelected() ? ",High School" : "";
                try{
                    FileWriter fw = new FileWriter(t2.getText()+".json");
                    JSONObject obj = new JSONObject();

                    obj.put("name", t1.getText());
                    obj.put("roll", t2.getText());
                    obj.put("batch", t3.getText());
                    obj.put("section", t4.getText());
                    obj.put("gender", Gender);
                    obj.put("qualification", Qualification);
                    obj.put("address", a1.getText());
                    obj.put("country", cb.getSelectedItem().toString());
                    
                    fw.write(obj.toJSONString());
                    fw.close();
                }catch(Exception er){System.out.println(er);}
        }});
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String gender = group.getSelection().getActionCommand();

                String qualification = c1.isSelected() ? "Matric," : "";
                qualification += c2.isSelected() ? ",Intermediate" : "";
                qualification += c3.isSelected() ? ",Bachelors" : "";
                qualification += c4.isSelected() ? ",High School" : "";
                Boolean resp = DBConnect.save(t1.getText(), t2.getText(), t4.getText(), t3.getText(), gender, cb.getSelectedItem().toString(), a1.getText(), qualification);
                if(resp ){
                    JOptionPane.showMessageDialog(f, "Data Saved Successfully");
                }else{
                    JOptionPane.showMessageDialog(f, "Error in saving data ");
                }
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String roll = JOptionPane.showInputDialog(f, "Enter Roll No");
                try {
                    DBConnect.fetch(roll);
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });
        
        group.add(male);
        group.add(female);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(male);
        f.add(female);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.add(a1);
        f.add(cb);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setSize(600,700);
        f.setLayout(null);
        f.setVisible(true);  
    }

    public static void main(String[] args) {
        new form();
    }
}