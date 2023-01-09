package study.designpattern.creational_patterns.prototype.example;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student foo = new Student("foo");
        Student qoo = new Student("qoo");
        // 추상타입을 선언 - 유연한 구현체 선언 가능
        ArrayList<Student> students = new ArrayList<>();
        students.add(foo);
        students.add(qoo);
        System.out.println(students);

        // List 는 Cloneable 상속하고 있지 않음
        // 따라서 ArrayList Cloneable 상속하여 clone 해야 함
        ArrayList<Student> clone = (ArrayList<Student>)students.clone();
        System.out.println(clone);

        // ArrayList 의 clone 메서드는 일반적으로 많이 사용하지 않으므로 아래와 같이 사용을 추천
        List<Student> cloneList = new ArrayList<>(students);
        System.out.println(cloneList);

    }
}
