package methodinjava;

public class TestMethod {

    //user-defined method
    public static int add() {
        int a =2,b = 3;
        int sum = a+b;
        return sum;
    }
    static double db = 1.22;
    int sum1 = 0;

    public int addTwoInt(int i, int j) {
        sum1 = i+j;
        return sum1;
    }


    public static void main(String[] args) {

        int sum = TestMethod.add();
        System.out.println("Sum a and b is: " + sum);

        TestMethod addTI = new TestMethod();
        int s = addTI.addTwoInt(3,6);
        System.out.println("Sum i and j is: "+ s);

        System.out.println("The maximum number is: " + Math.max(1,7));
        System.out.println("using Static "+ db);

    }
}
