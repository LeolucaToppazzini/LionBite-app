package com.lionbite.dao;

import com.lionbite.model.LionBox;
import com.lionbite.model.User;

import javax.persistence.EntityManager;
import java.util.List;

public class BoxDao {
    private EntityManager entityManager;

    public List<LionBox> getAll() {
        String query = "select c from " + LionBox.class + " c order by c.prezzo";
        return entityManager.createQuery(query, LionBox.class).getResultList();
    }

    public BoxDao() {
        entityManager = UtilityDao.getEntityManager();
    }

    public User get(Long id){
        return entityManager.find(User.class, id);
    }

    public void save(LionBox lionBox){
        try {

            entityManager.getTransaction().begin();
            entityManager.persist(lionBox);
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
