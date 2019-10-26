package com.sandbox.java12;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import static java.time.DayOfWeek.*;

public class Java12Application {

    public void oldSwitchExpressions(DayOfWeek day) {
        String result = "";
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY: {
                result = "Weekday";
                break;
            }
            case SUNDAY:
            case SATURDAY: {
                result = "Weekend";
                break;
            }
        }

        System.out.println("Old Switch Result:");
        System.out.println(result);
    }

    public void newSwitchExpressions(DayOfWeek day){

//        String result = switch (day) {
//            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
//                break "Weekday";
//            }
//            case SUNDAY, SATURDAY -> {
//                break "Weekend";
//            }
//        };

       // System.out.println(result);
    }


}
