package study.designpattern.creational_patterns.builder.example;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {

    public static void main(String[] args) {
        UriComponents howToStudyJava = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.desine-patterns.com")
                .path("study/sang-wook")
                .build()
                .encode();
        System.out.println(howToStudyJava);
    }
}
