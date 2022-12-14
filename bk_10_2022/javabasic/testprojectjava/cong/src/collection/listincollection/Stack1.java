package collection.listincollection;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        //instantiate ArrayList

        Stack<String> stack = new Stack<>();
        stack.add("One");
        stack.add("Twoo");
        stack.add("Three");
        stack.add("Four");
        stack.add(0, "Zero");
        stack.set(1, "Two");

//        Iterator <String> iterator = stack.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        for (String i:stack) {
            System.out.println(i);
        }
        System.out.println(stack.get(0));

    }
}
