package study.designpattern.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * singleton scope
 * singleton pattern 은 아님
 * 실무에서의 Singleton pattern
 *  - java.lang.runetime
 *  - 다른 디자인 패턴(빌더, 퍼사드, 추상팩토리 등) 구현체의 일부로 쓰이기도 함
 */
public class SpringExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        String test = applicationContext.getBean("test", String.class);
        String test2 = applicationContext.getBean("test", String.class);
        System.out.println(test.equals(test2));
    }
}
