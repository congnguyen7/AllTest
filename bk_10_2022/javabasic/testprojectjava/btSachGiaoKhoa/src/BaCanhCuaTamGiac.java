import java.util.Scanner;

public class BaCanhCuaTamGiac {
    public static void main(String[] args) {
        float a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextFloat();
        System.out.print("b = ");
        b = scanner.nextFloat();
        System.out.print("c = ");
        c = scanner.nextFloat();
        if(a+b>c && a+c>b && b+c>a && a>0 && b>0 && c>0) {
            System.out.print("a, b, c la ba canh cua ");
            if(a==b && b==c)
                System.out.println("tam giac deu");
            else if (a==b||a==c||b==c)
                System.out.println("tam giac can");
            else if ((a*a+b*b==c*c)&&(a==b)||(a*a+c*c==b*b)&(a==c)||(b*b+c*c==a*a)&&(b==c))
                System.out.println("tam giac vuong can");
            else if ((a*a==b*b+c*c)|| (b*b==a*a+c*c)||(c*c==a*a+c*c)){
                System.out.println("tam giac vuong");
            }
            else
                System.out.println("abc la tam giac thuong");
        }
        else
            System.out.println("3 canh cua tam giac khong hop le");
    }
}
