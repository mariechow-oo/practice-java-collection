package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers
                .stream()
                .reduce(0, (prev, curr) -> curr%2==1 ? curr : prev);
    }

    public String getLongest(List<String> words) {
        return words
                .stream()
                .reduce("", (prev, curr) -> curr.length()>prev.length() ? curr : prev);
    }

    public int getTotalLength(List<String> words) {
        return words
                .stream()
                .reduce("", String::concat)
                .length();
    }
}
