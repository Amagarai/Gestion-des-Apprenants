/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.model.Formateur;
import com.OdkApprenant.demo.model.liste_presence;
import java.util.List;
import java.util.Optional;


/**
 *
 * @author amagarai.guindo
 */

public interface ApprenantService {
    //les methodes pour l'apprenant 
    public abstract List listApprenant();
    public abstract String addApprenant(Apprenant apprenant);
    public abstract String del_Apprenant(Integer id);
    public abstract Apprenant lisById(Integer id);
    public abstract void Modifier_Apprenant(Integer id,Apprenant apprenant);
    public abstract Optional<Apprenant> loginUser(String login, String password);
    
    //le methode pour le formateur
    public abstract String addFormateur(Formateur formateur);
    public abstract List ListFormateur();
    public abstract String del_form(Integer id);
    public abstract void modify_form(Integer id, Formateur formateur);
    
    //les methode pour la liste de presence
    public abstract String validation(liste_presence liste);
    public abstract List list_de_presence();
}
