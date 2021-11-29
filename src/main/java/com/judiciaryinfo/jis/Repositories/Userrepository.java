package com.judiciaryinfo.jis.Repositories;

import com.judiciaryinfo.jis.Models.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Userrepository extends JpaRepository<Users, Integer> {
    
    @Query("SELECT u FROM Users u WHERE u.email = :email")
    public Users getUserByUsername(@Param("email") String email);

    @Query("DELETE FROM Users u WHERE u.id = ?1")
    @Modifying
    public void deleteByUser(Integer userId);

}
