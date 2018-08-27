package com.m2i.poe.media;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

    private static EntityManager em = null;
    private static EntityManagerFactory emf = null;

    private EntityManagerFactorySingleton() {}

    public static EntityManagerFactory getEntityManagerFactory() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory("FormationJPA");
        }
        return emf;
    }

    public static EntityManager getEntityManager() {
        if(em == null) {
            em = getEntityManagerFactory().createEntityManager();
        }
        return em;
    }
}
