/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsharing.ejb;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rrabieyan
 */
@Entity
public class Fahrzeug implements Serializable{
    @Id
    @GeneratedValue
    private long id;
    
    @NotNull
    private String hersteller;
    
    @NotNull
    private String modell;
    
    @NotNull
    private String baujahr;
    
//<editor-fold defaultstate="collapsed" desc="Konstruktoren">
    public Fahrzeug(){}
    public Fahrzeug(String hersteller, String modell, String baujahr){
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getter und Setter">
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getHersteller() {
        return hersteller;
    }
    
    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }
    
    public String getModell() {
        return modell;
    }
    
    public void setModell(String modell) {
        this.modell = modell;
    }
    
    public String getBaujahr() {
        return baujahr;
    }
    
    public void setBaujahr(String baujahr) {
        this.baujahr = baujahr;
    }
//</editor-fold>
    
}
