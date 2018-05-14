package ru.store.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(length = 40, unique = true, nullable = false)
    private String login;

    @Column(length = 20, nullable = false)
    private String password;

    @OneToOne(optional = false, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_main_info_id")
    private UserMainInfo userMainInfo;

    @OneToOne(optional = false, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_parameters_id")
    private UserParameters userParameters;

    @ManyToOne(optional = false, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_menu_id")
    private Menu menu;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserMainInfo getUserMainInfo() {
        return userMainInfo;
    }

    public void setUserMainInfo(UserMainInfo userMainInfo) {
        this.userMainInfo = userMainInfo;
    }

    public UserParameters getUserParameters() {
        return userParameters;
    }

    public void setUserParameters(UserParameters userParameters) {
        this.userParameters = userParameters;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
