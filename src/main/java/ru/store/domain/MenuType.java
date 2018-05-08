package ru.store.domain;

public enum MenuType {

    FIT("Fit"),
    POWER("Power"),
    BALENCE("Balance"),
    DAILY("Daily"),
    VEGAN("Vegan"),
    PERSONAL("Personal");

    public String menuType;

    MenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getMenuType() {
        return menuType;
    }
}

