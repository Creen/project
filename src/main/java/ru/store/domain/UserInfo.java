package ru.store.domain;

import javax.persistence.*;

@Entity
@Table(name = "USERS_INFO")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_info_id")
    private String userInfoId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastname;
    @Column
    private String phone;
    @Column
    private String email;
    @Column
    private String adress;

    @OneToOne(mappedBy = "userInfo")
    private User user;

    public String getUserInfiId() {
        return userInfoId;
    }

    public void setUserInfiId(String userInfiId) {
        this.userInfoId = userInfiId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
