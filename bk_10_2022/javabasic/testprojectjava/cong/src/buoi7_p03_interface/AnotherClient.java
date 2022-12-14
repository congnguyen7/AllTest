package buoi7_p03_interface;

public class AnotherClient implements Callback{
    public void callback(int p) {
        System.out.println("another version of callback");
        System.out.println("p squared is "+(p*p));
    }

    @Override
    public void callme() {

    }

    @Override
    public void callyou() {

    }

    @Override
    public void show() {

    }
}
