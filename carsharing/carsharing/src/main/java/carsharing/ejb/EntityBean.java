/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsharing.ejb;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class EntityBean<Entity, EntityId> {
    @PersistenceContext
    EntityManager em;

    private final Class<Entity> entityClass;

    
    public EntityBean(Class<Entity> entityClass){
        this.entityClass=entityClass;
    }
    
    public Entity findById(EntityId id){
        if(id==null){
            return null;
        }
        return em.find(entityClass, id);
    }
    
    public List<Entity> findAll(){
        String select="SELECT e FROM $E e".replace("$E", this.entityClass.getName());
        return em.createQuery(select).getResultList();
    }
    
    public Entity saveNew(Entity entity){
        em.persist(entity);
        return em.merge(entity);
    }
    
    public Entity update(Entity entity){
        return em.merge(entity);
    }
    
    public void delete(Entity entity){
        em.remove(em.merge(entity));
    }
      
}
