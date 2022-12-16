package study.designpattern.factory_method.v3;

import study.designpattern.factory_method.v2.Ship;

public abstract class DefaultShipFactory implements ShipFactory{

    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다");
    }
}
