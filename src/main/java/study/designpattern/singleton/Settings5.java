package study.designpattern.singleton;

import java.io.Serializable;

/**
 * static inner class 사용하기
 * 1. 멀티쓰레드 환경에서도 안전
 * 2. getInstance() 호출될때만 인스턴스 생성 (즉 lazy 로딩이 가능)
 * 역직렬화 대응 방안
 * readResolve() : 역직렬화할때 반드시 사용하게 된다
 * 객체를 영속화 할때 일반적으로 DB에 저장...
 * But 파일에 저장할 경우 직렬화 역직렬화 필요하다
 */

public class Settings5 implements Serializable {

    private Settings5() {
    }

    private static class SettingsHolder {
        private static final Settings5 INSTANCE = new Settings5();
    }

    public static Settings5 getInstance() {
        return SettingsHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

}
