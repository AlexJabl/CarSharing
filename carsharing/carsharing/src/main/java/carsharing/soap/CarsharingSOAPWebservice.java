/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsharing.soap;

import carsharing.ejb.FahrzeugBean;
import carsharing.ejb.KundeBean;
import carsharing.ejb.LeihvertragBean;
import carsharing.jpa.Fahrzeug;
import carsharing.jpa.Kunde;
import carsharing.jpa.Leihvertrag;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author ghoghnoos
 */
@WebService(servicename="Carsharing")
public class CarsharingSOAPWebservice {
    @EJB
    FahrzeugBean fahrzeugBean;
    @EJB
    KundeBean kundeBean;
    @EJB
    LeihvertragBean leihvertragBean;
    
    @WebMethod
    @WebResult(name="fahrzeug")
    public Fahrzeug createNewFahrzeug(@WebParam(name="fahrzeug")Fahrzeug fahrzeug){
        return fahrzeugBean.saveNew(fahrzeug);
    }
    
    @WebMethod
    @WebResult(name="fahrzeug")
    public List<Fahrzeug> findByStartBetween(
            @WebParam()Date beginnTimeFrom,
            @WebParam()Date endeTimeTo){
        return fahrzeugBean.findByStartBetween(beginnTimeFrom, endeTimeTo);
    }
    
    @WebMethod
    @WebResult(name="kunde")
    public Kunde createNewKunde(@WebParam(name="kunde")Kunde kunde){
        return kundeBean.saveNew(kunde);
    }
    
    @WebMethod
    @WebResult(name="kunde")
    public List<Kunde> getAllKunde(){
        return kundeBean.findAll();
    }
    
    @WebMethod
    @WebResult(name="leihvertrag")
    public Leihvertrag createNewLeihvertrag(@WebParam(name="leihvertrag")Leihvertrag leihvertrag){
        return leihvertragBean.saveNew(leihvertrag);
    }    
    
     @WebMethod
    @WebResult(name="fahrzeug")
    public List<Leihvertrag> getAllLeihvertrag(){
        return leihvertragBean.findAll();
    }
}
