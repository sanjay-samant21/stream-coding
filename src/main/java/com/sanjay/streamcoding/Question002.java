package com.sanjay.streamcoding;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Write a Program to find the duplicates in an array using stream API?
 */
public class Question002 {
    public static void main(String[] args) {
        int[] arr = {7,1, 2, 3, 1, 2, 4, 5,6,8,7,4,7};
        Set<Integer> elements= new HashSet<>();
        Set<Integer> dup= Arrays.stream(arr)
                .filter(i-> !elements.add(i))
                .boxed()
                .collect(Collectors.toSet());
        System.out.print("Duplicate elements in the array -");
        for(Integer element:dup){
            System.out.print(element+" ");
        }
    }
}
