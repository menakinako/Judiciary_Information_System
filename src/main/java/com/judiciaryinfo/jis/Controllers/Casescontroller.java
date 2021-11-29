package com.judiciaryinfo.jis.Controllers;

import java.util.List;

import com.judiciaryinfo.jis.Models.Ongoing;
import com.judiciaryinfo.jis.Models.Pastcases;
import com.judiciaryinfo.jis.Models.Upcoming;
import com.judiciaryinfo.jis.Repositories.Ongoingcasesrepository;
import com.judiciaryinfo.jis.Repositories.Pastrepository;
import com.judiciaryinfo.jis.Repositories.Upcomingcaserepository;
import com.judiciaryinfo.jis.Services.Pastservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Casescontroller {

    @Autowired
    Upcomingcaserepository uprepo;

    @Autowired
    Pastrepository prepo;

    @Autowired
    Ongoingcasesrepository orepo;

    @Autowired
    Pastservice pservice;


    @GetMapping("/upcoming.html")
    public String viewupcomingcasePage( Model model){

        List<Upcoming> listUpcomingcases = uprepo.findAll();
        model.addAttribute("listUpcomingcases", listUpcomingcases);
        return "upcoming";
    }
    
    @PostMapping("/addnew1")
    public String saveupcomingcases(Upcoming upcoming){
        System.out.println("what happen");
        uprepo.save(upcoming);
        return "redirect:/index.html";
    }

    @RequestMapping("/past.html")
    public String viewpastcasePage( Model model,
                  @Param("keyword") String keyword){
       
        List<Pastcases> listPastcases = pservice.listAll(keyword);
        model.addAttribute("listPastcases", listPastcases);
        model.addAttribute("keyword", keyword);
        return "past";
    }
    
    @PostMapping("/addnew2")
    public String savepastcases(Pastcases pastcases){
        System.out.println("what happen");
        prepo.save(pastcases);
        return "redirect:/index.html";
    }
    @GetMapping("/ongoing.html")
    public String viewongoingcasePage( Model model){

        List<Ongoing> listOngoingcases = orepo.findAll();
        model.addAttribute("listOngoingcases", listOngoingcases);
        return "ongoing";
    }
    
    @PostMapping("/addnew3")
    public String saveongoingcases(Ongoing ongoing){
        System.out.println("what happen");
        orepo.save(ongoing);
        return "redirect:/index.html";
    }
   
}
