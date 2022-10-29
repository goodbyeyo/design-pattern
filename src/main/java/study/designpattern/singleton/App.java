package study.designpattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/*
    1. 자바에서 enum을 사용하지 않고 싱글톤 패턴을 구현하는 방법?
        - private 생성자와 static 메서드를 사용하는 방법
    2. private 생성자와 static 매서드를 사용하는 방법의 단점?
        - 단잠 : 멀티쓰레드 환경에서 쓰레드 세이프 하지 않다
    3. enum을 사용해 싱글톤 패턴을 구현하는 방법의 장점, 단점?
        - 장점
            - 클래스 로딩 시점에 만들어 진다
        - 단점
            - lazy initialzation(지연초기화:처음 해당 인스턴스를 요청할때 만들어짐)이 안된다
            - 1) 즉 인스턴스를 필요한 순간에 만드는 초기화 지연을 사용하지 못한다
            - 리소스에 민감한 애플리케이션인 경우에는 필요한 순간에 인스턴스를 만드는 초기화 지연을 선호
            - 2) 상속을 사용하지 못한다
    4. static inner 클래스를 사용해 싱글톤 패턴을 구현
        - Settings5
 */
public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        getSingletonInstance();
        getBreakSingletonInstance();
        getSerializableInstance();
        getEnumInstance();
    }

    private static void getSingletonInstance() {
        Settings1 setting = Settings1.getInstance();
        Settings1 setting2 = Settings1.getInstance();
        System.out.println(setting.equals(setting2));
    }

    private static void getBreakSingletonInstance() throws NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {

        Settings5 settings = Settings5.getInstance();

        Constructor<Settings5> constructor = Settings5.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings5 settings1 = constructor.newInstance();

        System.out.println(settings == settings1);
    }

    private static void getSerializableInstance() throws IOException, ClassNotFoundException {
        Settings5 settings = Settings5.getInstance();
        Settings5 settings1 = null;

        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings5) in.readObject();
        }

        System.out.println(settings == settings1);
    }

    private static void getEnumInstance() throws InvocationTargetException, InstantiationException,
            IllegalAccessException {
        Settings6 settings = Settings6.INSTANCE;
        Settings6 settings1 = null;

        Constructor<?>[] declaredConstructors = Settings6.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            // can not reflectively create enum objects
            settings1 = (Settings6) constructor.newInstance("INSTANCE");
        }
        System.out.println(settings == settings1);
    }

}
