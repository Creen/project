package ru.store.domain;

public enum Target {

    FIT("Lose weight"),
    POWER("Increase muscle mass"),
    BALENCE("Balanced nutrition to maintain form");

    public String  menuType;

    Target(String  menuType) {
        this.menuType = menuType;
    }

    public String  getMenuType() {
        return menuType;
    }
}

