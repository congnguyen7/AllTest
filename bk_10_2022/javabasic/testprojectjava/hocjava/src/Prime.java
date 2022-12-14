public class Prime {
    public static void main(String[] args) {
        int n = 2;
        boolean ch = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                break;
        }

        if (ch == true) {
            System.out.println(n + " is prime");
        }else
            System.out.println(" is not prime");
    }
}
