package buoi9_baitap;

public class Main {
    public static void main(String[] args) {
        Class1 a1 = new Class1();
        System.out.println("Phep cong: "+ (a1.tinh(10,4)));

        Class2 a2 = new Class2();
        System.out.println("Phep tru: "+ (a2.tinh(10,4)));

        Class3 a3 = new Class3();
        System.out.println("Phep tru: "+ (a3.tinh(10,4)));

        //goi thang qua lop khong can tao doi tuong.
        //khac lop nen can thong qua lop
        //cung lop thi k can
        System.out.println("Phep chia: " +Class4.tinh(10,5));

        System.out.println("Giai thua = "+ Class1.giaiThua(5));

        Class1.toBinary(8);
    }
}
