package study.designpattern.creational_patterns.factory_method.v3;

import study.designpattern.creational_patterns.factory_method.v2.RedShip;
import study.designpattern.creational_patterns.factory_method.v2.Ship;
import study.designpattern.creational_patterns.factory_method.v2.ShipFactory;

public class RedShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        // class 특화 로직 생성자에서 처리
        return new RedShip();
    }
}
