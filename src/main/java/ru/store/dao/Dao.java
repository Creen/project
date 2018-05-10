package ru.store.dao;

public interface Dao<Entity, Key> {

    void create(Entity entity);
    void delete(Entity entity);
    void update(Entity entity);
    Entity read (Key key);

}
