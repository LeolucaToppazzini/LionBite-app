package com.lionbite.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilityDao {

    //noi in app prima di settavamo entityManager nell app, mo lo facciamo qui in Dao

    private  static EntityManagerFactory factory;

    public static void  init(){
        factory = Persistence.createEntityManagerFactory("DefaultPersistenceUnit");
    }

    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
}
