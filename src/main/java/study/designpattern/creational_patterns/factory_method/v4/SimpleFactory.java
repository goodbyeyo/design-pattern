package study.designpattern.creational_patterns.factory_method.v4;

import study.designpattern.creational_patterns.factory_method.v3.BlueShip;
import study.designpattern.creational_patterns.factory_method.v3.RedShip;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("redShip")) {
            return new RedShip();
        } else if (name.equals("blueShip")) {
            return new BlueShip();
        }

        throw new IllegalArgumentException();
    }
}
