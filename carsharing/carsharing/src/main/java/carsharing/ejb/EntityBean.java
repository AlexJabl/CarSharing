/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsharing.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 */
public abstract class EntityBean<Entity, EntityId>{
    
    @PersistenceContext
    EntityManager em;

    private final Class<Entity> entityClass;
    
    public EntityBean(Class<Entity> entityClass) {
        this.entityClass = entityClass;
    }
    
}
