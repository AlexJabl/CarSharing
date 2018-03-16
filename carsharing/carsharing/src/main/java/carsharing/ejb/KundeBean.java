/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsharing.ejb;

/**
 * EJB mit den üblichen Methoden zum Lesen und Schreiben von Fernsehsendern.
 */
public class KundeBean extends EntityBean<Kunde, String> {

    public KundeBean() {
        super(Kunde.class);
    }
    
}
