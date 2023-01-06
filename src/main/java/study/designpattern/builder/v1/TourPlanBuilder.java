package study.designpattern.builder.v1;

public interface TourPlanBuilder {

    TourPlanBuilder title(String title);

    TourPlanBuilder nightAndDay(int night, int day);
}
