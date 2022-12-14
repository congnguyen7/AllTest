package buoi10_giaodien_gi;

import javax.swing.*;
import java.awt.*;

public class Test1 {
    public static void main(String[] args) {
        //JFrame có 2 constructor 1 cái có tham số 1 cái k có tham số
        JFrame f = new JFrame("Program 1"); //container //super
        //xet layout cho Frame// nó chia theo vùng, bắc,nam, đông, tây, center.
        f.setLayout(new BorderLayout());
        //xet layout cho Frame // chia từ trái sang phải trên xuống
//        f.setLayout(new FlowLayout());

        JPanel p = new JPanel();    //container without title in JFrame //container k co tieu de
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();    //container without title in JFrame //container k co tieu de
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();    //container without title in JFrame //container k co tieu de
        //thiết kế bố cục // các đặt các thành phần lên trên thùng chứa (or Frame)/

        p.setLayout(new FlowLayout()); //xet layout cho Panel
            //tao thanh phan (nhãn tên Label)
        JLabel l = new JLabel("Label 1");
        JLabel l2 = new JLabel("Label 2");
        JLabel l3 = new JLabel("Label 3");
        JLabel l4 = new JLabel("Label 4");
        JLabel l5 = new JLabel("Label 5");
        JLabel l6 = new JLabel("Label 6");

        //nhãn đặc biệt add thẳng vào Frame k thông qua Panel
        JLabel l7 = new JLabel("Label 7");



        //--------
        p2.setLayout(new FlowLayout());
        //tao thanh phan (nhãn tên Label)
        JLabel ll = new JLabel("Label ll", JLabel.CENTER);
        JLabel ll2 = new JLabel("Label ll2");
        JLabel ll3 = new JLabel("Label ll3");
        JLabel ll4 = new JLabel("Label ll4");

        JLabel lll1 = new JLabel("Label lll1", JLabel.CENTER);
        JLabel lll2 = new JLabel("Label lll2", JLabel.CENTER);
        JLabel lll3 = new JLabel("Label lll3", JLabel.CENTER);

        //tao nut lenh - button
        JButton b1 = new JButton("OK");
        // đưa nhãn vào Panel
        p.add(l);
//        p.add(l2);
//        p.add(l3);
//        p.add(l4);
        p2.add(ll);
        p3.add(lll1);
        p4.add(lll2);
        p5.add(lll3);


        //-----------
//        p2.add(ll);
//        p2.add(ll2);
//        p2.add(ll3);
//        p2.add(ll4);
        //đưa Panel vào Frame
//        f.add(p);
//        f.add(p2);
//
//        f.add(l7);
        f.add(p,BorderLayout.NORTH);
        f.add(p2,BorderLayout.EAST);
        f.add(p3,BorderLayout.SOUTH);
        f.add(p4,BorderLayout.WEST);
        f.add(p5,BorderLayout.CENTER);



        f.setSize(600,900); //thiet lap kich thuoc cho Frame
        //thiết lập trạng thái điều khiển cho Frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //cho Frame hiển thị
        f.setVisible(true);
    }
}
