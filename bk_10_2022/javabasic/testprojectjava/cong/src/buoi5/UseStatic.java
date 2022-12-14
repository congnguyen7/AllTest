package buoi5;
//goi phuong thuc va truy cap thuoc tinh

public class UseStatic {
    static int a=12;
    static int b;
    int c=1;

    static void meth1() {
        System.out.println("this is static method");
    }
    void meth2() {
        System.out.println("this is no static method");
    }
    public static void main(String[] args) {
        meth1(); // statis call directly
        UseStatic o1 = new UseStatic();
        o1.meth2(); // no statis them call with object
        System.out.println("value of a is " +a);
        System.out.println("value of b is---- " +b);
        System.out.println("value of c is " + o1.c);

    }

}
