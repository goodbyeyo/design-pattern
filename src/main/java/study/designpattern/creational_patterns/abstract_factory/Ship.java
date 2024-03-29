package study.designpattern.creational_patterns.abstract_factory;

import study.designpattern.creational_patterns.abstract_factory.after.Anchor;
import study.designpattern.creational_patterns.abstract_factory.after.Wheel;

public class Ship {

    private String name;
    private String color;
    private String logo;
    private Anchor anchor;
    private Wheel wheel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
    }

    @Override
    public String toString() {
        return "Ship{" +
                "anchor='" + anchor + '\'' +
                ", wheel='" + wheel + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
