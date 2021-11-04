/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.controllers;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.model.Formateur;
import com.OdkApprenant.demo.model.liste_presence;
import com.OdkApprenant.demo.services.ApprenantServiceImp;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author amagarai.guindo
 */

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api")
public class ApprenantController {
    
    ApprenantServiceImp apprenantServiceImp;

    public ApprenantController(ApprenantServiceImp apprenantServiceImp){
    
        this.apprenantServiceImp = apprenantServiceImp;
    }
    
    @GetMapping("/listing")
    public List<Apprenant> getListApprenants()
    {
        return this.apprenantServiceImp.listApprenant();
    }
    
    @PostMapping("/add")
    public String addApprenant(@RequestBody Apprenant apprenant)
    {
        return this.apprenantServiceImp.addApprenant(apprenant);
    }
    
    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public String del_Apprenant(@PathVariable Integer id){
        
        return this.apprenantServiceImp.del_Apprenant(id);
    }
    
    @GetMapping("/listId/{id}")
    public Apprenant lisById(@PathVariable Integer id){
    return this.apprenantServiceImp.lisById(id);
}
    @PatchMapping("/modifier/{id}")
    public void Modifier_Apprenant(@PathVariable Integer id, @RequestBody Apprenant apprenant){
        this.apprenantServiceImp.Modifier_Apprenant(id, apprenant);
    }
     
    @GetMapping("/auth/login={login}&password={password}")
    public Optional<Apprenant> loginUser(@PathVariable String login,@PathVariable String password){
      return  this.apprenantServiceImp.loginUser(login, password);
    }
    
    //partie pour le formateur
    @GetMapping("/list_form")
    public List<Formateur> getListFormateur()
    {
        return this.apprenantServiceImp.ListFormateur();
    }
    
    @PostMapping("/add_form")
    public String addFormateur(@RequestBody Formateur form)
    {
        return this.apprenantServiceImp.addFormateur(form);
    }
    
    @DeleteMapping("/delete_form/{id}")
    @ResponseBody
    public String del_Formateur(@PathVariable Integer id){
        
        return this.apprenantServiceImp.del_form(id);
    }
    
    @PatchMapping("/modif_form/{id}")
    public void modigy_form(@PathVariable Integer id, @RequestBody Formateur formateur){
        this.apprenantServiceImp.modify_form(id, formateur);
    }
    
    //partie pour la liste
    @PostMapping("/valid")
    public String validation(@RequestBody liste_presence liste)
    {
        return this.apprenantServiceImp.validation(liste);
    }
    
    @GetMapping("/list_presence")
    public List<liste_presence> displayList()
    {
        return this.apprenantServiceImp.list_de_presence();
    }
}
