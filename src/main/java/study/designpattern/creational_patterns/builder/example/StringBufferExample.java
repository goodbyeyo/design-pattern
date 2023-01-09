package study.designpattern.creational_patterns.builder.example;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        String str = buffer.append("design")
                .append(" patterns")
                .append(" study")
                .toString();
        System.out.println("str = " + str);
    }
}
