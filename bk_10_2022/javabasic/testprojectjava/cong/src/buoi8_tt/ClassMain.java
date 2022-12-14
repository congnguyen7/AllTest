package buoi8_tt;

public class ClassMain {
    public static void main(String[] args) {
        //call 3 method: method1(), method2(), method3()
//        Class1 o = new Class1();
        Class2 o = new Class2();

        //goi thong qua doi tuong
        o.meth1(); //void
        System.out.println("This is method 2 "+o.meth2(2)); //int
        System.out.println("This is method 3 "+o.meth3(3,4)); //double

        System.out.println("This is method 4 "+o.meth4("cong")); //int
        System.out.println("This is method 5 "+o.meth5(11, 11.11)); //double

        System.out.println("This is method 6 "+o.meth6("hhhhhhhhh")); //int
        System.out.println("This is method 7 "+o.meth7(1, 1, 1.1)); //double

        o.meth8(); //void
        o.meth18();

        //override
        o.showInfo();
        Class3 o2 = new Class3();
        o2.showInfo();

        System.out.println("Tong la: " + o.tinh(10, 5));
        System.out.println("Tich la: " + o2.tinh(10, 5));
    }
}
