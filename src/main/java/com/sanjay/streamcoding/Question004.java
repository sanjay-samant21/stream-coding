package com.sanjay.streamcoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

/**
 * Write a function that returns the longest word in the sentence.
 */
public class Question004 {

    public static void main(String[] args) {
        String sentence="Java is a great language. It is compulsory to learn.";
        Optional<String> word=Arrays.stream(sentence.split(" "))
                .map(token->token.replaceAll("[,;.]", ""))
                .max(Comparator.comparing(String::length));
        System.out.println(word.get());

    }

}
