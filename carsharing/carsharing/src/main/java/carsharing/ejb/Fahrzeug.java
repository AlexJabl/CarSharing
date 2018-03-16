/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsharing.ejb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rrabieyan
 */
@Entity
public class Fahrzeug {
    @Id
    @GeneratedValue
    private long id;
    
    @NotNull
    private String hersteller;
    
    @NotNull
    private String modell;
    
    @NotNull
    private String baujahr;
    public Fahrzeug(){}
    public Fahrzeug(String hersteller, String modell, String baujahr){}
    
    
}
