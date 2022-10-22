package study.designpattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
//    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Settings settings = new Settings();
//        Settings settings1 = new Settings();
//        Settings settings = Settings.getInstance();
//        Settings settings1 = Settings.getInstance();
//        System.out.println(settings == settings1);

        //
//        Settings settings = Settings.getInstance();
//        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Settings settings1 = constructor.newInstance();
//        System.out.println(settings == settings1);

        // Enum 사용  -> Reflection 안전하다
        // Java에서 Enum으로 new 로 Reflection 하는것은 불가능 -> 유일한 Instance 보장
//        SettingsEnum settings = SettingsEnum.INSTANCE;
//        SettingsEnum settings1 = null;
//        // Constructor<SettingsEnum> constructor = SettingsEnum.class.getDeclaredConstructor();
//        Constructor<?>[] declaredConstructors = SettingsEnum.class.getDeclaredConstructor();
//        for (Constructor<?> constructor : declaredConstructors) {
//            constructor.setAccessible(true);
//            settings1 = (SettingsEnum) constructor.newInstance("INSTANCE");
//        }
//        System.out.println(settings == settings1);

        /* 직렬화 역직렬화 사용 */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SettingsEnum settings = SettingsEnum.INSTANCE;
        SettingsEnum settings1 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (SettingsEnum) in.readObject();
        }

        System.out.println(settings ==  settings1);
//    }
    }
    /*
    1. 자바에서 enum을 사용하ㅓ지 않고 싱글톤 패턴을 구현하는 방법?
        - private 생성자와 static 메서드를 사용하는 방법
    2. private 생성자와 static 매서드를 사용하는 방법의 단점?
        - private 생성자 :
        - static 생성자 :
    3. enum을 사용해 싱글톤 패턴을 구현하는 방법의 장점, 단점?
        - 장점 : 클래스 로딩 시점에 만들어
        - 단점 :
            - lazy initialzation(지연초기화:처음 해당 인스턴스를 요청할때 만들어짐)이 안된다
            - 1) 즉 인스턴스를 필요한 순간에 만드는 초기화 지연을 사용하지 못한다
            - 리소스에 민감한 애플리케이션인 경우에는 필요한 순간에 인스턴스를 만드는 초기화 지연을 선호
            - 2) 상속을 사용하지 못한다
    4. static inner 클래스를 사용해 싱글톤 패턴을 구현
    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance7() {
        return SettingsHolder.INSTANCE;
    }
    */
}
