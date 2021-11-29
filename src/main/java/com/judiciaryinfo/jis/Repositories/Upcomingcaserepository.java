package com.judiciaryinfo.jis.Repositories;

import com.judiciaryinfo.jis.Models.Upcoming;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Upcomingcaserepository extends JpaRepository<Upcoming, Integer> {
    
}
