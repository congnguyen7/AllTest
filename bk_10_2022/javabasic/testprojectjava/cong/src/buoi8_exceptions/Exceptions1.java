/*
try {
code error
}
catch{
message
}
//code run ck

* */
package buoi8_exceptions;

public class Exceptions1 {
    public static void main(String[] args) {

        int [] mangA = {1,2,3};
        int a = 10;
        int b = 0;

        try {
            System.out.println(mangA[8]); //Array
            double c = a / b;   //Arithmetic

//            class Exception // Class cha, bắt toàn bộ mọi ngoại lệ
//        } catch (Exception e) {  //catch error divine error // lưu ý các lớp ngoại lệ
//            System.out.println("Loi chung nhat");
//            System.out.println(e.getMessage());
//
//        }

        } catch (ArrayIndexOutOfBoundsException e) {  //catch error divine error // lưu ý các lớp ngoại lệ
            System.out.println("Truy cap vuot pham vi cua mang");
//            System.out.println(e.getMessage());


        } catch (ArithmeticException e) {
            System.out.println("Loi chi cho 0");
        }

//        tất cả các lệnh được thực thi
        finally { //nhung lenh quan trong bat buoc phai thuc thi, nam trong khoi finally
            System.out.println("statement1");
            int h=3+2;
            System.out.println(h);

        }


    }
}
