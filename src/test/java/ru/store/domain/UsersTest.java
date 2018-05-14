package ru.store.domain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UsersTest {

    private EntityManagerFactory emf;
    private EntityManager em;

    @Before
    public void setup(){
        emf = Persistence.createEntityManagerFactory("TestPersistenceUnit");
        em = emf.createEntityManager();

    }

    @Test
    public void testCreateUser(){
        User user = new User("Nikolai", "12345");
        em.persist(user);
    }

    @After
    public void end(){
        em.close();
        emf.close();
    }







}
