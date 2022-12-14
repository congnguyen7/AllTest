package collection.listincollection;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        //instantiate Vector
        Vector<String> vector = new Vector<>();

        //add elements to an Vector
        vector.add("One");
        vector.add("Twoo");
        vector.add("Three");
        vector.add("Four");
        vector.add(0,"Zero");
        vector.set(1,"Two");

        for (String i:vector) {
            System.out.println(i);
        }


    }
}
