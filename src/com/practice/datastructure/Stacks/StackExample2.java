package com.practice.datastructure.Stacks;

import javax.sound.midi.Soundbank;
import java.util.Stack;

public class StackExample2 {
/*
* Poping  elements from stacks.
* */

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        StackExample2 stacksExample2=new StackExample2();
        stacksExample2.displaying(stack);
        stack.pop();
        stacksExample2.displaying(stack);


    }

    private void displaying(Stack<Integer> stack) {
        System.out.println("Displaying Values....");

        if(stack.empty()==true){
            System.out.println("Stacks is empty.");
        }
        for (Integer i:stack) {

            System.out.println("Elements Value:- "+i);


        }
    }
}
