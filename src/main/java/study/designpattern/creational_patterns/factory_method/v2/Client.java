package study.designpattern.creational_patterns.factory_method.v2;

public class Client {

    public static void main(String[] args) {
        /**
         * 1. blueShip 을 만들때 whiteShip 의 코드는 바뀌지 않아야 한다
         * 2. 변경에 닫혀있고 확징에 열려있도록 구현
         */
        Client client = new Client();
        client.print(new BlueShipFactory(), "blueShip", "wook@gmail.com");
        client.print(new BlueShipFactory(), "redShip", "wook@gmail.com");

        Ship redShip = new RedShipFactory().orderShip("redShip", "wook@gamil.com");
        System.out.println(redShip);

        Ship blueShip = new BlueShipFactory().orderShip("blueShip", "wook@gamil.com");
        System.out.println(blueShip);




    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
