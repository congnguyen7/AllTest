import java.util.Scanner;

public class doihe2sanghe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can chuyen: ");
        int bi = scanner.nextInt();
//        int bi = 1010;
        int decimal = 0;
        int mu=0;
        while (bi>0) {
            int t = bi%10;
            decimal = (int) (decimal + t*Math.pow(2,mu));
            bi=bi/10; //dieukienthoatvonglap
            mu++;
        }
        System.out.println(decimal);
    }
}
