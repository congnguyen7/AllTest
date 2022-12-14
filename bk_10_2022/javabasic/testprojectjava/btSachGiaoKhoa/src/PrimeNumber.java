import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int N,i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        N = scanner.nextInt();
        for (i=2;i<=Math.round(Math.sqrt(N));i++)
        if (N%i==0) break;
        if (i <= Math.round(Math.sqrt(N)))
            System.out.println("N khong phai la so nguyen to ");
        else
            System.out.println("N la so nguyen to");
    }
}
