import java.util.Scanner;

public class InTongSoChanLonHon2 {
    public static void main(String[] args) {
        int N,sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap N = ");
        N = scanner.nextInt();
        for (int i=1;i<N;i++)
            if (i%2==0)
                sum+=i;
        System.out.println("Sum = " + sum);
    }
}
