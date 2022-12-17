package study.designpattern.abstract_factory.after;

public class BluePartsProFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new BlueAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new BlueWheelPro();
    }
}
