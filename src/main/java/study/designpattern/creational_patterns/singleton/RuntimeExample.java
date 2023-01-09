package study.designpattern.creational_patterns.singleton;

public class RuntimeExample {
    // new 로는 생성할수 없다(singleton)
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("runtime = " + runtime.maxMemory());
        System.out.println("runtime = " + runtime.freeMemory());
    }

    /*
    // singleton, thread safe
    private static final Runtime currentRuntime = new Runtime();
    public static Runtime getRuntime() {
        return currentRuntime;
    }
    private Runtime() {}
    */



}
