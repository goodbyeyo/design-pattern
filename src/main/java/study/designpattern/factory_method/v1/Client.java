package study.designpattern.factory_method.v1;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = ShipFactory.orderShip("whiteShip", "wookW@mail.com");
        System.out.println(whiteShip);

        Ship blackShip = ShipFactory.orderShip("blackShip", "wookW@mail.com");
        System.out.println(blackShip);
    }
}
