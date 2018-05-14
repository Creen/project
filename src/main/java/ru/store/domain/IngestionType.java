package ru.store.domain;

public enum IngestionType {

    BREAKFAST("Breakfast"),
    BRUNCH("Brunch"),
    LUNCH("Lunch"),
    DINNER("Dinner"),
    SUPPER("Supper");

    public String ingestionType;

    IngestionType(String ingestionType) {
        this.ingestionType = ingestionType;
    }


}
