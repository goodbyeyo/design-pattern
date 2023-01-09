package study.designpattern.creational_patterns.singleton;

public class Settings {

    private static Settings instance;

    // 1. private 생성자를 만들면 Settings 외의 클래스에서 객체를 생성하지 못한다
    private Settings() {

    }
    // 2. 싱글톤이 구현되지 않는다
    public static Settings getInstance2() {
        return new Settings();
    }

    // 3. 싱클톤이 구현되지만 멀티쓰레드에 안전하지 않다
    public static Settings getInstance3() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }

    // 4.  synchronized 키워드 사용
    // 쓰레드 safe 하지만 동기화 처리때문에 성능에 불이득
    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }

    // 5. 이른 초기화(eager initialization) 사용하기 // 상수는 대문자로 쓰는게 규약
    // 쓰레드 safe 하다
    public static final Settings INSTANCE = new Settings();

    public static Settings getInstance5() {
        return INSTANCE;
    }

    // 6. double checked locking 사용하기
    private static volatile Settings instance6;

    public static Settings getInstance6() {
        
        // 이미 인스턴스가 있는 경우에는 skip, 없는경우에만
        if (instance6 == null) {
           synchronized (Settings.class) {
               if (instance6 == null) {
                   instance6 = new Settings();
               }
           }
        }
        return instance6;
    }

    // 7. static inner 클래스 사용하기
    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance7() {
        return SettingsHolder.INSTANCE;
    }
    
    // static으로 선언된 필드는 어떤 클래스가 처음 로딩이 될때 정적인 메모리 공간에 만들어진다
    // 따라서 해당 클래스를 로딩하지 않는 경우 static 한 인스턴스도 만들어지지 않는다

    protected Object readResolve() {
        return getInstance();
    }


}
