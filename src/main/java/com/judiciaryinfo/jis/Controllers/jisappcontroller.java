package com.judiciaryinfo.jis.Controllers;


import java.util.List;



import com.judiciaryinfo.jis.Models.CustomerUserDetails;
import com.judiciaryinfo.jis.Models.Ongoing;
import com.judiciaryinfo.jis.Models.Pastcases;
import com.judiciaryinfo.jis.Models.Roles;
import com.judiciaryinfo.jis.Models.Upcoming;
import com.judiciaryinfo.jis.Models.Users;
import com.judiciaryinfo.jis.Repositories.Rolerepository;

import com.judiciaryinfo.jis.Repositories.Userrepository;
import com.judiciaryinfo.jis.Services.Userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class jisappcontroller {

    @Autowired
    Userservice service;

    @Autowired
    Rolerepository rolerepo;

    @Autowired
    Userrepository repo;

   

    
    @GetMapping("/index.html")
    public String viewHomePage(@AuthenticationPrincipal CustomerUserDetails user, Model model){
        model.addAttribute("user", user);
        
        model.addAttribute("upcoming", new Upcoming());
        
        model.addAttribute("pastcases", new Pastcases());

        model.addAttribute("ongoing", new Ongoing());
        return"index";
    }
    @RequestMapping(value = "/login.html", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");

            List<Roles> listRoles = rolerepo.findAll();
            model.addAttribute("user", new Users());
            model.addAttribute("listRoles", listRoles);    

        return "/login.html";
    }


    @PostMapping("/signup")
    public String processRegistration(@ModelAttribute(name = "user")Users user){
  
       service.registeruser(user);
       
       return "redirect:/login.html";
    }

    @GetMapping("/lawyers_and_judges.html")
    public String showjudgeslawyerlist(Model model){
 
        List<Users> listUsers = repo.findAll();
        model.addAttribute("listUsers", listUsers);

        return "lawyers_and_judges.html";
    }

    @RequestMapping("/delete/{id}")
    public String deleteuser(@PathVariable("id") Integer id){

        service.removeuser(id);
        System.out.println( "The book has been remove from Mybooks");
        return "redirect:/lawyers_and_judges.html";

    }
    @GetMapping("/jlleave.html")
    public String showjudgeslawyerleavelist(){
       return "jlleave.html";
    }
    @GetMapping("/judgeslibrary.html")
    public String showjudgeslibrary(){
       return "judgeslibrary.html";
    }
    @GetMapping("/calender.html")
    public String showcalender(){
       return "calender.html";
    }
    @GetMapping("/circular.html")
    public String showcicular(){
       return "circular.html";
    }
    @GetMapping("/notification.html")
    public String shownotification(){
       return "notification.html";
    }

}
