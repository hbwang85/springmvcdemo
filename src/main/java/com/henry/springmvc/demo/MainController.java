package com.henry.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
    	System.out.println("==============================**************************");
        return "index";
    }
    
    @RequestMapping(value="hello", method=RequestMethod.GET)
    public String hello() {
    	return "hello";
    }


}

