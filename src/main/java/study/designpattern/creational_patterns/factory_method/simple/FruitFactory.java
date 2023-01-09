package study.designpattern.creational_patterns.factory_method.simple;

public class FruitFactory {

    /**
     *
     */
    public SimpleFactory.Fruit createFruit(Fruit fruit) {
        return switch (fruit) {
            case APPLE -> new SimpleFactory.Apple();
            case BANANA -> new SimpleFactory.Banana();
        };
    }
}
