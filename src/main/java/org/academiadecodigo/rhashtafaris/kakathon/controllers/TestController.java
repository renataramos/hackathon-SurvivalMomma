package org.academiadecodigo.rhashtafaris.kakathon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @GetMapping("/")
    public ModelAndView test (){
        return new ModelAndView("test");
    }
}
