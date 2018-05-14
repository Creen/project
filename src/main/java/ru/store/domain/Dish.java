package ru.store.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DISH")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private int dishId;

    @Column
    private IngestionType ingestionType;

    @Column
    private double kcal;

    @Column
    private double proteins;

    @Column
    private double fats;

    @Column
    private double carbohydrates;

    @Column(precision = 6, scale = 2)
    private double price;

    @OneToMany(mappedBy = "dish")
    private List<Menu> menu;

    public Dish() {
    }

    public Dish(int dishId, IngestionType ingestionType, double kcal, double proteins, double fats, double carbohydrates, double price, List<Menu> menu) {
        this.dishId = dishId;
        this.ingestionType = ingestionType;
        this.kcal = kcal;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.price = price;
        this.menu = menu;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    public IngestionType getIngestionType() {
        return ingestionType;
    }

    public void setIngestionType(IngestionType ingestionType) {
        this.ingestionType = ingestionType;
    }

    public double getKcal() {
        return kcal;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
