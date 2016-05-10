package br.ainur.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntitySingleton {
    
    private static EntityManager instancia;
    
    private EntitySingleton(){
         
    }
    
    public static synchronized EntityManager getInstance(){
        if(instancia == null){
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("hsqldb");
         
            instancia = factory.createEntityManager();
        }
        return instancia;
    }
}
