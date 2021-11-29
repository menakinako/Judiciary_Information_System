package com.judiciaryinfo.jis.Services;

import java.util.List;

import com.judiciaryinfo.jis.Models.Pastcases;
import com.judiciaryinfo.jis.Repositories.Pastrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Pastservice {
    
    @Autowired
    Pastrepository prepo;

    public List<Pastcases> listAll(String keyword){

        if(keyword != null){
           return prepo.search(keyword);
         }
        return prepo.findAll();
    }
}
