package study.designpattern.factory_method.v2;

public class RedShipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        // class 특화 로직 생성자에서 처리
        return new RedShip();
    }
}
