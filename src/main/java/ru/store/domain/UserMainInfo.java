package ru.store.domain;

import javax.persistence.*;

@Entity
@Table(name = "USERS_INFO")
public class UserMainInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_main_info_id")
    private int userMainInfoId;

    @Column(length = 40, nullable = false)
    private String firstname;

    @Column(length = 40, nullable = false)
    private String lastname;

    @Column(length = 12)
    private String phone;

    @Column(length = 40)
    private String email;

    @Column
    private String address;

    @OneToOne(mappedBy = "userMainInfo")
    private User user;

    public UserMainInfo() {
    }

    public UserMainInfo(String firstname, String lastname, String phone, String email, String address, User user) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.user = user;
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
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
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
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                '}';
    }
}
