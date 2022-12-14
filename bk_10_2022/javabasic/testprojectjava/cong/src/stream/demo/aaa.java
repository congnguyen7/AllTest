package stream.demo;

import java.util.*;

public class aaa {
    public static void main(String[] args) {
            // creating an Empty Integer List
            List<Integer> arr = new ArrayList<Integer>();
        List<Integer> arr1 = new ArrayList<Integer>();

            // using add() to initialize values
            arr.add(5);
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
        System.out.println(arr);
//        Collections.sort(arr);
        System.out.println(arr);
//        Collections.sort(arr, Collections.reverseOrder());
        Collections.sort(arr, Collections.reverseOrder());

        System.out.println(arr);
            // use contains() to check if the element
            // 2 exits or not

        }
}
