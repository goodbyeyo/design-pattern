package study.designpattern.creational_patterns.factory_method.v3;

public class BlueShipFactory extends DefaultShipFactory {

    @Override
    public BlueShip createShip()  {
        return new BlueShip();
    }

    @Override
    public void sendEmailTo(String email, Ship ship) {

    }

}
