package study.designpattern.creational_patterns.singleton;

/**
 * 로딩할때 인스턴스가 만들어진다
 *  Java에서 Enum으로 new 로 Reflection 하는것은 불가능
 *  -> 유일한 Instance 보장
 * 단, enum 객체는 쓰레드 세이프 하지 않다
 */

public enum Settings6 {

    INSTANCE;
}
