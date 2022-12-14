import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Chuong trinh kiem tra so nguyen to ");
        System.out.print("Nhap N: ");
        int n = scanner.nextInt();
//        int n=10;
        int dem=0;

        if (n<=1) {
            System.out.println("Khong phai so nguyen to");
        }else {
            for(int i=2;i<=n/2;i++) {
                if(n%i==0) {
                    dem++;
                }
            }
            if(dem==0) {
                System.out.println("La so nguyen to");
            }else {
                System.out.println("Khong phai so nguyen to");
            }
        }
    }
}