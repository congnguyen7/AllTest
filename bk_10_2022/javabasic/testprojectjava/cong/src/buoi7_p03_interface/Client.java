package buoi7_p03_interface;
//trien khai interface
public class Client implements Callback{
    public void callme(){
        System.out.println("This is method Callme()");
    }
    public void callyou(){
        System.out.println("This is method Callyou()");
    }
    //add method()

    public void show() {
        System.out.println("show concrete method");
    }
}
