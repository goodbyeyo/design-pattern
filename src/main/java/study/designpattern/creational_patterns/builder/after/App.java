package study.designpattern.creational_patterns.builder.after;

import study.designpattern.creational_patterns.builder.before.TourPlan;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan japanTrip = director.japanTrip();
        TourPlan hawaiiTrip = director.hawaiiTrip();

    }
}
