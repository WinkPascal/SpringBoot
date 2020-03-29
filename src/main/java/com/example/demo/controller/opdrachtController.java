package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
public class opdrachtController{

    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    public String forceerWelcome(@RequestParam("name") String valueOne){
        System.out.println(valueOne);
        return "welcome "+valueOne;
    }

    @RequestMapping(value = "/current-date", method = RequestMethod.GET)
    public String getCurrentDate(){
        Date date = new Date();
        return "de huidige datum is: "+date;
    }
}

