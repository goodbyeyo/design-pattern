package study.designpattern.abstract_factory.after;

import study.designpattern.abstract_factory.WhiteAnchor;
import study.designpattern.abstract_factory.WhiteWheel;

public class BlueShipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
