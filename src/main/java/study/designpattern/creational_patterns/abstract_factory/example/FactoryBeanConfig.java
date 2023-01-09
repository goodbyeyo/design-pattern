package study.designpattern.creational_patterns.abstract_factory.example;

import org.springframework.context.annotation.Bean;

public class FactoryBeanConfig {

    @Bean
    public ShipFactory shipFactory() {
        return new ShipFactory();
    }
}
