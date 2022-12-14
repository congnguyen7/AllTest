package buoi11_giaodien_ungdung;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Cal extends JFrame implements ActionListener {

    //declare components
    JButton bt1, bt2, bt3, bt4,bt5, btc;
    JTextField tf1, tf2, tf3;
    double result;
    Container cont;
    JPanel panel1, panel2, panel3;
    JLabel cpr;

    public Cal(String s) {
        super(s);// cal constructor of JFrame
        cont = this.getContentPane();

        JLabel num1lb = new JLabel("Num1: ");
        tf1 = new JTextField();
        JLabel num2lb = new JLabel("Num2: ");
        tf2 = new JTextField();
        JLabel resultlb = new JLabel("Result: ");



        tf3 = new JTextField();
        tf3.setEditable(false);//khong cho phep sua


        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3,2));
        panel1.add(num1lb);
        panel1.add(tf1);
        panel1.add(num2lb);
        panel1.add(tf2);
        panel1.add(resultlb);
        panel1.add(tf3);

        bt1 = new JButton("+");
        bt2 = new JButton("-");
        bt3 = new JButton("*");
        bt4 = new JButton("/");
        bt5 = new JButton("^");
        btc = new JButton("Clean");

        panel2 = new JPanel();
        panel2.add(bt1);
        panel2.add(bt2);
        panel2.add(bt3);
        panel2.add(bt4);
        panel2.add(bt5);
        panel2.add(btc);

        cpr = new JLabel("Program at VKU");
        panel3 = new JPanel();
        panel3.add(cpr);

        cont.setLayout(new BorderLayout());
        cont.add(panel1, BorderLayout.NORTH);
        cont.add(panel2, BorderLayout.CENTER);
        cont.add(panel3, BorderLayout.SOUTH);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        btc.addActionListener(this);

        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }// the end constructor


    public void doPlus() {
        result = Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText());
        tf3.setText(String.valueOf(result));
    }

    public void doMinus() {
        result = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
        tf3.setText(String.valueOf(result));
    }
    public void doMult() {
        result = Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText());
        tf3.setText(String.valueOf(result));
    }
    public void doDiv() {
        result = Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText());
        double a = ((double) Math.round(result*10)/10);
        tf3.setText(String.valueOf(result));
    }
    public void doDivv() {
    }
    public void doClean() {
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "+") {
            doPlus();
        }
        if(e.getActionCommand() == "-") {
            doMinus();
        }
        if(e.getActionCommand() == "*") {
            doMult();
        }
        if(e.getActionCommand() == "/") {
            doDiv();
        }
        if(e.getActionCommand() == "*") {
            doDivv();
        }
        if(e.getActionCommand() == "Xin chào") {
            doDivv();
        }
        if(e.getActionCommand() == "Clean") {
            doClean();
        }
    }

    //	public static void Calculator1(String[] args) {
//		new Cal("Arithmatic");
//		// TODO Auto-generated method stub
//
//	}
    public static void main(String[] args) {
        new Cal("Arithmatic");
    }

}
