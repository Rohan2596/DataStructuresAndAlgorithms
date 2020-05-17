package com.practice.datastructure.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> numbers=new PriorityQueue<>();
        numbers.add(2);
        numbers.add(4);
        System.out.println("Priority Queue"+ numbers);
        //Using the Offers methods
        numbers.offer(10);
        System.out.println("Updated"+ numbers);
        //Using the Offers methods
        numbers.offer(1);
        System.out.println("Updated"+ numbers);
        // Using the peek() method
        int number = numbers.peek();
        System.out.println("Accessed Element: " + number);


        // Using the remove() method
        boolean result = numbers.remove(2);
        System.out.println("Is the element 2 removed? " + result);

        // Using the poll() method
        int numberpoll = numbers.poll();
        System.out.println("Removed Element Using poll(): " + numberpoll);

        Iterator<Integer> integerIterator=numbers.iterator();
        while (integerIterator.hasNext()){
            System.out.print(integerIterator.next());
            System.out.print(", ");
        }


    }
}
