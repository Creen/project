package ru.store.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "KILOCALORIES")
public class Kilocalories {

    @Column(name = "kcal", nullable = false)
    private int kcalId;

    @Column
    private boolean gender;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private double height;

    @Column(nullable = false)
    private double weight;

    @Column(name = "Activity")
    private Activity activity;

    public int getKcalId() {
        return kcalId;
    }

    public void setKcalId(int kcalId) {
        this.kcalId = kcalId;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Kilocalories{" +
                "kcalId=" + kcalId +
                ", gender=" + gender +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", activity=" + activity +
                '}';
    }
}
