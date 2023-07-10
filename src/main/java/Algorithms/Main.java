package Algorithms;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task_Aktivity_Dz> aktivity_dzs = Arrays.asList(
                new Task_Aktivity_Dz(9, 14),
                new Task_Aktivity_Dz(11, 15),
                new Task_Aktivity_Dz(10, 15),
                new Task_Aktivity_Dz(9, 11),
                new Task_Aktivity_Dz(9, 11),
                new Task_Aktivity_Dz(16, 17),
                new Task_Aktivity_Dz(10, 12));

        List<Task_Aktivity_Dz> activity = ActivitySchedule.scheduleActivity(aktivity_dzs);
        System.out.println("Schedule: ");
        for (Task_Aktivity_Dz taskAktivityDz : activity) {
            System.out.println("From " + taskAktivityDz.getStartTime() + " to " + taskAktivityDz.getEndTime());
        }
    }
}
