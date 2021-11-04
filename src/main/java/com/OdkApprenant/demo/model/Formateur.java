/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author amagarai.guindo
 */
@Entity
public class Formateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_form;
    String nom_form;
    String prenom_form;
    int phone_form;
    String email;
    String password;

    public Formateur() {
    }

    public Integer getId_form() {
        return id_form;
    }

    public void setId_form(Integer id_form) {
        this.id_form = id_form;
    }

    public String getNom_form() {
        return nom_form;
    }

    public void setNom_form(String nom_form) {
        this.nom_form = nom_form;
    }

    public String getPrenom_form() {
        return prenom_form;
    }

    public void setPrenom_form(String prenom_form) {
        this.prenom_form = prenom_form;
    }

    public int getPhone_form() {
        return phone_form;
    }

    public void setPhone_form(int phone_form) {
        this.phone_form = phone_form;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Formateur{" + "id_form=" + id_form + ", nom_form=" + nom_form + ", prenom_form=" + prenom_form + ", phone_form=" + phone_form + ", email=" + email + ", password=" + password + '}';
    }
    
}
