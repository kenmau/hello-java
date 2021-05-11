package com.company;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	    List<String> words = Arrays.asList("Apple", "Banana", "Carrot Sticks", "Durian");

        Optional<String> longestString = words.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2);
        longestString.ifPresent(System.out::println);

        Optional<String> combinedString = words.stream().reduce((w1, w2) -> w1 + "-" + w2);
        combinedString.ifPresent(System.out::println);


        List<Integer> numbers = Arrays.asList(1, 4, -1, -5, 9, 6, 10, 15, -6);

        int sum = numbers.stream().reduce(0, (int1, int2) -> int1 + int2);
        int max = numbers.stream().reduce(0, Integer::max);
        System.out.println(sum);
        System.out.println(max);

        int product = IntStream.range(2, 5)
                .reduce((a, b) -> a * b)
                .orElse(-1);
        System.out.println(product);

    }
}
