package JavaCapToc.buoi4;
//hoc ve tinh da hinh
///Overload method//nạp chồng phương thức //buổi4
//tao ra phuong thuc nap chong tham so
class OverloadDemo {
    //TAO TONG 4 PHUONG THUC
    //tao phuong thuc test (k co tham so)
    void test() {   //phuong thuc
        System.out.println("No parameters");
    }
    //tao phuong thuc test (co 1 tham so)

    void test(int a) { //phuong thuc
        System.out.println("one integer parameters");
        System.out.println("a: " +a);

    }
    void test(int a,int b) { //phuong thuc
        System.out.println("two integer parameters");
        System.out.println("a and b: " +a+ " " +b);

    }

    double test(double a) { //phuong thuc
        System.out.println("for a double parameters");
        System.out.println("double a: " +a);
        return a * a;
    }
    double test(int a, int b, double c , double d) {
        System.out.println("----------------");
        System.out.println("add methods another and call it");
        double total = a + b + c + d;
        return total;
    }
    void test(String a, int b) { //phuong thuc
        System.out.println("2 tham so String truoc va int sau");
        System.out.println(a + "----" + b);

    }

    void test(int m, String n) { //phuong thuc
        System.out.println("2 tham so int truoc va String sau");
        System.out.println(m + "----" + n);
    }
}

public class Overload {
    public static void main(String[] args) {

        OverloadDemo test1 = new OverloadDemo();
        double result, result1;
        test1.test();
        test1.test(4);
        test1.test(2, 3);
        test1.test(4.4);
        result = test1.test(123.11);

        result1 = test1.test(100,100, 10.11 , 11.11);

        System.out.println("Result of test1.test(2,3): " + result);

        System.out.println("Result of test1.test(100,100,10,11, 11.11): " +result1);

        test1.test("hiiii " , 2);
        test1.test(3 , " aaaaa");
    }
}
