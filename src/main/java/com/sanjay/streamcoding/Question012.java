package com.sanjay.streamcoding;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Join all the strings with comma
 */
public class Question012 {
    public static void main(String[] args) {
        String input="Java is a great language. It is used to develop enterprise applications ";
        String output= Stream.of(input.split(" "))
                .collect(Collectors.joining("-","(",")"));
        System.out.println("Result -"+output);
    }
}
