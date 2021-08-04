package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSupplement {

    public StreamSupplement() {
    }

    public List<Integer> sortFromMaxToMin(List<Integer> numbers) {
        return numbers
                .stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    public double getAverage(List<Integer> numbers) {
        return numbers
                .stream()
                .mapToDouble(number -> number)
                .average()
                .orElse(0.0);
    }

    public int getMaxValue(List<Integer> numbers) {
        return numbers
                .stream()
                .max(Integer::compare)
                .get();
    }
}
