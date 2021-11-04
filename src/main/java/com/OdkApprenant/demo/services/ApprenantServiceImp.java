/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.model.Formateur;
import com.OdkApprenant.demo.model.liste_presence;
import com.OdkApprenant.demo.repositories.ApprenantRepository;
import com.OdkApprenant.demo.repositories.FormateurRepository;
import com.OdkApprenant.demo.repositories.ListeRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.hibernate.sql.Delete;
import org.springframework.stereotype.Service;

/**
 *
 * @author amagarai.guindo
 */

@Service
public class ApprenantServiceImp implements ApprenantService {
    
     ApprenantRepository apprenantRepository;
     FormateurRepository formateurRepository;
     ListeRepository listeRepository;
     public ApprenantServiceImp(ApprenantRepository apprenantRepository, FormateurRepository formateurRepository,ListeRepository listeRepository ){
    
        this.apprenantRepository = apprenantRepository;
        this.formateurRepository = formateurRepository;
        this.listeRepository= listeRepository;
     }

    @Override
    public List listApprenant() {
        return apprenantRepository.findAll();
    }

    @Override
    public String addApprenant(Apprenant apprenant) {
        this.apprenantRepository.save(apprenant);
        return "Vous avez ajoutee l'apprenant : "+apprenant.getNom_apprenant()+" "+apprenant.getPrenom_apprenant()+ " sous le login" +apprenant.getLogin();
     
    }

    @Override
    public String del_Apprenant(Integer id) {
      apprenantRepository.deleteById(id);
      return "vous avez supprimer l'apprenant"+ apprenantRepository.getById(id) ;
        
    }

    @Override
    public Apprenant lisById(Integer id) {
        return apprenantRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void Modifier_Apprenant(Integer id, Apprenant apprenant) {
        apprenantRepository.findById(id).get().setNom_apprenant(apprenant.getNom_apprenant());
        apprenantRepository.findById(id).get().setPrenom_apprenant(apprenant.getPrenom_apprenant());
        apprenantRepository.findById(id).get().setAge(apprenant.getAge());
        apprenantRepository.findById(id).get().setTelphone(apprenant.getTelphone());
        apprenantRepository.findById(id).get().setEmail_apprenant(apprenant.getEmail_apprenant());
        apprenantRepository.findById(id).get().setLogin(apprenant.getLogin());
        apprenantRepository.findById(id).get().setPassword(apprenant.getPassword());
        apprenantRepository.findById(id).get().setApprenantStatus(apprenant.getApprenantStatus());
        apprenantRepository.findById(id).get().setCreate_date(apprenant.getCreate_date());
        apprenantRepository.findById(id).get().setModify_date(apprenant.getModify_date());    
    }

    @Override
    public Optional<Apprenant> loginUser(String login, String password) {
       return apprenantRepository.getUserByLoginAndPassword(login, password);
    }

    //les differents implementations pour le formateur
    @Override
    public String addFormateur(Formateur formateur) {
        this.formateurRepository.save(formateur);
        return "succes ";
    }

    @Override
    public List ListFormateur() {
         return formateurRepository.findAll();
    }

    @Override
    public String del_form(Integer id) {
        formateurRepository.deleteById(id);
        return "vous avez supprimer le formateur"+ formateurRepository.getById(id) ;  
    }  

    @Override
    public void modify_form(Integer id, Formateur formateur) {
       formateurRepository.findById(id).get().setNom_form(formateur.getNom_form());
       formateurRepository.findById(id).get().setPrenom_form(formateur.getPrenom_form());
       formateurRepository.findById(id).get().setPhone_form(formateur.getPhone_form());
       formateurRepository.findById(id).get().setEmail(formateur.getEmail());
       formateurRepository.findById(id).get().setPassword(formateur.getPassword());  
    }

    //les differentes implementations de la liste de presence
    @Override
    public String validation(liste_presence liste) {
        this.listeRepository.save(liste);
        return "success";
    }

    @Override
    public List list_de_presence() {
       return listeRepository.findAll();
    }
    
    
}