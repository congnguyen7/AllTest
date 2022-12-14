package buoi7_2package;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Drived constructor");
        System.out.println("n = " +p.n);

//        System.out.println("n_private = "+ p.n_pri); //private
        System.out.println("n_protected = "+ p.n_pro);
        System.out.println("n_public = "+ p.n_pub);
    }
}
