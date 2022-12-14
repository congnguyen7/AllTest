/*
package ExceptionDemo;


public class EmailAddressException extends Exception{
    //dinh nghia ham khoi tao
    EmailAddressException(String str) {
        //Goi ham khoi tao cua lop Exception
        super(str);
    }

}
//tao lop kiem tra dia chi email
public class EmailCheck {
    /*ham kiem tra gia tri email. Gia su quy tac kiem tra don gian nhu sau:
    1. Dia chi email chi chua duy nhat mot ki tu @
    2. Ki tu @ khong the o vi tri dau tien
    */
/*
    public static void check(String str) throws EmailAddressException {
        //kiem tra chuoi co chua @
        int place = str.indexOf('@');
        // neu khong chua @
        if (place==-1) {
            // nem ra mot doi tuong EmailAddressException
            throw new EmailAddressException("Khong hop le do khong chua '@'");
            //neu ki tu dau tien khong chua @
        if (place ==0) {
            throw new EmailAddressException("Khong hop le do '@' o vi tri dau tien");
        }

        }
    }
}
*/

