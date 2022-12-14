package buoi7_p03_interface;

public class TestInterface {
    public static void main(String[] args) {
        Client ob = new Client();
        ob.callme();
        ob.callyou();
        ob.show();   //((Client) ob).show();
    }
}
