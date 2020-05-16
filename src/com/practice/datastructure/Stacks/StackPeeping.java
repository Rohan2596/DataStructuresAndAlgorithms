package com.practice.datastructure.Stacks;

import java.util.Stack;

public class StackPeeping {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        displayingStacks(stack);
        System.out.println("Peeking Elements :- " +stack.peek());
        stack.pop();
        System.out.println("After poping Peeking Elements :- " +stack.peek());
        stack.add(10);
        displayingStacks(stack);
        System.out.println("Size of Stack :-  "+stack.size());
    }

    private static void displayingStacks(Stack<Integer> stack) {
        System.out.println("Displaying Stack Values....");
        for (Integer i:stack) {
            System.out.println("Elements values:-  "+i);

        }
    }
}
