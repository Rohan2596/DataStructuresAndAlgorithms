package com.practice.datastructure.Vector;

import java.util.Iterator;
import java.util.Vector;

public class RemoveVectorExample {
    public static void main(String[] args) {
        Vector<String> animals=new Vector<String>();
        animals.add("Dogs");
        animals.add("Cats");
        animals.add(2,"human");

        animals.remove("Dogs");
        Iterator<String> iterator=animals.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // Using remove()
        String element = animals.remove(1);
        System.out.println("Removed Element: " + element);
        System.out.println("New Vector: " + animals);

        // Using clear()
        animals.clear();
        System.out.println("Vector after clear(): " + animals);

    }
}
