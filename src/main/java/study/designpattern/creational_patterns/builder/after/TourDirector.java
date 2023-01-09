package study.designpattern.creational_patterns.builder.after;

import study.designpattern.creational_patterns.builder.before.TourPlan;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan japanTrip() {
        return tourPlanBuilder
                .title("japan tour")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2023, 1, 10))
                .whereToStay("seoul")
                .addPlan(0, "후쿠도카 도착")
                .addPlan(0, "유후인 숙소 도착")
                .getPlan();
    }

    public TourPlan hawaiiTrip() {
        return tourPlanBuilder
                .title("hawaii tour")
                .startDate(LocalDate.of(2023, 1, 30))
                .getPlan();
    }
}
