package QLSV;

import loop.SwitchDemo;

import java.util.Scanner;
import java.util.Vector;
/*
public class StudentManagement {
    //dung de chua danh sach sinh vien
    Vector list = new Vector();
    public StudentManagement() {
        while (true) {
            //hien thi menu chuong trinh
            System.out.println("*- CHUONG TRINH QUAN LY SINH VIEN -*");
            System.out.println("*-Chuc nang chinh cua chuong trinh-*");
            System.out.println(" 1. Nhap danh sach sinh vien");
            System.out.println(" 2. Xem danh sach sinh vien ");
            System.out.println(" 3. Sap xep danh sach sinh vien tang dan diem trung binh ");
            System.out.println(" 4. Tim sinh vien theo ten");
            System.out.println(" 5. Thoat ");
            System.out.println("------------------------------");
            //nhap so tu ban phim
            int num;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap so tu ban phim de chon chuc nang: ");
            num = scanner.nextInt();
            //kiem tra va goi chuc nang tuong ung

            switch (num) {
                case 1:
                    this.input();
                    break;
                case 2:
                    this.view();
                case 3:
                    this.sort();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.out.println("--- Chuong trinh ket thuc ---");
                return;
            }
        }
    }
    public void input() {
        //Nhap so luong sinh vien cho danh sach
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap so luong sinh vien:");
        num = scanner.nextInt();
        //Nhap thong tin cho moi sinh vien
        for (int i=1;i<+num;i++) {
            System.out.println(" Nhap thong tin cho sinh vien thu: "+i);
            System.out.println(" ID: ");
            int id = Integer.parseInt(scanner.next());
            scanner.nextLine(); //xoa bo dem
            System.out.println(" Ten: ");
            String name = scanner.nextLine();
            System.out.println(" Diem trung binh: ");
            float aver = scanner.nextFloat();
            //sau khi nhap thong tin, tao doi tuong sinh vien
            Student st = new Student(id,name,aver);
            //luu doi tuong vao danh sach
            list.add(st);
        }
}
    public static void main(String[] args) {
        new StudentManagement();
    }
}
*/