package study.designpattern.creational_patterns.abstract_factory.after;

import study.designpattern.creational_patterns.abstract_factory.BlueShip;
import study.designpattern.creational_patterns.abstract_factory.DefaultShipFactory;
import study.designpattern.creational_patterns.abstract_factory.Ship;

// 클라이언트 코드에 해당
public class BlueShipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public BlueShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new BlueShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }

    @Override
    public void sendEmailTo(String email, Ship ship) {
    }
    
}
