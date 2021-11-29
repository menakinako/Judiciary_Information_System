package com.judiciaryinfo.jis;

import com.judiciaryinfo.jis.Models.Roles;
import com.judiciaryinfo.jis.Repositories.Rolerepository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace =  Replace.NONE)
@Rollback(false)
public class Rolerepositorytest {
    
    @Autowired
    private Rolerepository rolerepo;

    @Test
    public void testcreaterole(){

        Roles savedRoles = rolerepo.save(new Roles("Lawyer"));

        assertThat(savedRoles.getId()).isGreaterThan(0);

    }
}
