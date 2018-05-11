package ru.store.domain;

public enum Activity {

    PASSIVE(1.26),
    AVERAGE(1.45),
    INCREASED(1.54),
    HIGH(1.63),
    EXTREME(1.73);

    public double activityCoefficient;

    Activity(double activityCoefficient) {
        this.activityCoefficient = activityCoefficient;
    }
}
