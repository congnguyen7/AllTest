package stream.intermediateoperations;


import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {

        Collection<String> collection = Arrays.asList("aa" , "ba", "bbb", "abb","1", "aa", "bb");
        Stream<String> stream1 = collection.stream();

        //filter
        stream1.filter(x -> x.contains("a"))
                .forEach(x -> System.out.print(x+" "));

        System.out.println();
        //map
//        Stream<String> stream2 = collection.stream();
//        stream2.map(x -> x + "c")
//                .forEach(x -> System.out.println(x+" "));
//
//        System.out.println();
//
//        //distinct
//        Stream<String> stream3 = collection.stream();
//        stream3.distinct().forEach(x -> System.out.println(x+" "));
//
//        System.out.println();
//        List<Integer> numbers = Arrays.asList(2,3,2,5,6);
        //limit
        collection.stream().limit(collection.size())
                .forEach(x -> System.out.print(x+" "));

        System.out.println();
//
//        //flatmap : sanphang, lamphang, gonlai
//        //kết hợp giữa bản đồ và thao tác phẳng
//        List<Integer> s1 = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> s2 = Arrays.asList(6, 7, 8, 9, 10);
//
//        System.out.println(s1 +" "+ s2);

////flatmap
    }
}