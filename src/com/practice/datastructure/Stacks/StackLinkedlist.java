package com.practice.datastructure.Stacks;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class StackLinkedlist<T> {

    LinkedList<T> list=new LinkedList<T>();

    public StackLinkedlist() {

    }
    public StackLinkedlist(T data){
        list.push(data);
    }
    public T pop() {
        if (list.isEmpty())
            throw new EmptyStackException();
        return list.removeLast();
    }
    public T peek(){
        return list.peekLast();
    }

   public Iterator<T> iterable(){
        return list.iterator();
    }

}
