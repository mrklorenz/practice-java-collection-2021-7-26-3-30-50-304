package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamReduce {

    public StreamReduce() {
    }

    public int getLastOdd(List<Integer> numbers) {
        return numbers
                .stream()
                .reduce(0, (num, nextnum) -> nextnum%2!=0 ? nextnum : num);
    }

    public String getLongest(List<String> words) {
        return words
                .stream()
                .reduce("", (firstString, nextString) -> firstString.length() > nextString.length()
                        ? firstString : nextString );
    }

    public int getTotalLength(List<String> words) {
        return words
                .stream()
                .mapToInt(String::length)
                .reduce(0, Integer::sum);
    }
}
