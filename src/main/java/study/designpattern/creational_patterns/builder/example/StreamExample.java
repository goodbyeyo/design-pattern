package study.designpattern.creational_patterns.builder.example;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream<String> names = Stream.<String>builder()
                .add("Hwang")
                .add("Sang")
                .add("Wook")
                .build();
        names.forEach(System.out::println);
    }
}
