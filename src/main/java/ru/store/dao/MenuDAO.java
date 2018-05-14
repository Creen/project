package ru.store.dao;

import ru.store.domain.*;

import javax.persistence.EntityManager;
import java.util.List;

public interface MenuDAO {

    Menu createMenu(Target target, Days days, Dish dish, List<User> user);

    Menu updateMenu(Target target, Days days, Dish dish, List<User> user);


}
