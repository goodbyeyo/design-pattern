package study.designpattern.creational_patterns.singleton;

public class Setting {

    // 1. private 생성자를 만들면 Settings 외의 클래스에서 객체를 생성하지 못한다
    private Setting() {

    }

    // 2. 매번 new 예약어로 인스턴스를 생성하기때문에 싱글톤이 구현되지 않는다
    public static Setting getInstance(){
        return new Setting();
    }
}


