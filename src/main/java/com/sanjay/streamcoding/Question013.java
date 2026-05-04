package com.sanjay.streamcoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
/**
 * Find second highest number in the array
 */
public class Question013 {
    public static void main(String[] args) {
        int[] arr={3,37,45,23,87,35,96,207};
        Optional<Integer> result= Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println("Highest element -"+result.get());
    }
}
