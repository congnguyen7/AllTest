package demopackage;

import demopackage1.MyAddrest;
import demopackage1.MyCar;
//import demopackage1.*;


public class PrintInformation {
    public static void main(String[] args) {
        String name = "Coongooooo";
        int age = 10;
        MyClass obj = new MyClass();
        obj.getName(name);
        obj.getAge(age);

        //Khởi tạo đối tượng
        MyAddrest myAddrest = new MyAddrest();
        myAddrest.addrest("Q.tri");
        myAddrest.addrest_number(22);

        MyCar myCar = new MyCar();
        myCar.my_car("xe dap "); //khi khong khai bao tu khoa static
        MyCar.my_car("sss"); ////khi khai bao tu khoa static
        double sum = 0;
        sum = myCar.sum_car(2,8);
        System.out.println(sum);
        System.out.println(myCar.sum_car(2,5));

    }

}
