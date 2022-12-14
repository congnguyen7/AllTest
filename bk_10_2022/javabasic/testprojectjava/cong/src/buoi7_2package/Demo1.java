package buoi7_2package;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("call construction Protection");
        Protection ob1 = new Protection();
        System.out.println("====================");
        System.out.println("call construction Drived");
        Drived ob2 = new Drived();
        System.out.println("====================");
        System.out.println("call construction SamePackage");

        SamePackage ob3 = new SamePackage();
    }
}
