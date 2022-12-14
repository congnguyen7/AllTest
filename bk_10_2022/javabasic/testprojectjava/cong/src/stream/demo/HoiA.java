package stream.demo;

import java.util.ArrayList;
import java.util.List;

public class HoiA {

    public static void main(String[] args) {
        List<Integer> stringList = new ArrayList<>();
        stringList.add(0);
        stringList.add(2);
        stringList.add(3);
        stringList.add(1);

        System.out.println(stringList);

        for (int i:stringList) {
            System.out.println(i);
        }

        for (int j=0;j<stringList.size();j++){
            System.out.println(j);
        }

    }
}
