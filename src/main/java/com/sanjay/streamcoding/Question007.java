package com.sanjay.streamcoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Sort list in descending order
 */
public class Question007 {
    public static void main(String[] args) {
        int[] arr={2,5,8,10,3,6,2};
        List<Integer> list=Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted list -"+list);


    }
}
