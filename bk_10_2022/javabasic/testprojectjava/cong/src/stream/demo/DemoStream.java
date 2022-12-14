package stream.demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoStream {
    public static void main(String[] args) {
        //tao ds tu 1 tap hop cac pt truyen vao. có thể thay đổi
        List<Integer> list = Arrays.asList(2,3,4,5,7,8,9);
        double a = list.stream().filter(i->i%2==0).peek(System.out::println)
                .map(n->Math.sqrt(n)).mapToDouble(d->d).average().getAsDouble();
        System.out.println("a: "+a);

    }
}
//stream() : tao ra mot luong stream với mỗi phần tử là Interger
//filter() : thực hiện lọc vs đk i%2
//peek() : lấy phần tử đầu tiên và hiển thị ra
//map : ánh xạ với mỗi phần tử trong stream, tính căn bậc 2 của mỗi phần tử -> trả về 1 stream
//mapToDouble : lấy nguyên gt mỗi pt và chuyển các phần tử thành kiểu double
//average: tính tb các pt trong stream
//getAsDouble : lấy gt gán vào biến a