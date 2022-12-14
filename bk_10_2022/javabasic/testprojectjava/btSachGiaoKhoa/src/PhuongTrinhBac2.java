import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        float a,b,c,del,x1,x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        a = scanner.nextFloat();
        System.out.println("b = ");
        b = scanner.nextFloat();
        System.out.println("c = ");
        c = scanner.nextFloat();
        if(a==0)
            if(b==0)
                if(c==0)
                    System.out.println("Phuong trinh co vo so nghiem");
                else
                    System.out.println("Phuong trinh vo nghiem");
            else
                System.out.println("Phuong trinh co nghiem la: " + (-c/b));

        else {
            del = b*b-4*a*c;
            if (del<0)
                System.out.println("Phuong trinh vo nghiem");
            else if (del==0) {
                x1 = x2 = -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep =" + x1);
            }
            else {
                x1 = (float) (-b + Math.sqrt(del)) / (2 * a);
                x2 = (float) (-b - Math.sqrt(del)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem la:\n x1=" + x1 + "\n x2=" + x2);
            }
        }
    }
}
