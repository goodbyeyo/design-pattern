package study.designpattern.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringConfig {

    @Bean
    public String test() {
        return "test";
    }
}
