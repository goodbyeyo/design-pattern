package study.designpattern.factory_method.v3;


/**
 * 1) java8 이상 interface - default method 사용 가능
 * 2) java11 이상 interface - private method 사용가능
 */
public interface ShipFactory {

    default Ship orderShip(String name, String email) {

        // 공통 로직은 interface 에서 구현
        validate(name, email);
        prepareFor(name);

        // ship 만드는 구체적인 과정은 하위클래스에 위임
        Ship ship = createShip();
        sendEmailTo(email, ship);

        return ship;
    }

    BlueShip createShip();

    // Java 9 버전부터 interface - private method 사용가능
    void sendEmailTo(String email, Ship ship);

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }
}
