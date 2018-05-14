package ru.store.dao;

import ru.store.domain.Dish;
import ru.store.domain.IngestionType;
import ru.store.domain.Menu;

import javax.persistence.EntityManager;
import java.util.List;

public class DishDaoImpl implements DishDAO  {

    private final EntityManager em;

    public DishDaoImpl(EntityManager em) {
        this.em = em;
    }


    public Dish createDish(IngestionType ingestionType, double kcal, double proteins, double fats, double carbohydrates, double price, List<Menu> menu) {
        return null;
    }

    public Dish updateDish(IngestionType ingestionType, double kcal, double proteins, double fats, double carbohydrates, double price, List<Menu> menu) {
        return null;
    }

    public void delete(int id) {

    }

    public Dish findById(int id) {
        return em.find(Dish.class, id);
    }
}
