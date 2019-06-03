package lk.tharindu.employee;

import java.util.stream.Stream;

public class F8Of {
    public static void main(String[] args) {
        Stream.of(1,4,5,8,7,8,2,7,2,4,1,4,9).sorted().forEach(System.out::println);

        Integer[] integers ={1,4,7,8,52,44,89,22,11,95};
        Stream<Integer> integerStream= Stream.of(integers);
        integerStream.sorted().forEach(System.out::println);
    }
}
