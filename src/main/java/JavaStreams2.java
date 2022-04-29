package src.main.java;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreams2 {

    public static void main(String[] args){
        System.out.print("Distinct: ");
        distinct();
        System.out.print("\n---\nMap: ");
        map();
        System.out.print("\n---\nMap 2: ");
        map2();
        System.out.print("\n---\nFlatMap: ");
        flatmap();
        System.out.print("\n---\nSkip: ");
        skip();
        System.out.print("\n---\nCount: ");
        count();
        System.out.print("\n---\nMax: ");
        max();
        System.out.print("\n---\nMin: ");
        min();
        System.out.print("\n---\nReduce: ");
        reduce();

    }
    private static void distinct(){
        List<String> list = List.of("Kevin", "Michael", "Julio", "Juan", "John", "Tyson", "Michael");

        List<String> distinctElements = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctElements);
    }

    private static void map(){
        List<String> list = List.of("Kevin", "Michael", "Julio", "Juan", "John", "Tyson", "Michael");

        List<String> mappedElements = list.stream()
                .map(name -> "Name: " + name)
                .collect(Collectors.toList());

        System.out.println(mappedElements);
    }

    private static void map2(){
        List<String> list = List.of("1", "2", "3", "4", "5");

        List<Integer> integerList = list.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(integerList);
    }

    private static void flatmap(){
        List<String> aNames = List.of("Andrew", "Adams", "Arthur");
        List<String> bNames = List.of("Barry", "Brian", "Benjamin", "Brittany");
        List<String> cNames = List.of("Carlos", "Caleb", "Cameron", "Chloe");
        List<List<String>> nestedList = List.of(aNames, bNames, cNames);

        System.out.println("\nBefore Flattening:" + nestedList);

        List<String> allNames = nestedList.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("\nAfter Flattening:" + allNames);
    }

    private static void skip(){
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        int[] skipped5Array = Arrays.stream(intArray)
                .skip(5)
                .toArray();

        System.out.println(Arrays.toString(skipped5Array));
    }

    private static void count(){
        List<Integer> integerList = List.of(18, 20, 34, 58, 100, 2020, 43, 57, 28, 65, 999);

        long count = integerList.stream()
                .filter(x -> x > 50 && x < 1000)
                .count();

        System.out.println(count);
    }

    private static void max(){
        List<Integer> integerList = List.of(18, 20, 34, 58, 100, 2020, 43, 57, 28, 65, 999);

        Optional<Integer> max = integerList.stream()
                .max(Integer::compare);

        if(max.isPresent()){
            System.out.println(max.get());
        }else{
            System.out.println("Not Found");
        }
    }

    private static void min(){
        List<Integer> integerList = List.of(18, 20, 34, 58, 100, 2020, 43, 57, 28, 65, 999);

        Optional<Integer> min = integerList.stream()
                .min(Integer::compare);

        if(min.isPresent()){
            System.out.println(min.get());
        }else{
            System.out.println("Not Found");
        }
    }

    private static void reduce(){
        List<Integer> integerList = List.of(18, 20, 34, 58, 100, 2020, 43, 57, 28, 65, 999);

        Integer result = integerList.stream()
                .reduce(0, (subtotal, element) -> subtotal + element);

        System.out.println(result);
    }
}
