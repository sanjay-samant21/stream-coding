package com.sanjay.streamcoding;

import java.util.Arrays;

/**
 * Write a function to calculate the sum of all elements in an array.
 */
public class Question011 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,47,56,21};
        int sum=Arrays.stream(arr)
                .sum();
        System.out.println("Sum - "+sum);
    }
}
