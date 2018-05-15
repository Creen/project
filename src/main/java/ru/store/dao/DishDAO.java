package ru.store.dao;

import ru.store.domain.Dish;
import ru.store.domain.IngestionType;
import ru.store.domain.Menu;

import java.util.List;

public interface DishDAO {

    Dish createDish(IngestionType ingestionType, double kcal, double proteins, double fats, double carbohydrates, double price);

    Dish updateDish(IngestionType ingestionType, double kcal, double proteins, double fats, double carbohydrates, double price);

    void delete(int id);

    Dish findById(int id);

}
