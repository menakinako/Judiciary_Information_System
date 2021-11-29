package com.judiciaryinfo.jis.Models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length= 45)
    private String fullname;
    @Column(nullable = false, unique = true, length= 45)
    private String email;
    @Column(nullable = false, length= 64)
    private String password;
    
    @ManyToOne
    @JoinColumn(name = "roles_id")
    private Roles role;
    
    
    
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getFullName(){
        return fullname;
    }
    public void setFullName( String fullname){
        this.fullname = fullname;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail( String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword( String password){
        this.password = password;
    }

    public Roles getRole(){
        return role;
    }
    public void setRole(Roles role){
        this.role = role;
    }

}
