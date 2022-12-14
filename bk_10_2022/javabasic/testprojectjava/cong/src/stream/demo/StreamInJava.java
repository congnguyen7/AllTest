package stream.demo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamInJava {
//    public static Stream<String> stringStream(List<String> list) {
//        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
//    }

    public static void main(String[] args) {

        //Stream empty
        Stream<String> streamEmpty = Stream.empty();

        //Stream từ Collection :Stream có thể được tạo từ bất kì loại Collection nào (Collection, List, Set)
        Collection<String> collection = Arrays.asList("a","b","c");
        Stream<String> streamCollection = collection.stream();

        //Stream từ Array: Array có thể là một source của Stream
        List<String> stringList = Arrays.asList("aa","ba","ca");

        //Stream cũng có thể được tạo từ một array có sẵn hoặc một phần của Array
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

        //Stream.builder()
        //Phương thức builder() tạo ra một builder của Stream.

        //Sử dụng Stream builder()
        Stream.Builder<String> builder = Stream.builder();

        // Thêm một element vào trong stream
        Stream<String> stream = builder.add("Bean").build();

        // Xuất thông tin ra màn hình
        stream.forEach(System.out::println);

        //Stream.generate()

    }
}
