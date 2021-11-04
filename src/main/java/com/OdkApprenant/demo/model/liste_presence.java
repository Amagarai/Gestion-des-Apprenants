/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.model;
package com.OdkApprenant.demo.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author amagarai.guindo
 */

@Entity
public class liste_presence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_list;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date_list;
    
    @ManyToOne
    private Apprenant apprenant;

    //constructeur vide
    public liste_presence() {
    }
    //setter getter et toString
    

    public Integer getId_list() {
        return id_list;
    }

    public void setId_list(Integer id_list) {
        this.id_list = id_list;
    }

    public Date getDate_list() {
        return date_list;
    }

    public Apprenant getApprenant() {
        return apprenant;
    }

    public void setApprenant(Apprenant apprenant) {
        this.apprenant = apprenant;
    }
    
    public void setDate_list(Date date_list) {
        this.date_list = date_list;
    }

    @Override
    public String toString() {
        return "liste_presence{" + "id_list=" + id_list + ", date_list=" + date_list + '}';
    }
    
}