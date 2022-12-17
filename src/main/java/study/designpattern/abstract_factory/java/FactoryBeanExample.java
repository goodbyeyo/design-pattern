package study.designpattern.abstract_factory.java;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.designpattern.abstract_factory.Ship;

public class FactoryBeanExample {

    public static void main(String[] args) {

        xmlConfiguration();
        javaConfiguration();

    }

    private static void xmlConfiguration() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Ship blueShip = applicationContext.getBean("blueShip", Ship.class);
        System.out.println("blueShip = " + blueShip.getName());
    }

    private static void javaConfiguration() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        ShipFactory bean = applicationContext.getBean(ShipFactory.class);
        System.out.println("bean = " + bean);
    }
}
