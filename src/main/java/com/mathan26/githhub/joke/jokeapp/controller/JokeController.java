package com.mathan26.githhub.joke.jokeapp.controller;

import com.mathan26.githhub.joke.jokeapp.services.Jokeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    Jokeservice jokeservice;

    @Autowired
    public JokeController(Jokeservice jokeservice) {
        this.jokeservice = jokeservice;
    }
    @RequestMapping({"/", ""})
    public  String showJoke(Model model){
        model.addAttribute("joke",jokeservice.getJoke());
        return  "chucknorris";
    }
}
