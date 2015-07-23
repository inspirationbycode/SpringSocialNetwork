package com.dashaspivak.socialnetwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RouteController {
    @RequestMapping(value = "/account/{pageName}", method = RequestMethod.GET)
    public String showAccountPage(Model model,@PathVariable String pageName){
        return "account/" +  pageName;
    }

    @RequestMapping(value = "/general/{pageName}", method = RequestMethod.GET)
    public String showGeneralPage(Model model,@PathVariable String pageName){
        return "general/" + pageName;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showGeneralPage(){
        return "index";
    }
}
