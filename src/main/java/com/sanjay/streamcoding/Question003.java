package com.sanjay.streamcoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Find first 3 elements of the list
 */
public class Question003 {

    public static void main(String[] args) {
        Integer[] arr={3,5,8,4,5,9,6};
        List<Integer> list= Arrays.asList(arr);
        List<Integer> result= list.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("First 3 elements of list -"+result);
    }
}
