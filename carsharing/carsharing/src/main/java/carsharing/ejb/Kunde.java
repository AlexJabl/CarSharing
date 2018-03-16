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
public class Kunde {
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
    public Kunde(){}
    public Kunde(String vorname, String nachname, String strasse, String hausnummer, int postleizahl, String ort, string land ){}
    
    
    
    
}
