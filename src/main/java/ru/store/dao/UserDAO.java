package ru.store.dao;

import ru.store.domain.User;

import java.util.List;

public interface UserDAO {

    User createUser(String login, String password);

    User updateUser(String login, String password);

    void delete(int id);

    User findById(int id);

    List<User> findAllUsers();


}
