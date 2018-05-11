package ru.store.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER_BODY_INFO")
public class UserBodyInfo {

    @Column(name = "user_body_info_id", nullable = false)
    private int userBodyInfoId;

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

    public int getUserBodyInfoId() {
        return userBodyInfoId;
    }

    public void setUserBodyInfoId(int userBodyInfoId) {
        this.userBodyInfoId = userBodyInfoId;
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
        return "UserBodyInfo{" +
                "userBodyInfoId=" + userBodyInfoId +
                ", gender=" + gender +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", activity=" + activity +
                '}';
    }
}
