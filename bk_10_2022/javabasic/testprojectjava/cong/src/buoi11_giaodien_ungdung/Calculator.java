package buoi11_giaodien_ungdung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//implements thuc thi interface
public class Calculator extends JFrame implements ActionListener {
    //declare components: Jlabel, JTexField, JButton, JPanel
    JButton bt1,bt2,bt3,bt4,bt5;
    JTextField tf1,tf2,tf3;
    Container cont;
    JPanel p1,p2,p3;
    JLabel l1,l2,l3,l4;
    double kq;
    //create construct
    public Calculator(String s) {
        super(s);
        cont = this.getContentPane();
        //create companents
        l1 = new JLabel(("num 1 "));
        tf1 = new JTextField();
        l2 = new JLabel(("num 2 "));
        tf2 = new JTextField();

        //k cho phep sua
        l3 = new JLabel(("Result"));
        tf3 = new JTextField();
        tf3.setEditable(false); //no edit
        l4 = new JLabel("sssssssssss");
        //create Panel
        p1 = new JPanel();
        p1.setLayout(new GridLayout(3,2));
        //add components to Panel p1
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(l3);
        p1.add(tf3);

        //create buttons
        bt1 = new JButton("+");
        bt2 = new JButton("-");
        bt3 = new JButton("*");
        bt4 = new JButton("/");
        bt5 = new JButton("CLEAR");



        p2 = new JPanel();
        p2.setLayout(new GridLayout(1,5));

        p2.add(bt1);
        p2.add(bt2);
        p2.add(bt3);
        p2.add(bt4);
        p2.add(bt5);

        p3 = new JPanel();
        p3.add(l4);

        //...
        cont.setLayout(new BorderLayout());
        cont.add(p1,BorderLayout.NORTH);
        cont.add(p2,BorderLayout.CENTER);
        cont.add(p3,BorderLayout.SOUTH);

        //set properties for Frame
        this.pack(); //auto fix cửa số to nhỏ

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }
    //code to button
    public void doPlus(){
        kq = Double.parseDouble(tf1.getText() + Double.parseDouble(tf2.getText()));
        tf3.setText(String.valueOf(kq));
    }
    public void doClear(){
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");

    }

    public static void main(String[] args) {
        new Calculator("Test program GUI");

    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getActionCommand()=="+"){
            doPlus();
        }
        if(actionEvent.getActionCommand()=="Clean"){
            doClear();
        }
    }
}
