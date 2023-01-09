package study.designpattern.creational_patterns.abstract_factory.after;

// 추상화 팩토리
// Open Closed principle
public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();

}
