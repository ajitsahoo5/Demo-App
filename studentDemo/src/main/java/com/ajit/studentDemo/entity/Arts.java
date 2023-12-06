package com.ajit.studentDemo.entity;

public enum Arts {
    HISTORY("History"),
    GEOGRAPHY("Geography"),
    ECONOMICS("Economics"),
    EDUCATION("Economics"),
    POLITICAL_SCIENCE("Political Science");

    private final String displayValue;

    Arts(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
