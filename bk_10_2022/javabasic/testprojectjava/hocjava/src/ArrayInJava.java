import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayInJava {

//    //7-19 co the luu tru kieu du lieu doi tuong
//    static class Student {
//        //thuoc tinh
//        private String name;
//        private int age;
//
//        //phuong thuc
//        public Student(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//        public String getName(){
//            return name;
//        }
//    }
//
    public static void main(String[] args) {
//        Student [] std = new Student[3];
//        std[0] = new Student("Cong", 12);
//        std[1] = new Student("Coaang", 13);
//        std[2] = new Student("Conaag", 14);
//
//
//        for (Student tsd1:std) {
//            System.out.println(tsd1.getName());
//        }

//
        int [] aaray = new int[5];
        aaray[1] =21;
        aaray[0] =211;
        aaray[3] =211;


        for (int j=0;j<aaray.length;j++) {
            System.out.println("Phan tu thu "+j+" : "+aaray[j]);
        }
//        for (int a:aaray) {
//            System.out.println(a);
//        }
        System.out.println("------------");
//        System.out.println("Phan tu thu nhat la: "+ aaray[0]);
//        System.out.println("So phan tu cua mang aaray la: "+ aaray.length);

//        List<Integer> aarrayList= new ArrayList<>(4);
//        aarrayList.add(22);
//
//          for (int i:aarrayList) {
//              System.out.println("Phan tu thu: "+i);
//          }
    //          String [] AB = new String[5];
          String [] AB = {"cong","cong1","cong222"};

          for (String ab: AB) {
              System.out.println(ab);
          }

          System.out.println("---------s-------");

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(1);
        arrayList1.add("coooooooon");
        arrayList1.add(1);



        System.out.println(arrayList1.size());
        for (int j=0;j<arrayList1.size();j++) {
            System.out.println("Phan tu thu "+j+" : "+arrayList1.get(j));
        }

        System.out.println(arrayList1.get(0));

//        System.out.println(arrayList1);
//        for ( arl :arrayList1) {
//            System.out.println(arl);
//        }

        ArrayList <String> arrayLS = new ArrayList<String>();
        arrayLS.add("abcd1");
        arrayLS.add("abcd2");
        arrayLS.add("abcd3");
        arrayLS.add("abcd4");
        arrayLS.add("abcd5");
        arrayLS.add("abcd6");


        System.out.println("--------------");
        System.out.println(arrayLS);
        System.out.println(arrayLS.get(1));
//        for (String a:arrayLS) {
//            System.out.println(a);
//        }

        arrayLS.remove(1);
        for (String a1:arrayLS) {
            System.out.println(a1);
        }



//        int[] intArray = new int[5];
//        intArray = new int[]{1,2,3,4,5};
//
//        System.out.println("In tung phan tu cua mang: ");
//        for(int i=0; i< intArray.length;i++) {
//            System.out.println("Phan tu thu "+ i + " cua mang la: "+ intArray[i]);
//        }
//        for (int i:intArray) {
//            System.out.print(i+ " ");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap so phan tu cua mang: ");
//        int num = scanner.nextInt();
//        int [] A = new int[num];
////        System.out.println("Nhap du lieu cho mang ");
//        for (int i=0;i<num;i++) {
//            System.out.println("Nhap phan tu thu " + i +": ");
//            A[i] = scanner.nextInt();
//        }
//
//        A[0]= 111;
//        for (int j=0; j<A.length;j++) {
//            System.out.println("Phan tu thu "+j+" la: "+A[j]);
//        }
//        System.out.println("Phan tu thu 0 la: "+ A[0]);


    }


}
