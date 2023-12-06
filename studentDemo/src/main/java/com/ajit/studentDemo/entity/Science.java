package com.ajit.studentDemo.entity;

public enum Science {
    PHYSICS("Physics"),
    CHEMiSTRY("Chemistry"),
    MATHEMATICS("Mathematics"),
    BIOLOGY("Biology"),
    INFORMATION_TECHNOLOGY("Information Technology"),
    COMPUTER_SCIENCE("Computer Science"),
    ELECTRICAL("Electrical"),
    ELECTRONICS("Electronics")
    ;
    private final String displayValue;

    Science(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
