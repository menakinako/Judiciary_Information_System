package com.judiciaryinfo.jis.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "upcoming_cases")
public class Upcoming {
    @Id
    @Column(unique = true)
    private Integer cin;
    @Column(length= 45)
    private String casetype;
    @Column(length= 1000)
    private String casename;
    @Column
    private Date filingdate;
    @Column
    private Date hearingdate;

    
    
    public Integer getCin(){
        return cin;
    }
    public void setCin(Integer cin){
        this.cin = cin;
    }
    public String getCasetype(){
        return casetype;
    }
    public void setCasetype( String casetype){
        this.casetype = casetype;
    }
    public String getCaseName(){
        return casename;
    }
    public void setCaseName( String casename){
        this.casename = casename;
    }
    public Date getFilingdate(){
        return filingdate;
    }
    public void setFilingdate( Date filingdate){
        this.filingdate = filingdate;
    }

    public Date getHearingdate(){
        return hearingdate;
    }
    public void setHearingdate( Date hearingdate){
        this.hearingdate = hearingdate;
    }

    
}
