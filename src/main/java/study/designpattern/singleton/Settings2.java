package study.designpattern.singleton;

/**
 *  synchronized 사용해서 동기화 처리
 *  1. 멀티쓰레드 환경에서도 하나의 인스턴스를 보장할수 있다
 *  2. getInstance() 호출할때마다 동기화를 위한 성능 부하 발생 여지 있음
 */
public class Settings2 {

    private static Settings2 instance;

    private Settings2() { }

    public static synchronized Settings2 getInstance() {
        if (instance == null) {
            instance = new Settings2();
        }

        return instance;
    }
}

