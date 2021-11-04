/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.OdkApprenant.demo.model.Formateur;
/**
 *
 * @author amagarai.guindo
 */
public interface FormateurRepository extends JpaRepository<Formateur, Integer>{
    
}
