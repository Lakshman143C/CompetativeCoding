package org.java.eigthfeatures.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountInStr {
    public static void main(String[] args) {
        Character[] chars={'a','a','b','c','d','e','z','h','a','a','b','c','d','e','z','h'};
        int[] ints={1,2,3,4,5,6,7,8};
        Map<Character, Long> chs = Arrays.stream(chars)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        System.out.println(chs);
        Arrays.stream(ints)
                        .map(ele -> ele*ele)
                                .forEach(System.out::println);

    }

    private static void filterEvens() {
        String s="intcharfloatdoublebooleanobjectclass";
        List<Integer> vals=List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenList = vals.stream()
                .filter(e -> e % 2 == 0)
                .toList();
        System.out.println(evenList);
    }

    private static void frequnciesUsingStreams(String s) {
        //        String s="intcharfloatdoublebooleanobjectclass";
        Optional<Character> first = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> (char) entry.getKey())
                .findFirst();
    }
}
