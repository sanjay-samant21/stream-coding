package com.sanjay.streamcoding;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Write a function to find the smallest number in an array
 */
public class Question009 {
    public static void main(String[] args) {
        int[] arr={1,6,9,3,-7,-9};
        OptionalInt result=Arrays.stream(arr)
                .min();
        System.out.println("Smallest number in the list -"+result.getAsInt());

    }
}
