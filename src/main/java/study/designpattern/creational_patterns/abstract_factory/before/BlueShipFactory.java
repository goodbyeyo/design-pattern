package study.designpattern.creational_patterns.abstract_factory.before;

import study.designpattern.creational_patterns.abstract_factory.*;

// 클라이언트 코드에 해당
public class BlueShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new BlueShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
