package com.judiciaryinfo.jis.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="past_cases")
public class Pastcases {

    @Id
    @Column(unique = true)
    private Integer cid;
    @Column(name = "casetype",length= 45)
    private String pcasetype;
    @Column(name = "casename", length= 1000)
    private String pcasename;
    @Column 
    private String summary;
    @Column 
    private String section;
    @Column(name = "pfilingdate")
    private Date pfilingdate;
    @Column(name = "presidingjudge", length= 100)
    private String presidingjudge;

    
    
    public Integer getCid(){
        return cid;
    }
    public void setCid(Integer cid){
        this.cid = cid;
    }
    public String getPcasetype(){
        return pcasetype;
    }
    public void setPcasetype( String pcasetype){
        this.pcasetype = pcasetype;
    }
    public String getPcaseName(){
        return pcasename;
    }
    public void setPcaseName( String pcasename){
        this.pcasename = pcasename;
    }
    public String getSummary(){
        return summary;
    }
    public void setSummary( String summary){
        this.summary = summary;
    }
    public String getSection(){
        return section;
    }
    public void setSection( String section){
        this.section = section;
    }
    
    public Date getPfilingdate(){
        return pfilingdate;
    }
    public void setPfilingdate( Date pfilingdate){
        this.pfilingdate = pfilingdate;
    }
    public String getPresidingjudge(){
        return presidingjudge;
    }
    public void setPresidingjudge( String presidingjudge){
        this.presidingjudge = presidingjudge;
    }
    

    
    
}
