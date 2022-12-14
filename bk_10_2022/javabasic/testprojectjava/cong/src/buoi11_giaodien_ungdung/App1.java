package buoi11_giaodien_ungdung;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App1 extends JFrame implements ActionListener {
    //declare components
    JCheckBox cb1,cb2,cb3,cb4,cb5;
    JComboBox cbb1,cbb2,cbb3,cbb4,cbb5;
    JRadioButton r1,r2;
    JButton bt;
    String num[]= {"1","2","3","4","5"};
    JLabel l1,l2,l3;

    public  App1(String s) {
        super(s);
        l1 = new JLabel("Program Order Food");
        l1.setBounds(50,30,300,20);

        l2 = new JLabel("Type");
        l2.setBounds(50,70,200,20);

        l3 = new JLabel("Type");
        l3.setBounds(300,70,200,20);

        cb1 = new JCheckBox("cafe 15$");
        cb1.setBounds(50,100,150,20);
        cbb1 = new JComboBox(num);
        cbb1.setBounds(300,100,150,20);

        add(l1);
        add(l2);
        add(l3);
        add(cb1);
        add(cbb1);


//        pack();
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);

    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("ssss");
    }

    public static void main(String[] args) {
        new App1("Program test");
    }
}
