package study.designpattern.creational_patterns.abstract_factory.after;

import study.designpattern.creational_patterns.abstract_factory.Ship;
import study.designpattern.creational_patterns.abstract_factory.ShipFactory;


public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new BlueShipFactory(new BluePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

    }
}
