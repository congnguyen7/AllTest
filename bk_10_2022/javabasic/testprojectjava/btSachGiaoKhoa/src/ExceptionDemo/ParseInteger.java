package ExceptionDemo;

import java.util.Scanner;

public class ParseInteger {
    public static void main(String[] args) {
        try {
            //nhap chuoi so nguyen tu ban phim
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap chuoi so nguyen: ");
            String str = scanner.nextLine();
            // chuyen chuoi sang so nguyen, neu chuoi khong dung dinh dang
            //ham ParseInteger se phat ra doi tuong biet le
            int num  = Integer.parseInt(str);
            // hien thi ket qua
            System.out.println(num);
        } catch (NumberFormatException e) {
            /* neu chuoi nhap vao khong dung dinh dang, ham parseInt khong chuyen duoc sang so nguyen
            thi mot duoi tuong loi NumberFormatException duoc phat ra va khoi catch bat lay va thuc hien
            */
            System.out.println("Chuoi nhap vao khong dung dinh dang");
        }
    }
}
