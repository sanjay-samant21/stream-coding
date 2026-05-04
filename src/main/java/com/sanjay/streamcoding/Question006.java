package com.sanjay.streamcoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Remove duplicates from list preserving order
 */
public class Question006{
    public static void main(String[] args) {
        int[] arr={1,4,5,2,4,7,6,4,7,2};
        Set<Integer> elements=new HashSet<>();
        List<Integer> result=Arrays.stream(arr)
                .filter(x->elements.add(x))
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Resulting list -"+result);

    }
}
