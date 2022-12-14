package JavaCapToc.buoi4;


import java.util.Scanner;

public class TestNum {
    //declare method checkPrime(int n)
    boolean SoNguyenTo(int N) { //ham
        if (N <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N% i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    //...
    //bai tap ve nha
    //add method check perfect // them phuong thuc kiem tra so hoan thien

    public static void main(String[] args) {
        TestNum A = new TestNum();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int N = scanner.nextInt();
        for (int i=1; i<=N;i++) {
            if(A.SoNguyenTo(i)==true) {
                System.out.println(i);
            }
        }
    }
}
