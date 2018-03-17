/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsharing.jpa;

import carsharing.jpa.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rrabieyan
 */
@Entity
public class Leihvertrag implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    
    @NotNull
    private int kundenId;
    @NotNull
    private int fahrzeugId;
    
    @NotNull
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date beginndatum;
    
    @NotNull
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endedatum;
    
//<editor-fold defaultstate="collapsed" desc="Konstruktoren">
    public Leihvertrag(){}
    public Leihvertrag(int kundenId, int fahrzeugId, Date beginndatum, Date endedatum){
        this.kundenId = kundenId;
        this.fahrzeugId = fahrzeugId;
        this.beginndatum = beginndatum;
        this.endedatum = endedatum;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getter und Setter">
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public int getKundenId() {
        return kundenId;
    }
    
    public void setKundenId(int kundenId) {
        this.kundenId = kundenId;
    }
    
    public int getFahrzeugId() {
        return fahrzeugId;
    }
    
    public void setFahrzeugId(int fahrzeugId) {
        this.fahrzeugId = fahrzeugId;
    }
    
    public Date getBeginndatum() {
        return beginndatum;
    }
    
    public void setBeginndatum(Date beginndatum) {
        this.beginndatum = beginndatum;
    }
    
    public Date getEndedatum() {
        return endedatum;
    }
    
    public void setEndedatum(Date endedatum) {
        this.endedatum = endedatum;
    }
//</editor-fold>

}
