package com.practice.datastructure.Vector;

import java.util.Vector;

public class VectorExample1 {

    public static void main(String[] args) {
        Vector<String> mammals=new Vector<String>();
        mammals.add("Dogs");
        mammals.add("horse");
        // Using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);
        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);

    }
}
