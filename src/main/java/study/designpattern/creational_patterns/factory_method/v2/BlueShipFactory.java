package study.designpattern.creational_patterns.factory_method.v2;

public class BlueShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new BlueShip();
    }
}
