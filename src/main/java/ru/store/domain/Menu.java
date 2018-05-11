package ru.store.domain;


import javax.persistence.*;

@Entity
@Table(name = "MENU")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private String menuId;

    //до запятой 6 знаков, после запятой 2 знака,
    @Column(precision = 6, scale = 2)
    private double price;

    @Column(length = 150)
    private String text;

    @Column
    @Enumerated(value = EnumType.STRING)
    private MenuType menuType;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id")
    private User user;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MenuType getMenuType() {
        return menuType;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId='" + menuId + '\'' +
                ", price='" + price + '\'' +
                ", text='" + text + '\'' +
                ", menuType=" + menuType +
                ", user=" + user +
                '}';
    }
}
