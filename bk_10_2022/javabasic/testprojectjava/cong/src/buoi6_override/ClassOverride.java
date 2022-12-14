package buoi6_override;

public class ClassOverride {
    int i,j;
    ClassOverride(String s) {
        System.out.println(s);
    }

    ClassOverride(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println(i+ " and " +j);
    }
}

class SubClass extends ClassOverride {

    int k;

    SubClass(int a, int b, int c) {

        super(a, b);
        k=c;
    }
    void show(String s) { //singnature //dòng nguyên mẫu
        System.out.println(s + k);
    }

//    void show() { //singnature //dòng nguyên mẫu
//        super.show(); //goi lop cha
//        System.out.println("k is "+ k);
//    }



}