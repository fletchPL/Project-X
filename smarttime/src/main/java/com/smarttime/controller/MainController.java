package com.smarttime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by michal.berentowicz on 23.05.2017.
 */
@Controller
public class MainController {
    @RequestMapping("/")
    public String test(){
        return "index";
    }
}
