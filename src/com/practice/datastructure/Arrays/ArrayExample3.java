package com.practice.datastructure.Arrays;

import java.util.function.DoubleToIntFunction;

public class ArrayExample3 {


    public static void main(String[] args) {
//        int mutliArray[][]=new int[2][2];

//        mutliArray[0][0]=0;
//        mutliArray[0][1]=1;
//        mutliArray[1][0]=2;
//        mutliArray[1][1]=3;
          int  mutliArray[][]= { {2,7,9},{3,6,1},{7,4,2} };
        for (int i=0;i<mutliArray.length;i++) {//iterate over rows.

            for (int j=0;j<mutliArray.length;j++) {//iterate over columns.
                System.out.println( "Value:- " + mutliArray[i][j]);
            }
        }
    }
}
