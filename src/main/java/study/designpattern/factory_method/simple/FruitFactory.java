package study.designpattern.factory_method.simple;

import static study.designpattern.factory_method.simple.SimpleFactory.*;

public class FruitFactory {

    /**
     *
     */
    public SimpleFactory.Fruit createFruit(Fruit fruit) {
        return switch (fruit) {
            case APPLE -> new Apple();
            case BANANA -> new Banana();
        };
    }
}
