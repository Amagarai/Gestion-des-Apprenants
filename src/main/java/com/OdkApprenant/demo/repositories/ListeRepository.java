/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.repositories;

import com.OdkApprenant.demo.model.liste_presence;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author amagarai.guindo
 */
public interface ListeRepository extends JpaRepository<liste_presence, Integer>{
    
}
