package com.spring.springjokesapp.controller;

import com.spring.springjokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService service;

    public JokesController(JokesService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String showJokes(Model model){
         model.addAttribute("joke", service.getJoke());
         return "index";
    }
}
