package com.sanjay.streamcoding;


import java.util.Optional;
import java.util.stream.Stream;

/**
 * Write a function that returns the reverse of a string?
 */
public class Question008 {
    public static void main(String[] args) {
        String input="";
        Optional<String> s= Stream.of(input.split(""))
                .reduce((a,b)->b+a);
        if (s.isPresent() && (!s.get().isEmpty()))
            System.out.println(s.get());
        else
            System.out.println("String is empty");
    }
}
