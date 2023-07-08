package Algorithms;

import java.util.*;
import java.util.stream.Collectors;

public class Activity_Hadnii_Algorithm {

    public static void activity(List<Activity> activityList){
        List<Activity> collect = activityList.stream()
                .filter(el->el.getStart()>=0&&el.getFinish()<=10)
                .sorted(Comparator.comparingInt(el->el.getFinish()-el.getStart()))
                .collect(Collectors.toList());
        System.out.println(Collections.unmodifiableList(collect));

        List<Activity> schedule = new ArrayList<>();
        for (Activity activity : collect) {
            if (isActivityFitInSchedule(schedule, activity)) {
                schedule.add(activity);
            }
        }
        System.out.println(Collections.unmodifiableList(schedule));
    }
    public static boolean isActivityFitInSchedule(List<Activity> schedule,Activity activity){
        return schedule.stream()
                .noneMatch(act->act.getStart()<=activity.getStart()
                        &&act.getFinish()>= activity.getStart()
                        ||act.getFinish()>= act.getFinish()
                        &&act.getStart()<=activity.getFinish());
    }
    public static void main(String[] args) {
        List<Activity> activityList = new ArrayList<>();
        activityList.add(new Activity("a",1,4));
        activityList.add(new Activity("b",1,7));
        activityList.add(new Activity("c",2,4));
        activityList.add(new Activity("d",5,9));
        activityList.add(new Activity("e",4,6));
        activityList.add(new Activity("f",7,8));

        System.out.println(activityList);
        activity(activityList);
    }
}
class Activity{
    private String str;
    private int start;
    private int finish;

    public Activity(String str, int start, int finish) {
        this.str = str;
        this.start = start;
        this.finish = finish;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getFinish() {
        return finish;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "str='" + str + '\'' +
                ", start=" + start +
                ", finish=" + finish +
                '}';
    }
}
