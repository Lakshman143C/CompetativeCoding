package org.java.eigthfeatures.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class CodePeriod62Problems {
    public static void main(String[] args) {
        String[] s={"Alice","Bob","Peter","Henry","Anthony","Blessy"};
        String[] chars={"A","B","C","D","A","B","C","D",
                "A","B","C","D","E","A","B","C","D","A","B","C","D","A","B","C","D","E"};
        Map<String, Integer> collected = Arrays.stream(chars)
                .collect(Collectors.toMap(a -> a, // key
                        b -> 1,  //value
                        (c,d)->c+d)); // merge function 
        System.out.println(collected);
        int[] i={1,2,3,4,5};
//        int val = Arrays.stream(i).reduce(10, (a, b) -> a + b);
//        System.out.println(val);
//        Arrays.stream(s).filter(str->str.contains("e"))
//                .forEach(System.out::println);

//        Arrays.stream(s).map(t->t.toUpperCase())
//                .forEach(System.out::println);
    }

    public static void maxLenStr(){
        String s="The children played happily in the park until it got dark.";
        String max_len_String = Arrays.stream(s.split(" "))
                .max(Comparator.comparing(String::length)).get();
        System.out.println(max_len_String);
    }
}
