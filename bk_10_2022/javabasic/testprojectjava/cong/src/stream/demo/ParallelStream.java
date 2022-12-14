package stream.demo;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(2);
        ints.add(1);
        ints.add(6);
        ints.add(5);
        Integer total = ints.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println(total);
    }
}
