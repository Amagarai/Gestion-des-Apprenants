package com.OdkApprenant.demo;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.repositories.ApprenantRepository;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OdkApprenantApplicationTests {

@Autowired
private ApprenantRepository apprenantRepository;

@Test
public void CreateApprenant() {
    
Apprenant apprenant = new Apprenant();


apprenantRepository.save(apprenant);
}


}
