package ru.store.domain;

public enum LevelActivity {

    PASSIVE("Passive lifestyle"),
    AVERAGE("Easy exercise 1-3 times a week"),
    INCREASED("Active workout 3-5 times a week"),
    HIGH("Heavy physical activity 6-7 times a week"),
    EXTREME("Intensive training 2 times a day");

    public String activityCoefficient;

    LevelActivity(String activityCoefficient) {
        this.activityCoefficient = activityCoefficient;
    }

    public String getActivityCoefficient() {
        return activityCoefficient;
    }
}
