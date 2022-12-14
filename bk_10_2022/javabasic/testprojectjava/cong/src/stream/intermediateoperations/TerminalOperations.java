package stream.intermediateoperations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {


        Collection<String> collection = Arrays.asList("aa" , "ba", "bbb", "abb","caa", "aa", "bb");
        Stream<String> stream1 = collection.stream();

        //forEach :duyettatcacacphantu
        collection.forEach(x -> System.out.print(x+" "));
        System.out.println();

        //Convert 1 Stream sang Array.
        String[] intArray = stream1.toArray(String[]::new);
        System.out.println(Arrays.toString(intArray));

        //count
        //Trả về số lượng phần tử
        int count = (int) collection.stream().count();
        System.out.println(count);

        Stream<Integer> streamOfArray = Stream.of(1, 2 , 3, 4);

        Integer result  = streamOfArray.reduce((a, b) -> a + b)
                .get();

        System.out.print(result);
    }
}
