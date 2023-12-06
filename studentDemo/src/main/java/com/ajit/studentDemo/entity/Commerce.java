package com.ajit.studentDemo.entity;

public enum Commerce {
    ACCOUNTANCY("Accountancy"),
    ECONOMICS("Economics"),
    BUSINESS_STUDIES("Business Studies"),
    STATISTICS("Statistics"),
    MATHEMATICS_AND_INFORMATICS_PRACTICES("Mathematics and Informatics Practices")
    ;
    private final String displayValue;

    Commerce(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
