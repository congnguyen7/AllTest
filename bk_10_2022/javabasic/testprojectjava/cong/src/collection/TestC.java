package collection;

import java.util.Deque;
import java.util.LinkedList;

public class TestC {
    public static void main(String[] args) {


        LinkedList <String> animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

//        animals.add(3,"Horse");
//        animals.set(0, "Cat0");

        System.out.println("LinkedList: " + animals);

        String str = animals.get(1);
        System.out.println(str);

//        String str1 = animals.remove(1);
//        System.out.println("Removed Element: " + str1);
//        System.out.println("New LinkedList: " + animals);

//        animals.clear();
//        System.out.println("New LinkedList: " + animals);


//        Deque<String> animals1 = new LinkedList<>();

//        animals1.addFirst("Cow");
//        animals1.addFirst("Dog");
//        animals1.addFirst("Cat");
//        animals1.addLast("Horse");
//        System.out.println("LinkedList 1: " + animals1);

//        String animals2 = animals1.getFirst();
//        System.out.println("First Element: " + animals2);
//        String animals3 = animals1.getLast();
//        System.out.println("Last Element: " + animals3);

//        String animals4 = animals1.removeFirst();
//        System.out.println("Removed Element: " + animals4);
//        System.out.println("LinkedList 1: " + animals1);



    }
}
