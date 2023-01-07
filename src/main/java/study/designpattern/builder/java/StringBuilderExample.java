package study.designpattern.builder.java;

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
