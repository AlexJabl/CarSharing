/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsharing.jpa;

import carsharing.jpa.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rrabieyan
 */
@Entity
public class Kunde implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    
    @NotNull
    private String vorname;
    
    @NotNull
    private String nachname;
    
    @NotNull
    private String strasse;
    
    @NotNull
    private String hausnummer;
    
    @NotNull
    private int postleitzahl;
    @NotNull
    private String ort;
    @NotNull
    private String land;
    @OneToMany
    List<Leihvertrag> leihvertraege= new ArrayList<>();
    
    
//<editor-fold defaultstate="collapsed" desc="Konstruktoren">
    public Kunde(){}
    public Kunde(String vorname, String nachname, String strasse, String hausnummer, int postleitzahl, String ort, String land, Leihvertrag leihvertraege ){
        this.vorname = vorname;
        this.nachname = nachname;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.ort = ort;
        this.land = land;
        this.leihvertraege=(List<Leihvertrag>) leihvertraege;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getter und Setter">
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getVorname() {
        return vorname;
    }
    
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    
    public String getNachname() {
        return nachname;
    }
    
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    
    public String getStrasse() {
        return strasse;
    }
    
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }
    
    public String getHausnummer() {
        return hausnummer;
    }
    
    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }
    
    public int getPostleitzahl() {
        return postleitzahl;
    }
    
    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }
    
    public String getOrt() {
        return ort;
    }
    
    public void setOrt(String ort) {
        this.ort = ort;
    }
    
    public String getLand() {
        return land;
    }
    
    public void setLand(String land) {
        this.land = land;
    }
    
    public List<Leihvertrag> getLeihvertraege() {
        return leihvertraege;
    }
    
    public void setLand(List<Leihvertrag> leihvertraege) {
        this.leihvertraege = leihvertraege;
    }
//</editor-fold> 

}
