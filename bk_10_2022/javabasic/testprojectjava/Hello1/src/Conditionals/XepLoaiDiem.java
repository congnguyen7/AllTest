package Conditionals;

import java.util.Scanner;

public class XepLoaiDiem {
    public static void main(String[] args) {

        String xepLoai = "Xep loai cua ban la: ";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem cua ban: ");
        int diem = scanner.nextInt();
        if (diem >= 0 && diem <=3) {
            System.out.println(xepLoai + "kem");
        } else if (diem >3 && diem <5) {
            System.out.println(xepLoai + "yeu");
        } else if (diem >=5 && diem <=7) {
            System.out.println(xepLoai + "trung binh");
        } else if (diem >7 && diem <=8) {
            System.out.println(xepLoai + "kha");
        } else if (diem >=9 && diem <=10)  {
            System.out.println(xepLoai + "xuat sac");
        }else
            System.out.println(diem + " diem ma ban da nhap khong chinh xac");
    }
}
