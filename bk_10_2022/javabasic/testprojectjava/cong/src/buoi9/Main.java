package buoi9;

public class Main {
    public static void main(String[] args) {
        ClassC classB = new ClassC();
        classB.m1(2,3);
        classB.m2();
        System.out.println("m3: "+ classB.m3());
        System.out.println("m4: Tich: "+ classB.m4(1.3, 3.2));
        classB.show();

        classB.m6(2,3,4);
        classB.m9();

        classB.m10();
    }
}
