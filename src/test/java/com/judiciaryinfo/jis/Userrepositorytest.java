package com.judiciaryinfo.jis;

import static org.junit.jupiter.api.Assertions.assertTrue;


import com.judiciaryinfo.jis.Models.Users;
import com.judiciaryinfo.jis.Repositories.Userrepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace =  Replace.NONE)
@Rollback(false)
public class Userrepositorytest {

    @Autowired
    private Userrepository repo;

    

    @Test
    public void testcreateuser(){
      

       Users user = new Users();
       user.setFullName("Sasmita Parhi");
       user.setEmail("sasmita@gmail.com");
       user.setPassword("parhi87");
      
  
         Users saveuser = repo.save(user);
         assertTrue(saveuser.getId() > 0);
    }

}
