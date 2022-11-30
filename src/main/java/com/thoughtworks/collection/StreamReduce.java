package com.thoughtworks.collection;

import java.util.Comparator;
import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers
                .stream()
                .reduce(-1, (prev, curr) -> curr%2==1 ? curr : prev);
    }

    public String getLongest(List<String> words) {
        return words
                .stream()
                .max(Comparator.comparingInt(String::length))
                .get();
//                .reduce("", (prev, curr) -> curr.length()>prev.length() ? curr : prev);
    }

    public int getTotalLength(List<String> words) {
        return words
                .stream()
                .reduce(0, (prev, curr) -> prev + curr.length(), Integer::sum);
    }
}
