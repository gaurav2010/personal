package test;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by malinni on 13/10/2016.
 */
public class TestStream {


    /**
     * Created by malinni on 12/10/2016.
     */
    public class Test1Test {

        @Test
        public void testFilter() {
            List<String> list = Arrays.asList("red", "blue", "green");
            List<String> out = list.stream()
                    .filter(s -> s.length() > 4)
                    .collect(Collectors.toList());
            out.stream().forEach(System.out::println);

        }

        @Test
        public void testMap() {
            List<String> list = Arrays.asList("red", "blue", "green");
            list.stream()
                    .map(s -> s.toUpperCase())
                    .sorted()
                    .forEach(System.out::println);

        }

        @Test
        public void testFindFirst() {
            List<String> list = Arrays.asList("red", "blue", "green");
            list.stream()
                    .findFirst()
                    .ifPresent(System.out::print);

            List<String> list1 = Arrays.asList("red", "blue", "green");
            list1.stream()
                    .filter(s -> s.startsWith("x"))
                    .findFirst()
                    .ifPresent(System.out::print);
            System.out.println("complete");
        }

        @Test
        public void testAvg() {
            Arrays.stream(new int[]{1, 2, 3})
                    .map(n -> n * 2)
                    .average()
                    .ifPresent(System.out::println);
        }

        @Test
        public void testMaxLen() {
            Arrays.stream(new String[]{"a21", "11a2", "a3423"})
                    .map(s -> s.length())
//                .mapToInt(Integer::intValue)
                    //.min()
                    //.ifPresent(System.out::println);
                    .forEach(System.out::println);

        }

        @Test
        public void testReduce(){
            System.out.println(Arrays.stream(new String[]{"a11", "a211","b11","c12"})
                    .reduce("", (s, s2) -> s + s2));

        }

        @Test
        public void testGroup(){
            Arrays.stream(new String[]{"a11", "a211","b11","c12", "a11"})
                    .collect(Collectors.groupingByConcurrent(Function.identity(), Collectors.counting() ))
                    .forEach((s, aLong) ->  System.out.println(s + " " + aLong));
        }

        @Test
        public void testDistinct(){
            Arrays.stream(new String[]{"a11", "a211","b11","c12", "a11"})
                    .distinct()
                    .forEach(System.out::println);


        }


    }

}
