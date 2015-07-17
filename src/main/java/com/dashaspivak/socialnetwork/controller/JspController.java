package com.dashaspivak.socialnetwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JspController {
    @RequestMapping(value = "/page/{pageName}", method = RequestMethod.GET)
    public String showPage(Model model,@PathVariable String pageName){
        if(pageName.equalsIgnoreCase("Rules"))
            return "Rules";
        if(pageName.equalsIgnoreCase("AboutSite"))
            return "About_Site";
        if(pageName.equalsIgnoreCase("SingUp"))
            return "SingUp";
        if(pageName.equalsIgnoreCase("Registration"))
            return "register";
        return "index";
    }
}
