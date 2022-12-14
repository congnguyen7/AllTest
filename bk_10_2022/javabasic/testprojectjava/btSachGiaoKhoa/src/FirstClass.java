/*
Viet chuong trinh tao mot lop co ten la Firstclass, co mot thuoc tinh co ten la msg va 2 phuong thuc co ten gitMsg
va setMsg lan luot lay va thiet lap noi dung thuoc tinh msg
 */
public class FirstClass {
    /*Khai bao thuoc tinh msg cua lop*/
    private String msg;
    public FirstClass(String str) {
        /*khoi tao gia tri cho thuoc tinh*/
        msg = str;
    }
    /* thiet lap gia tri cho thuoc tinh*/
    public void setMsg(String s) {
        msg = s;
    }

    /*lay gia tri cua thuoc tinh*/
    public String getMsg() {
        return msg;
    }

    public static void main(String[] args) {
        /*tao doi tuong cua lop Firstclass*/
        FirstClass f = new FirstClass("Hello");
        /* goi ham msg de lay gia tri cua Msg */
        String msg = f.getMsg();
        System.out.println(msg);
        /*thay doi noi dung cua thuoc tinh Msg*/
        msg = msg + "Java";
        f.setMsg(msg);
        System.out.println(f.getMsg());

    }

}
