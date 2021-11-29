package com.judiciaryinfo.jis.Services;

import javax.transaction.Transactional;

import com.judiciaryinfo.jis.Models.Users;
import com.judiciaryinfo.jis.Repositories.Userrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Userservice {

    @Autowired
    Userrepository repo;

    public Users registeruser(Users user)
    {
        BCryptPasswordEncoder  encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        

        return repo.save(user);
    }
    
    public void removeuser(Integer id){
        repo.deleteByUser(id);
    
    }
}
