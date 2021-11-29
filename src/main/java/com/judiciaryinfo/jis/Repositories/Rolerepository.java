package com.judiciaryinfo.jis.Repositories;

import com.judiciaryinfo.jis.Models.Roles;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Rolerepository extends JpaRepository<Roles, Integer> {
    
}
