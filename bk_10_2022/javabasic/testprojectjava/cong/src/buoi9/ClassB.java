package buoi9;

public class ClassB extends ClassA implements Interface3{ //1 lop co the thua ke 1 lop va //thuc thi dc nhieu Interface
    public void m1(int a, int b) {
        System.out.println("m1: Tong a va b: " +(a+b));
    }

    public void m2() {
        System.out.println("m2: hello");
    }

    public double m3() {
        double c = 1.1;
        double d = 4.1;
        return c*d;
    }

    public double m4(double c, double d) {
        return c*d;
    }

    public void m5() {
        System.out.println("m5");
    }

    public void m6(int a, int b, int c) {
        System.out.println(a*b*c);
    }

    public double m7() {
        return 0;
    }

    public double m8(double c, double d) {
        return c*d;
    }

    public void m9() {
        System.out.println("m9: day la m9");
    }

    public void m10() {

    }
}
