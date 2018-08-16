package com.truenorth.dns.com.truenorth.dns.passwords;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
@RequestMapping(value = "/domain")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String getDomain(){

        return "domain-form";
    }

    @RequestMapping(value = "/score")
    public String getScore(@RequestParam String domainName, Model model){



        return "process-form";
    }
}
