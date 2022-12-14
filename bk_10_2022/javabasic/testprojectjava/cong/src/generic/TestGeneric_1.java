package generic;

import java.util.ArrayList;

public class TestGeneric_1 {

    public static void main(String args[]) {
        //non generic //su dung colection ArrayList voi nhieu kieu du lieu khac nhau
        ArrayList myArray = new ArrayList();
        myArray.add(1);
        myArray.add("Hello");
        myArray.add(true);
//        System.out.println(myArray);
//        for (int i = 0; i<myArray.size();i++){
//            System.out.print(myArray.get(i)+" ");
//        }
        //khi lay phan tu trong mang ra
        int number = (int) myArray.get(0);
        String str = (String) myArray.get(1);
        System.out.println(number+1);
        System.out.println(str);

        //generic //su dung arraylist voi kieu du lieu Interger

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);

        //1. giup phap hien loi ngay thoi diem bien dich
        //arrayList1.add("a"); error

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("chuoi");

        //2. Khong can ep kieu
        int number1 = arrayList1.get(0);

        System.out.println(number1+1);
        System.out.println(arrayList2.get(0));

    }
}