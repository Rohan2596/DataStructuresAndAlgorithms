package com.practice.datastructure.Stacks;

import java.util.Stack;

public class StacksExample1 {

    /*
     * Pushing  elements from stacks.
     * */


    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        StacksExample1 stacksExample1=new StacksExample1();
        stacksExample1.displaying(stack);

    }

    private void displaying(Stack<Integer> stack) {

        for (Integer i:stack) {
            System.out.println(i);

        }
    }
}
