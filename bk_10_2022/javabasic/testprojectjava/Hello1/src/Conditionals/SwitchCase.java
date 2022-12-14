package Conditionals;


import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi n: ");
        String n = scanner.nextLine();
        switch (n) {
            case "cong 1":
                System.out.println("Value is 1");
                break;
            case "cong1":
                System.out.println("Value is 2");
                break;
            case "cong2":
                System.out.println("Value is 3");
                break;
            default:
                System.out.println("Ban da nhap sai");

        }
    }
}

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap chuoi can so sanh: ");
//        String chuoi = scanner.next();
//
//
////        String chuoi;
////        chuoi = "cong";
//        if (chuoi == "cong") {
//            System.out.println("day la ten");
//        } else if (chuoi == "22") {
//            System.out.println( " day la tuoi");
//        } else if (chuoi == "18CE") {
//            System.out.println( "day la lop");
//        }else
//            System.out.println("ban da nhap sai");
//
//
//
//    }
//}
