package buoi10_bt;

public class MainTest {
    public static void main(String[] args) {
        ClassMethod.DeToBi(8);

        ClassMethod classMethod = new ClassMethod();
        System.out.println("chuyen 10 sang 2: "+classMethod.BitoDe(1001));
        System.out.println(classMethod.checkPrime(12));
        System.out.println(classMethod.DetoMe(133));
//        System.out.println(classMethod.checkPerfect(12));
//        System.out.println("list perpect");
//        for (classMethod.checkPerfect(i)==true) {
//            if (classMethod.checkPerfect(i==true)) {
//                System.out.println(i);
//            }
//        }
        System.out.println("list prime");
        for (int i =1; i<5;i++) {
            System.out.println(i);
        }
    }
}
