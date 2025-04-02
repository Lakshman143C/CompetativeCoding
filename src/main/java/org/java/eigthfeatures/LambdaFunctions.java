package org.java.eigthfeatures;
import java.lang.Runnable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaFunctions {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
       Arrays.stream(nums)
                .reduce((a, b)->a+b)  //-> here a is accumulated value and b is the next value in the given array
                .getAsInt();

        List<Integer> n=new ArrayList<>();
        Arrays.stream(nums)
                .filter(x -> x % 2 == 0)
                .forEach(value -> {
                    n.add(value);
                });
        n.stream().forEach(System.out::print);

        List<String> names=Arrays.asList("Ram","Syam","Pinky","haran","Sri");
        List<?> nam=names.stream().map(String::toUpperCase).toList();
        System.out.print(nam);
    }

    private void funInterfaces(){
        System.out.println((MathOperation)(a,b)-> a+b);

        Predicate<String> isStartsWithA= s->s.toUpperCase().startsWith("A");
        Predicate<String> isEndsWithT=s->s.toUpperCase().endsWith("T");
        Predicate<String> and=isEndsWithT.and(isEndsWithT);
        System.out.println(isEndsWithT.test("Start"));
        System.out.println(isStartsWithA.test("Ant"));
        System.out.println(and.test("Ant"));

        Function<Integer,Integer> doubleit=x->x*2;
        System.out.println(doubleit.apply(100));

    }
}



interface MathOperation{
    int operat(int a,int b);
}

class Task implements Runnable{

    @Override
    public void run() {
        System.out.print("hello");
    }
}

