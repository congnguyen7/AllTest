package JavaCapToc;

import java.util.Scanner;

public class LearnJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ten: ");
        String s = scanner.nextLine();
        System.out.println(s.toUpperCase());

    }
    public static String addExc(String s) {
//        System.out.println(s.toUpperCase() + " ~!~ ");
        return s + " ~!~ ";
    }
}
