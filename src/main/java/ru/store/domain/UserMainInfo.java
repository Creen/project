package ru.store.domain;

import javax.persistence.*;

@Entity
@Table(name = "USERS_INFO")
public class UserMainInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_info_id")
    private int userInfoId;

    @Column(length = 40, nullable = false)
    private String firstname;

    @Column(length = 40, nullable = false)
    private String lastname;

    @Column(length = 12)
    private String phone;

    @Column(length = 40)
    private String email;

    @Column
    private String adress;

    @OneToOne(mappedBy = "userInfo")
    private User user;

    public int getUserInfiId() {
        return userInfoId;
    }

    public void setUserInfiId(int userInfiId) {
        this.userInfoId = userInfiId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    @Override
    public String toString() {
        return "UserMainInfo{" +
                "userInfoId='" + userInfoId + '\'' +
                ", name='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                ", user=" + user +
                '}';
    }
}
