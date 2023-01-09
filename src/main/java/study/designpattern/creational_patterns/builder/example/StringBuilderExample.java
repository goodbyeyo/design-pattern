package study.designpattern.creational_patterns.builder.example;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder
                .append("Hwang")
                .append("Sang")
                .append("Wook")
                .toString();
        System.out.println(result);
    }
}
