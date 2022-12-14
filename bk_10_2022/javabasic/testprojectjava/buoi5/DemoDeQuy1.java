public class DemoDeQuy1 {
    int fact(int n) {
        int kq;
        if (n==1)
            return 1;
        kq = fact(n-1)*n;
        return kq;
    }

    public static void main(String[] args) {
        DemoDeQuy1 ob = new DemoDeQuy1();
        System.out.println(ob.fact(3));
        for (int j = 1; j <10; j++)
            System.out.println(ob.fact(j)+" ");
//        ob.fact(3);
    }
}
