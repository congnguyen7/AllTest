package buoi9_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class TestArraylist {

    public static void main(String[] args) {
        //tao 1 arraylist
        //cu phap:
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        //add elements to an Arraylist
        //cuphap:
        a1.add("phantudautien");
        a1.add("vku");

        //add phan tu dau tien
        a1.add(0,"them phan tu vao arl dau tien");

        //thay doi du lieu trong arraylist
        //cuphap:
        a1.set(0,"phantudaukhidathaydoi");

        //xoa phan tu
//        String test = a1.remove(1);
        //xoa het phan tu
//        a1.removeAll(a1);
        //hoac
//        a1.clear();
        //in arraylist
//        System.out.println("so phan tu trong mang: " +a1.size());
//        System.out.println(a1);
//        //for
//        System.out.println("-------for thuong-------");
//        for (int i=0;i<a1.size();i++) {
//            System.out.println(a1.get(i));
//        }
//        //foreach
//        System.out.println("-----foreach-------");
//        for (String j:a1) {
//            System.out.println(j);
//        }

        int aa[] = new int[11];
        aa[1]= 1;
        aa[3]= 1;
        aa[2]= 2;
        aa[4]= 3;
//        for (int i: aa) {
//            System.out.println(i);
//        }




//        int a [] = {1,2,3,4,5};
//        a[2]= 3;
//        System.out.println(a[1]);


//
//        ArrayList aa = new ArrayList(); //tu test
//        aa.add(1);
//        aa.add("ssss");
//        System.out.println(aa);

    }
}
