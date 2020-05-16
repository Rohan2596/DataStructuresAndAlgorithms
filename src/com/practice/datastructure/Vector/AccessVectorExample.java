package com.practice.datastructure.Vector;

import java.util.Iterator;
import java.util.Vector;

public class AccessVectorExample {
    public static void main(String[] args) {
        Vector<String> animals=new Vector<String>();
        animals.add("Dogs");
        animals.add("Cats");
        animals.add(2,"human");
        // Using get()
        String element = animals.get(2);
        System.out.println("Element at index 2: " + element);

        Iterator<String> iterator=animals.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
