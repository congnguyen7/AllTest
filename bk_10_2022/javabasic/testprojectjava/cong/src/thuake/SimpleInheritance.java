package thuake;
//create superclass (lop cha)
class A {
    public int k;
    int i,j;
    //viet phuong thuc
    void showij() {
        System.out.println(i+ " and "+ j);
    }
}

//create subclass bt extends class A
class B extends A {
    int k;
    // viet phuong thuc showk
    void showk() {
        System.out.println("value k is: " +k);

    }
    void tong() {
        System.out.println("tong i,j,k la: " +(i+j+k));
    }
}
class   C extends B {
    int l;
    void tich() {
        System.out.println("tich cua i,j,k,l: " + (i*j*k*l));
    }

}
//class B1 extends A {
//    int b1;
//    void showB1() {
//        System.out.println("Show " + b1 + " va " +k);
//    }
//}

public class SimpleInheritance {
    public static void main(String[] args) {

        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("In cac gia tri");

        superOb.showij();
        subOb.i=2;
        subOb.j=3;
        subOb.k=4;
        System.out.println("check subclass B has access to method");
        //check subclass B has access to all method?

        subOb.showij();
        subOb.showk();
        subOb.tong();

        //-----------
        C subObC = new C();
        subObC.i =2;
        subObC.j =2;
        subObC.k =2;

        subObC.l =2;

        subObC.tich();
        //------------
        B1 subOB1 = new B1();
        subOB1.b1 = 100;
        subOB1.k = 111;

        subOB1.showB1();
    }
}
