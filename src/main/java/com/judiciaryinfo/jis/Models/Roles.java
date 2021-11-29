package com.judiciaryinfo.jis.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Roles {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer role_id;
    @Column(nullable = false, length= 45)
    private String name;
    
    public Roles(){

    }
    public Roles(Integer role_id){
        this.role_id = role_id;
    }
    public Roles(String name){
        this.name = name;
    }
    public Integer getId(){
        return role_id;
    }
    public void setId(Integer role_id){
        this.role_id = role_id;
    }
    public String getName(){
        return name;
    }
    public void setName( String name){
        this.name = name;
    }
}
