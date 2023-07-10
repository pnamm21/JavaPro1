package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_Aktivity_Dz {
    private int startTime;
    private int endTime;

    public Task_Aktivity_Dz(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}
//Задача: максимальная выгода от активностей, второстепенно заполняемость по времени
//        зал для конференций работает с 9:00 до 17:00
//        час с 9:00 до 13:00 стоит 1 единицу
//        час с 13:00 до 17:00 стоит 2 единицы

//        например с 11 до 14 стоит 2 + 2 = 4 ед

//        например с 12 до 16 стоит 1 + 6 = 7 ед
class ActivitySchedule {
    private static final int morning_h = 9;
    private static final int morning_end_hour = 13;
    private static final int afternoon_h = 13;
    private static final int afternoon_end_h = 17;
    private static final int morning_cost = 1;
    private static final int afternoon_cost = 2;

    public static List<Task_Aktivity_Dz> scheduleActivity(List<Task_Aktivity_Dz> taskAktivityDzs) {
        Collections.sort(taskAktivityDzs, (el1, el2) -> el1.getEndTime() - el2.getEndTime());
        List<Task_Aktivity_Dz> scheduleActivity = new ArrayList<>();
        int h = morning_h;
        int cost = 0;

        for (Task_Aktivity_Dz task : taskAktivityDzs) {
            if (task.getStartTime() >= h && task.getEndTime() <= morning_end_hour) {
                scheduleActivity.add(task);
                cost += morning_cost;
                h = task.getEndTime();
            } else if (task.getStartTime() >= h && task.getEndTime() <= afternoon_end_h) {
                scheduleActivity.add(task);
                cost += afternoon_cost;
                h = task.getEndTime();
            }
        }
        System.out.println("Total cost -> " + cost);
        return scheduleActivity;
    }

}

