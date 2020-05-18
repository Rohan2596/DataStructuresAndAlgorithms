package com.practice.datastructure.Hash;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,Integer>hashTable=new Hashtable<Integer, Integer>();
        hashTable.put(1,23);
        hashTable.put(2,34);
        hashTable.put(3,72);
        System.out.println(hashTable);
        hashTable.remove(1);
        System.out.println(hashTable);
    }
}
