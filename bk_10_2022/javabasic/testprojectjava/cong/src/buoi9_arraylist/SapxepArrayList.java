package buoi9_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SapxepArrayList {

    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Other");
        a1.add("VKU2");
        a1.add("Da Nang");
        a1.add("VKU");

        //sapxep cach 1
        Collections.sort(a1);

        //cachkhac
//        a1.sort(Comparator.naturalOrder());

        //dao mang
        a1.sort(Comparator.reverseOrder());

        //clone
        //cu phap sao chep
        ArrayList<String> a2 = (ArrayList<String>) a1.clone();

        //ham tim kiem: //neu co thi true
        System.out.println(a1.contains("VKU2"));

        //kiem tra xem co rong khong: //khong rong la co chua phan tu
        System.out.println(a1.isEmpty());

        System.out.println("a1: "+ a1);
        System.out.println("---------");
        System.out.println("a2: "+ a2);


    }
}
