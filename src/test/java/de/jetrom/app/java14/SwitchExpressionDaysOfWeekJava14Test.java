package de.jetrom.app.java14;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.*;

class SwitchExpressionDaysOfWeekJava14Test {

    @Test
    public void dayOfWeek() {
        assertEquals(5, SwitchExpressionDaysOfWeekJava14.dayOfWeek(DayOfWeek.FRIDAY));
        assertEquals(2, SwitchExpressionDaysOfWeekJava14.dayOfWeek(DayOfWeek.TUESDAY));
    }

    @Test
    public void  numberOfLetterDayOfWeek() {
        assertEquals(8, SwitchExpressionDaysOfWeekJava14.numberOfLettersDayOfWeek(DayOfWeek.SATURDAY));
        assertEquals(9, SwitchExpressionDaysOfWeekJava14.numberOfLettersDayOfWeek(DayOfWeek.WEDNESDAY));
    }

}