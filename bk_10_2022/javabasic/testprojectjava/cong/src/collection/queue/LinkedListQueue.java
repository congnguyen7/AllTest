package collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {

        //instantiate LinkedList Queue
        Queue<String> queue = new ArrayDeque<>(4);
        // add(E): Thêm phần tử vào hàng đợi.
        // Với hàng đợi LinkedList phần tử sẽ thêm vào cuối hàng đợi.
        // Trả về true nếu thêm thành công
        // Ném ra ngoại lệ nếu hàng đợi không còn chỗ.
        queue.offer("Zero");
        queue.offer("One");
        queue.offer("Two");
        // add(E): Thêm phần tử vào hàng đợi.
        // Với hàng đợi LinkedList phần tử sẽ thêm vào cuối hàng đợi.
        // Trả về true nếu thêm thành công
        // Ném ra ngoại lệ nếu hàng đợi không còn chỗ.
        queue.add("Three");
        queue.add("Four");

        System.out.println(queue);
        //Truy xuất một phần tử từ đầu hàng đợi
        System.out.println(queue.peek());
        //Lấy ra và loại bỏ phần tử đầu tiên trong queue,
        // hoặc trả về null nếu hàng đợi không có phần tử nào.
        System.out.println(queue.poll());
        //Lấy ra nhưng không loại bỏ phần tử đứng đầu của hàng đợi.
        // Phương thức này chỉ khác với peek() là nó ném ra ngoại lệ nếu hàng đợi không có phần tử.
//        System.out.println(queue.element());
        System.out.println(queue);





    }
}
