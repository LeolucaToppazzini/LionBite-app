package com.lionbite.dao;

import com.lionbite.model.User;

import javax.persistence.EntityManager;

public class UserDao {
    private EntityManager entityManager;

    public UserDao() {
        entityManager = UtilityDao.getEntityManager();
    }

    public User get(Long id){
        return entityManager.find(User.class, id);
    }

    public void save(User user){
        try {

            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
        } catch (Exception e){
            if (entityManager.getTransaction().isActive() || entityManager.getTransaction().getRollbackOnly()) {

                entityManager.getTransaction().rollback();
            }
        }
    }

    public  void  close(){
        entityManager.close();
    }
}
