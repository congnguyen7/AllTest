package buoi7_2package;
//cung package quan he cha con
//same package subclass

public class Drived extends Protection { //lớp dẫn xuất
    Drived(){
        System.out.println("Drived constructor");
        System.out.println("n = " +n);
//        System.out.println("n_private = "+ n_pri); //private
        System.out.println("n_protected = "+ n_pro);
        System.out.println("n_public = "+ n_pub);
    }
}
