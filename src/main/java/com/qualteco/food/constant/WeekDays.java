package com.qualteco.food.constant;

import java.io.Serializable;

public enum WeekDays implements Serializable {
    Sunday("Sunday"),
    Monday("Monday"),
    Tuesday("Tuesday"),
    Wednesday("Wednesday"),
    Thrusday("Thrusday"),
    Friday("Friday"),
    Saturday("Saturday");


    private String day;

    WeekDays(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

/*
    public final String label;

    private Element(String label) {
        this.label = label;
    }

*/



}
