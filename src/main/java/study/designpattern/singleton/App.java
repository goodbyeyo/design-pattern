package study.designpattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
//    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
public static void main(String[] args) throws IOException {
}
//        Settings settings = new Settings();
//        Settings settings1 = new Settings();
//        Settings settings = Settings.getInstance();
//        Settings settings1 = Settings.getInstance();
//        System.out.println(settings == settings1);

//        Settings settings = Settings.getInstance();
//        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Settings settings1 = constructor.newInstance();
//        System.out.println(settings == settings1);

        Settings settings = Settings.getInstance();
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream(name:"settings.obj"))) {
            out.writeObject(settings);
        }

        try(ObjectInput in = new ObjectInputStream(new FileInputStream(name:"settings.ojb"))) {
            settings1 = (Settings)in.readObject();
        }

}
