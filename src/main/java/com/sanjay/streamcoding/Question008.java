package com.sanjay.streamcoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Write a function that returns the reverse of a string?
 */
public class Question008 {
    public static void main(String[] args) {
        String input="Java is great";
        Optional<String> s= Stream.of(input.split(""))
                .reduce((a,b)->b+a);
        System.out.println(s);
    }
}
