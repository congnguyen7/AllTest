import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
//        int [] A = {2,4,7,1,5};
//        Arrays.sort(A); //hoac su dung ham sort
//        for (int i=0;i<A.length-1;i++)
//            for (int j=i+1;j<A.length;j++)
//                if (A[i]>A[j]) {
//                    int tg = A[i];
//                    A[i] = A[j];
//                    A[j] = tg;
//                }
//        for (int i=0;i<A.length;i++){
//            System.out.print(A[i]+"\n");
//        }

        int N;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so phan tu cua mang: ");
            N = scanner.nextInt();
        }
        while (N<0);
        //khoi tao va cap phat bo nho cho mang
        int [] A = new int[N];
        System.out.println("Nhap cac phan tu cho mang: ");
        for (int i=0;i<N;i++) {
            System.out.println("Phan tu thu " +i+ ": ");
            A[i] = scanner.nextInt();
        }
        System.out.print("Mang vua nhap vao: ");
        for (int i=0;i<N;i++) {
            System.out.print(A[i]+" ");
        }
        Arrays.sort(A);
        System.out.print("\nMang sau khi da sap xep la: ");
        for (int i=0;i<N;i++) {
            System.out.print(A[i]+" ");
        }

    }
}
