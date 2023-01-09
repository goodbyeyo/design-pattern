package study.designpattern.creational_patterns.abstract_factory;

public abstract class DefaultShipFactory implements ShipFactory {

    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다");
    }
}
