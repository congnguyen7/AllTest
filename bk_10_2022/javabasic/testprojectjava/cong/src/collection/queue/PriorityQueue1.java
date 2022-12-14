package collection.queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {

        //instantiate ArrayList
        PriorityQueue<Integer> priQueue = new PriorityQueue<>();

        //add elements to an Arraylist
        priQueue.add(1);
        priQueue.add(11);
        priQueue.add(3);
        priQueue.add(5);

        System.out.println(priQueue);
        //Truy xuất một phần tử từ đầu hàng đợi
//        System.out.println(priQueue.peek());

        //Lấy ra và loại bỏ phần tử đầu tiên trong queue,
        // hoặc trả về null nếu hàng đợi không có phần tử nào.
        System.out.println(priQueue.poll());

        //Lấy ra nhưng không loại bỏ phần tử đứng đầu của hàng đợi.
        // Phương thức này chỉ khác với peek() là nó ném ra ngoại lệ nếu hàng đợi không có phần tử.
//        System.out.println(priQueue.element());
        System.out.println(priQueue);

        //Khi phần tử này được truy xuất, phần tử nhỏ nhất tiếp theo
        // sẽ là phần đầu của hàng đợi.
    }
}
