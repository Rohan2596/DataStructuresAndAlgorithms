package com.practice.datastructure.Stacks;

public class Stack {
    private  int StackArray[];
    private  int capacity;
    private int top;
    int size;
    public Stack(int size) {
        StackArray=new int[size];
        capacity=size;
        top=-1;
    }

    private void push(int value) {
        if (isFull()){
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }
        System.out.println("Inserting " + value);
        StackArray[++top]=value;
    }
    private int pop(){
        if(isEmpty()){
            System.out.println("Stacks are empty..");
            System.exit(1);
        }
        return StackArray[top--];
    }
    public Boolean isFull(){
        return top==capacity-1;
    }
    public Boolean isEmpty(){
        return top==-1;

    }
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(StackArray[i]);
        }
    }
    public static void main(String[] args) {
         Stack stack = new Stack(5);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    stack.pop();
    System.out.println("\nAfter popping out");

    stack.printStack();


    }


}
