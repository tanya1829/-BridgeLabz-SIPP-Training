package JavaGenerics.Collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    
 public static <T> void reverse(Queue<T> queue) {
        if (queue.isEmpty()) return;
        T item = queue.remove();
        reverse(queue);
        queue.add(item);
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        reverse(queue);
        System.out.println("Reversed Queue: " + queue);
    }
} 
