package com.example.findhousing.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
@Log4j2
public class FindHousingController {

    @GetMapping({"/","/list", "/sidebar"})
    public String list(){

        log.info("list...");

        return "/main/sidebar";
    }
}
