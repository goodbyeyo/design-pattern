package study.designpattern.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        String test = applicationContext.getBean("test", String.class);
        String test2 = applicationContext.getBean("test", String.class);
        System.out.println(test == test2);
    }
}
