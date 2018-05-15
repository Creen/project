package ru.store.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MENU")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private int menuId;

    @Column(name = "menu_name")
    private Target target;

    @Column
    private Days days;

    @Column
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "menu_dish_id")
    private Dish dish;

    @OneToMany(mappedBy = "menu")
    private List<User> user;

    public Menu() {
    }

    public Menu(Target target, Days days, Dish dish, List<User> user) {
        this.target = target;
        this.days = days;
        this.dish = dish;
        this.user = user;
    }


    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public Days getDays() {
        return days;
    }

    public void setDays(Days days) {
        this.days = days;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "target=" + target +
                ", days=" + days +
                ", dish=" + dish +
                ", user=" + user +
                '}';
    }
}
