import java.util.Scanner;

public class doihe10sang2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can chuyen: ");
        int decimal = scanner.nextInt();
        int [] du = new int[10];
        int i=0;
        while (decimal>0) {
            du[i++] = decimal%2;
            decimal = decimal/2;

        }
        for (int j=i-1;j>=0;j--) {

            System.out.println(du[j]);
        }
    }
}
