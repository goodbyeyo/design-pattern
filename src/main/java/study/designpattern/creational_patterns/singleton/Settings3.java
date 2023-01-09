package study.designpattern.creational_patterns.singleton;

/**
 * 이른 초기화(eager initialization) 사용하기
 * thread safe
 *
 */
public class Settings3 {

    private static final Settings3 INSTANCE = new Settings3();

    private Settings3() { }

    public static Settings3 getInstance() {
        return INSTANCE;
    }
}
