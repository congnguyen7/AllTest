package collection.setincollection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(0);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(1);

        Iterator i = treeSet.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
