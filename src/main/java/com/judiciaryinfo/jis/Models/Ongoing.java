package com.judiciaryinfo.jis.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ongoing")
public class Ongoing {
    
    @Id
    @Column(name ="cin")
    private Integer ciz;
    @Column(name = "casename", length= 1000)
    private String oncasename;
    @Column(name="casestatus")
    private String status;
    @Column(nullable =true, name = "newhearingdate")
    private String newdate;
    
    
    
    public Integer getCiz(){
        return ciz;
    }
    public void setCiz(Integer ciz){
        this.ciz = ciz;
    }
    public String getOncaseName(){
        return oncasename;
    }
    public void setOncaseName( String oncasename){
        this.oncasename = oncasename;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus( String status){
        this.status = status;
    }
    public String getNewdate(){
        return newdate;
    }
    public void setNewdate( String newdate){
        this.newdate = newdate;
    }
}
