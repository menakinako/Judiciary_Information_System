package com.judiciaryinfo.jis.Repositories;

import java.util.List;

import com.judiciaryinfo.jis.Models.Pastcases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface Pastrepository extends JpaRepository<Pastcases, Integer> {
    
    @Query("SELECT p FROM Pastcases p WHERE p.pcasename LIKE %?1%"
    +  " OR p.pcasetype LIKE %?1%"
    + " OR CONCAT(p.cid, '') LIKE %?1%")
    public List<Pastcases> search(String keyword);
    
}
