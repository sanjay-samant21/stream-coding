package com.sanjay.streamcoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Check if all the numbers are even in the list
 */
public class Question005 {
    public static void main(String[] args) {
        int[] arr={6,4,8,10,12};

        List<Integer> result= Arrays.stream(arr)
                .filter(x->x%2!=0)
                .boxed()
                .collect(Collectors.toList());
        System.out.println((result.size()==0)?"List contains only even numbers":"All elements in the list are not even");
   }
}
