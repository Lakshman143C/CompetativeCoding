package org.java.core.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        secondLargestEle();
    }

    public static void summaryStatistics(){
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,7,8,8,8,9);
        IntSummaryStatistics intSummaryStatistics = list.stream()
                .mapToInt(x -> x)
                .summaryStatistics();
    }

    public static void secondLargestEle(){
        List<Integer> ele=Arrays.asList(1,2,3,4,5,6,7);
        Optional<Integer> secondLargestEle = ele.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondLargestEle);
    }

    public static void printSumOfAllNum(){
        List<Integer> ele=Arrays.asList(1,2,3,4,5,6,7);
        Integer i = ele.stream()
                .reduce((a, b) -> a + b).get();
        System.out.println(i);
    }


    public static void flatMapEx(){
        List<List<String>> fruitsList = Arrays.asList(
                Arrays.asList("banana", "orange"),
                Arrays.asList("Apple", "mango"),
                Arrays.asList("Kiwi", "grape")
        );
        List<String> fruites = fruitsList.stream()
                .flatMap(fruit -> fruit.stream())
                .map(String::toLowerCase)
                .toList();
        System.out.println(fruites);
    }

    public static void parallelVsSequentialStreamEx(){
        List<Integer> ele = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        long start=System.currentTimeMillis();
        List<Integer> factorials1 = ele.stream().map(x -> factorial(x)).toList();
        long end=System.currentTimeMillis();
        System.out.println("Time taken for sequential stream "+(end-start)+"  ms");

        start=System.currentTimeMillis();
        ele.parallelStream().map(x->factorial(x)).toList();
        end=System.currentTimeMillis();
        System.out.println("Time taken for parallel stream "+(end-start)+"  ms");
    }
    public static int factorial(int x){
        if(x==0 || x==1)
            return x;
        return x* factorial(x-1);
    }

    public static void streamExecutionAtTerminalOperation(){
        List<String> names=Arrays.asList("Lirus","Ram","bob","alice","mormont","jon snow","ygrite","gilli");
        Stream<String> result = names.stream().filter(x -> {
            if (x.length() < 5)
                System.out.println("filtering name " + x);
            return x.length() > 5;
        });

        System.out.println("Before terminal operation");
        result.forEach(System.out::println);
    }

    public void charFrequencies(){
        String s="Something error occurred while loading the data";
        Map<Character, Long> frequencies = s.toLowerCase().chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequencies);
    }
}
