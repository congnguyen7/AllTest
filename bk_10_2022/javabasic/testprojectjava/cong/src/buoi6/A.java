package buoi6;

public class A {
    int i;
}

class B extends A {
    int i; // cai i nay se an trong A
    B(int a, int b) {
        super.i = a; // i in A
        i = b; // i in B
    }
    void show() {
        System.out.println("i in superclass is: " + super.i);
        System.out.println("i in subclass is: " + i);
    }

}
