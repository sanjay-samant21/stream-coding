package com.sanjay.streamcoding;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
/**
 * Find maximum number in a list
 */
public class Question001 {

    public static void main(String[] args) {
        int[] arr={35,12,5,8,37,20,55};
        OptionalInt max= Arrays.stream(arr)
                .max();
        System.out.println("Maximum number - "+max.getAsInt());

    }
}
