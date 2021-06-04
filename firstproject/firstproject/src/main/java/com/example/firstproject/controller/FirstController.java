package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username","솝솝");
        return "greetings"; //templates/greetings.mustache -> 브라우저로 전송!
    }

    @GetMapping("/bye")
    public String SeeYouNext(Model model){
        model.addAttribute("nickname", "이솝");
        return "goodbye";
    }
}
