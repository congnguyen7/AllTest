package collection.setincollection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(1);
        linkedHashSet.add(0);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        System.out.println(linkedHashSet.contains(1));
    }
}
