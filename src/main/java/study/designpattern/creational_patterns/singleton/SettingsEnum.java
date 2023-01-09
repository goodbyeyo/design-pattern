package study.designpattern.creational_patterns.singleton;

public enum SettingsEnum {

    INSTANCE;

    SettingsEnum() {
    }

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
