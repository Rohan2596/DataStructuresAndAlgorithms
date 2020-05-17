package com.practice.datastructure.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriority {
    public static void main(String[] args) {
        Queue<Integer> numbers=new PriorityQueue<>();
        //offers elements to Queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue:- "+numbers);
        //Access elements of the Queue
        int accessedNumber=numbers.peek();
        System.out.println("Element peeks:- "+accessedNumber);
        //remove elements from the Queue
        int removedNumber=numbers.peek();
        System.out.println("Removed Element:- "+removedNumber);

        System.out.println("Updated Queue:- "+numbers);

    }

}
