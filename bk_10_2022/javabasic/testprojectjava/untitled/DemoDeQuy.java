public class DemoDeQuy {
    int fact(int n) {
        int kq;
        if (n==1)
            return 1;
        kq = fact(n-1)*n;
        return kq;
    }

    public static void main(String[] args) {
        DemoDeQuy ob = new DemoDeQuy();
        ob.fact(3)
    }
}
