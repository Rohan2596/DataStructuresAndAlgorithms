package com.practice.datastructure.Arrays;

public class ArraySumExample {


    public static void main(String[] args) {
     int arr[]={2,4,1};
        sum(arr);
        System.out.println(sum(arr));
    }

    private static int sum(int[] arr) {
         int  sum=0;
        for (int i:arr){
            sum=sum +i;

        }
        return sum;
    }
}
