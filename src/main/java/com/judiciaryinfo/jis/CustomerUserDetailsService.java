package com.judiciaryinfo.jis;

import com.judiciaryinfo.jis.Models.CustomerUserDetails;
import com.judiciaryinfo.jis.Models.Users;
import com.judiciaryinfo.jis.Repositories.Userrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomerUserDetailsService implements UserDetailsService {

    @Autowired
    private Userrepository repo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        Users user = repo. getUserByUsername( email);
        if(user == null){
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomerUserDetails(user);
    }
    
}
