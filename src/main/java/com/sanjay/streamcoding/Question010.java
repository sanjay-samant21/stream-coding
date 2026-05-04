package com.sanjay.streamcoding;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Partition given string and generate map of each token with its length
 */


public class Question010 {
    public static void main(String[] args) {
        String input="Java is a great language. It is used to develop enterprise applications ";

        Map<String,Long> map=Stream.of(input.split(" "))
                .collect(Collectors.groupingBy(x->x, Collectors.summingLong(String::length)));
        System.out.println(map);

    }
}
