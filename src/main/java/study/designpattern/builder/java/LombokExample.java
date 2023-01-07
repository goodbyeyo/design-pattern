package study.designpattern.builder.java;

import lombok.Builder;

@Builder
public class LombokExample {

    private String title;

    private int nights;

    private int days;

    public static void main(String[] args) {
        LombokExample trip = LombokExample.builder()
                .title("Trip")
                .nights(6)
                .days(7)
                .build();
    }

}
