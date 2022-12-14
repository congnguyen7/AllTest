package buoi5;
//taoclass
class TessAcc {
    int a; //default access = tuong duong voi public
    public int b; //public access
    private int c; //private access //truy cap cung lop cua no thoi
    //create method to set c's value
    public void setc(int i) {
        c=i;
    }
    //create method to get c's value
    int getc() {
        return c;
    }
    void prints() {
        System.out.println("value of " +b );
    }
}
public class AccessTest {
    public static void main(String[] args) {
        //tao 1 doi tuong
        TessAcc ob2 = new TessAcc();
        // test access directly to variable
        ob2.a=10;
        ob2.b=20;
        // ob2.c=10; //no access// loi vi khai bao private
        ob2.setc(30);
        System.out.println("Value a is: " +ob2.a);
        System.out.println("Value b is: "+ ob2.b);
        System.out.println("Value c is: "+ob2.getc());

        //vd: goi phuong thuc prints thong qua doi tuong ob2
        ob2.prints();

    }
}
