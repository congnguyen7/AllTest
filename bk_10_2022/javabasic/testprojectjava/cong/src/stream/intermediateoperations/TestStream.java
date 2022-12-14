package stream.intermediateoperations;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,3,2,5,6);
        //anh xa moi doi tuong voi dau ra tuong ung
        //phuong thuc collect (thuong dc su dung cuoi cung, trong stream), tra lai danh sach doi tuong cua steam
        List<Integer> squaresList = numbers.stream().map(i -> i+i).distinct().collect(Collectors.toList());

        System.out.println(squaresList);


        IntSummaryStatistics statistics = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("highest number in List: "+ statistics.getMax());
        System.out.println("lowest number in List: "+ statistics.getMin());

        //"-------------"
        // create a list of String
        List<String> names =
                Arrays.asList("Reflection","Collection","Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s->s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println(result);

//        List<String> name1 = Arrays.asList("Khanh", "Thanh", "Dung");
//        Stream<String> stream = name1.stream();

    }
}
