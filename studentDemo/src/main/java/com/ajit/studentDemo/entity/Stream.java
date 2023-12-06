package com.ajit.studentDemo.entity;

public enum Stream {
    ARTS("Arts"),
    COMMERCE("Commerce"),
    SCIENCE("Science");

    private final String displayValue;

    Stream(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
