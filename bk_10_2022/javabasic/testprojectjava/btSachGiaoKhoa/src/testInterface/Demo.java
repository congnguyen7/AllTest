package testInterface;

public class Demo implements myinterface {

    public void add(int x, int y) {
        System.out.println(" " +(x+y));
        //gia su phuong thuc add duoc khai bao trong giao dien
    }

    public void volume(int x, int y, int z) {
        System.out.println(" " +(x*y*z));
        //gia su phuong thuc volume duoc khai bao
        // trong giao dien
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.add(10,20);
        d.volume(10,10,10);
    }
}
