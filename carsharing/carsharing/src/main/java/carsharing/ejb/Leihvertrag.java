/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsharing.ejb;

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
public class Leihvertrag {
    @Id
    @GeneratedValue
    private long id;
    
    @NotNull
    private int kundenId;
    @NotNull
    private int fahrzeugId;
    
    @NotNull
    private Date beginndatum;
    @NotNull
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endedatum;
    
    
}
