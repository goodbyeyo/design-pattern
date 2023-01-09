package study.designpattern.creational_patterns.singleton;

/**
 * double checked locking 사용하기
 * 장점
 * 1. 이미 인스턴스가 있는 경우에는 동기화 Skip -> 성능에 유리하다
 * 2. 필요할때만 인스턴스를 만들수 있다
 */
public class Settings4 {

    // volatile : Java 1.5 부터 동작
    private static volatile Settings4 instance;

    private Settings4() {
    }

    public static Settings4 getInstance() {
        if (instance == null) {
            synchronized (Settings4.class) {
                if (instance == null) {
                    instance = new Settings4();
                }
            }
        }
        return instance;
    }
}

