package JavaCapToc;

class ChuNhat {
    double dai;   //bien
    double rong;  //bien

    //vd: tao phuong thuc k co kieu du lieu tra ve (void), co tham so ()
    void dienTich() {
        double dt = dai * rong;
        System.out.println("Dien tich hinh chu nhat: " + dt);
    }

    double chuVi() {
        return (dai + rong) * 2;

    }
    //tao contructor co 2 tham so
    ChuNhat(double d, double r) {
        dai = d;
        rong =r;
    }
}

public class HinhChuNhat {
    public static void main(String[] args) {
        ChuNhat ob = new ChuNhat(5,10);

        ob.dienTich();
        double a = ob.chuVi();
        System.out.println("chu vi: "+a);


    }
}

