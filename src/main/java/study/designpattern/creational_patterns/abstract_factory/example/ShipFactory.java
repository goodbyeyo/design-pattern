package study.designpattern.creational_patterns.abstract_factory.example;

import org.springframework.beans.factory.FactoryBean;
import study.designpattern.creational_patterns.abstract_factory.BlueShip;
import study.designpattern.creational_patterns.abstract_factory.Ship;

// 추상적인 FactoryBean 의 구현체
public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new BlueShip();
        ship.setName("BlueShip");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;

    }
}
