package collection.listincollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {

        //instantiate ArrayList
        ArrayList<String> listStr = new ArrayList<>();
        ArrayList<String> listStr1 = new ArrayList<>();

        //add elements to an listStr
        listStr.add("One");
        listStr.add("Twoo");
        listStr.add("Three");
        listStr.add(0, "Zero");

        //add elements to an listStr1
// thêm các phần tử listStr
        listStr1.add("So0");
        listStr1.add("So1");
        listStr1.add("So2");

        //
//        for (int i=0;i<listStr.size();i++){
//            System.out.println(listStr.get(i));
//        }
        //in phan tu thu
//        System.out.println(listStr.get(1));

//        su dung foreach
        for (String i:listStr) {
            System.out.println(i);
        }

        //addAll để thêm tất cả các phần tử của một List vào cuối List đã tồn tại
        listStr.addAll(listStr1);


        System.out.println("mang sau khi sd addAll()");
        for (String i : listStr) {
            System.out.println(i);
        }

        //xoa phan tu
        listStr.remove(0);
//        System.out.println("so phan tu cua listStr:" +listStr.size());
//        for (int ii =0; ii <= 2;ii++){
//            listStr.remove(ii);
//        }
        System.out.println("mang sau khi xoa pt");
        //Traversing list through Iterator :duyetds sudung Trinhlap
        Iterator i = listStr.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("Kiem tra phan tu co trong ds");
        if (listStr.contains("One")) {
            System.out.println("\tPhan tu co trong ds");
        }else {
            System.out.println("Phan tu khong co trong ds");
        }
        //in ra vi tri phan tu/ neu k tra ve -1
        System.out.println(listStr.indexOf("Onse"));
        System.out.println(listStr.lastIndexOf("So2"));
//
        System.out.println(listStr.get(0));
//        System.out.println(listStr);
//        System.out.println(listStr);
//        System.out.println(listStr1);
//        Collections.copy(listStr,listStr1);
//        System.out.println(listStr);
//        System.out.println(listStr1);

    }
}
