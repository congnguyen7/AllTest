//public class DemoRecurssion2 {
//
//    //tao class
//    class RecTest {
//        int values[];
//        //tao constructor co 1 tham so
//        RecTest(int i) {
//            values = new int[i]; // khoi tao 1 mang i phan tu gan vao bien value
//        }
//        // tao 1 method hien thi mang ra man hinh
//        void display(int i) {
//            if(i==0)
//                return;
//            else
//                display(i-1);
//            System.out.println(values[i-1]+ "");
//        }
//
//    }
//
//    public static void main(String[] args) {
//        RecTest ob1 = new RecTest(10);
//        for(int k=0;k<10;k++) {
//            ob1.display(10);
//        }
//
//
//    }
//
//}