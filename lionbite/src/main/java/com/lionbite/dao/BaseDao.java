package com.lionbite.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class BaseDao {
	private static EntityManagerFactory factory;
	//essendo che è protetta le sottoclassi possono vedere l'entityManager
	protected EntityManager entityManager;

	BaseDao() {
		entityManager = factory.createEntityManager();
	}

	public void close() {
		entityManager.close();
	}
	//get usa i generics:
	//metodo get per caricare un record in base al suo id
	//<T> definiamo il tipo t e grazie a questo posso 1 tipizzare la classe e 2 come parametro di output del metodo get
	public <T> T get(Class<T> entityClass, Long id) {
		return entityManager.find(entityClass, id);
	}

	public <T> List<T> getAll(Class<T> entityClass) {
		String query = "select e from " + entityClass.getName() + " e";
		return entityManager.createQuery(query, entityClass).getResultList();
	}

	public void save(Object entity) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive() || entityManager.getTransaction().getRollbackOnly()) {
				entityManager.getTransaction().rollback();
			}
		}
	}

	public void remove(Object entity) {
		try {
			entityManager.getTransaction().begin();
			entityManager.remove(entity);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive() || entityManager.getTransaction().getRollbackOnly()) {
				entityManager.getTransaction().rollback();
			}
		}
	}

	public static void initFactory() {
		factory = Persistence.createEntityManagerFactory("DefaultPersistenceUnit");
	}

	public static void shutdownFactory() {
		if (factory != null && factory.isOpen()) {
			factory.close();
		}
	}
}
