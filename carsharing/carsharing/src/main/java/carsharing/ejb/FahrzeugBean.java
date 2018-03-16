/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsharing.ejb;

import carsharing.jpa.Fahrzeug;

/**
 *
 * @author rrabieyan
 */
public class FahrzeugBean extends EntityBean<Fahrzeug, Long>{
    public FahrzeugBean(){
        super(Fahrzeug.class);
    }
    
    
}
