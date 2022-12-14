package buoi8_exceptions.testThrow;

public class Hello {


    public static void Chia2So(int a, int b) throws MyExceptions{
        try {
            int kq = a/b;
            System.out.println(kq);
        }catch (Exception e) {
            throw new MyExceptions("Loi chia cho khong");
        }
    }

    public static void main(String[] args){

        try {
            Chia2So(2,0);
        }catch (MyExceptions e) {
            System.out.println(e.getError());

        }


    }
}
