package com.lionbite;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;


public class App 
{
    public static void main( String[] args ) {

        Persistence.createEntityManagerFactory("DefaultPersistenceUnit");
    }



}
