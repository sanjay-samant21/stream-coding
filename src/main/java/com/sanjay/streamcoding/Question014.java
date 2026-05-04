package com.sanjay.streamcoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

/**
 * Get top 3 highest numbers for array of integers
 */
public class Question014 {

    public static void main(String[] args) {
        int[] arr={3,37,45,23,87,35,96,207};
        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
    }
}
