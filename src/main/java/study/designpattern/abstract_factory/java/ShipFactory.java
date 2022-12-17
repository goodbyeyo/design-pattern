package study.designpattern.abstract_factory.java;

import org.springframework.beans.factory.FactoryBean;
import study.designpattern.abstract_factory.BlueShip;
import study.designpattern.abstract_factory.Ship;

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
