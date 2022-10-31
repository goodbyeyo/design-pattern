package study.designpattern.factory_method.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = new WhiteShipFactory()
                .orderShip("whiteShip", "wook@naver.com");
        System.out.println(whiteShip);

        Ship blackShip = new BlackShipFactory()
                .orderShip("blackShip", "sang@naver.com");
        System.out.println(whiteShip);
    }

}
