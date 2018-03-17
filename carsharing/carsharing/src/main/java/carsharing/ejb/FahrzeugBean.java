/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsharing.ejb;

import carsharing.jpa.Fahrzeug;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author rrabieyan
 */
@Stateless
public class FahrzeugBean extends EntityBean<Fahrzeug, Long>{
    public FahrzeugBean(){
        super(Fahrzeug.class);
    }
    public List<Fahrzeug> findByStartBetween(Date beginnTimeFrom, Date endeTimeTo){
        return em.createQuery("Select f FROM Fahrzeug f"
                            +"WHERE f.beginnTime>= :startTimeFrom"
                            +"  AND f.endTimeTo <= :endeTime"
                            +"ORDER BY f.beginnTime")
                        .setParameter("beginnTimeFrom",beginnTimeFrom)
                        .setParameter("endTimeTo",endeTimeTo)
                        .getResultList();
    
    }
    
    
}
