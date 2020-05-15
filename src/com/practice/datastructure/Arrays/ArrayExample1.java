package com.practice.datastructure.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {

        int staticArray[]=new int[5];
        staticArray[1]=0;
        staticArray[2]=1;
        staticArray[3]=1;
        staticArray[4]=1;
        staticArray[0]=4;
        for (int i:staticArray){
            System.out.println( "Value:- " + i);
        }
    }
}
