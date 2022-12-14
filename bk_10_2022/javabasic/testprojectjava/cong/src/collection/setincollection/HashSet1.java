package collection.setincollection;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(6);
        hashSet.add(1);
        hashSet.add(0);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(1);
        System.out.println("s:"+hashSet);
        for (int i:hashSet) {
            System.out.println(i);
        }
    }
}
