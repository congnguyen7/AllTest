package buoi8_exceptions;

public class TestThrow {
    static void checkAge(int a) {
        if(a<18){
            throw new ArithmeticException("Ban chua du 18 tuoi ");   //ArithmeticException
        }else {
            System.out.println("Ban da du 18 tuoi ");
        }
    }

    public static void main(String[] args) {
        int age=2;

        checkAge(age);
    }
}
