package buoi9_baitap;

import java.util.ArrayList;
import java.util.Comparator;

public class Class1 {

    public int tinh(int a, int b) {
        return a+b;
    }

    //tao pt tinh n! bang dequy
    public static double giaiThua(int n) {
        if(n<=1)
            return 1;
        else
            return giaiThua(n-1)*n;
    }

    //tao phuong thuc doi tu he 10 sang he 2
    public static void toBinary(int n) {
        ArrayList<Integer> a1 = new ArrayList<>();
        int index=0;
        while (n>0) {
            a1.add(n%2);
            n=n/2;
        }
        a1.sort(Comparator.reverseOrder());

//        System.out.println(a1);
        //su dung for cai tien
        System.out.print("toBinary: ");
        for (int j: a1) {
            System.out.print(j);
        }
    }
}
