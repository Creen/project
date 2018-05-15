package ru.store.domain;

import javax.persistence.*;

@Entity
@Table(name = "USER_PARAMETERS")
public class UserParameters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_parameters_id")
    private int userParametersId;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private double height;

    @Column(nullable = false)
    private double weight;

    @Column(nullable = false)
    private LevelActivity levelActivity;

    @OneToOne(mappedBy = "userParameters")
    private User user;

    public UserParameters() {
    }

    public UserParameters(String gender, int age, double height, double weight, LevelActivity levelActivity, User user) {
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.levelActivity = levelActivity;
        this.user = user;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
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

    public LevelActivity getLevelActivity() {
        return levelActivity;
    }

    public void setLevelActivity(LevelActivity levelActivity) {
        this.levelActivity = levelActivity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
