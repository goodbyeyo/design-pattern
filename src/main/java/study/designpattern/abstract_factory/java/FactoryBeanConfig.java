package study.designpattern.abstract_factory.java;

import org.springframework.context.annotation.Bean;
import study.designpattern.abstract_factory.Ship;

public class FactoryBeanConfig {

    @Bean
    public ShipFactory shipFactory() {
        return new ShipFactory();
    }
}
