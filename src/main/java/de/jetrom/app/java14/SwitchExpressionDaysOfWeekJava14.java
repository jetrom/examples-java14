package de.jetrom.app.java14;

import java.time.DayOfWeek;

public class SwitchExpressionDaysOfWeekJava14 {

    public static int dayOfWeek(DayOfWeek dayOfWeek) {

        // switch expression witzh return value
        return switch (dayOfWeek) {
            case MONDAY -> 1;
            case TUESDAY -> 2;
            case WEDNESDAY -> 3;
            case THURSDAY -> 4;
            case FRIDAY -> 5;
            case SATURDAY -> 6;
            case SUNDAY -> 7;
        };
    }
    public static int numberOfLettersDayOfWeek(DayOfWeek dayOfWeek) {

        // switch expression with return value
        return switch (dayOfWeek) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
        };
    }
}
