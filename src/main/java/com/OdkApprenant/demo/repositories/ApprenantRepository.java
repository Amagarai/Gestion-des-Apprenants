/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.repositories;

import com.OdkApprenant.demo.model.Apprenant;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;




/**
 *
 * @author amagarai.guindo
 */
public interface ApprenantRepository extends JpaRepository<Apprenant, Integer > {

    Optional<Apprenant> getUserByLoginAndPassword(@Param ("login")String login, @Param ("password")String password);
    
}
