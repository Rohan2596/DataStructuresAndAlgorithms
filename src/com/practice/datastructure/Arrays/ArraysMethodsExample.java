package com.practice.datastructure.Arrays;

public class ArraysMethodsExample {

    private static int[] m1(int value) {
        return new int[value];
    }
    public static void main(String[] args) {
        int arr[]=m1(4);
        for (int i:arr) {
            System.out.println("Elements Values:- " + i);
        }

    }


}
