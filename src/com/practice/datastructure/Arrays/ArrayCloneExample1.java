package com.practice.datastructure.Arrays;

public class ArrayCloneExample1 {
    public static  void main(String args[]){
        int intArray[]={1,2,3};
        int cloneArray[]=intArray.clone();

        System.out.println(intArray==cloneArray);
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.println(cloneArray[i]);
        }
    }
}
