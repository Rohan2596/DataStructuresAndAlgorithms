package com.practice.datastructure.Stacks;

import java.util.Stack;

public class StackSearching {

    /*
     * Searching  elements from stacks.
     * */


    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        StackSearching stackSearching=new StackSearching();
        stackSearching.displaying(stack);
        stackSearching.seraching(stack,1);

    }

    private void displaying(Stack<Integer> stack) {

        for (Integer i:stack) {
            System.out.println(i);

        }
    }

    private  void seraching(Stack<Integer> stack,int value){
        Integer search=stack.search(value);
        System.out.println(search+" Search value " );
        if(search>0){
            System.out.println("Value Found ...........");
        }
        if (search<0){
            System.out.println("Value ****Not*** Found");
        }

    }

}
