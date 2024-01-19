package com.example.foodapi.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class tmpController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
