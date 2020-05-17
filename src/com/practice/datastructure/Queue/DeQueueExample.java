package com.practice.datastructure.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueExample {
    public static void main(String[] args) {
        Deque<Integer> numbers=new ArrayDeque<>();
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerLast(3);
        System.out.println("Dequeu:-  "+numbers);
        // Access elements of the Deque
        int firstElement = numbers.peekFirst();
        System.out.println("First Element: " + firstElement);

        int lastElement = numbers.peekLast();
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the Deque
        int removedNumber1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + removedNumber1);

        int removedNumber2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + removedNumber2);

        System.out.println("Updated Deque: " + numbers);


    }
}
