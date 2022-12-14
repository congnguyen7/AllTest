package collection.listincollection;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {

        //instantiate LinkedList
        LinkedList <String> linkedList = new LinkedList<>();

        //add elements to an LinkedList
        linkedList.add("One");
        linkedList.add("Twoo");
        linkedList.add("Three");
        linkedList.add("Four");
        linkedList.add(0,"Zero");
        linkedList.set(1,"Two");

        for (String i:linkedList) {
            System.out.println(i);
        }
    }
}
