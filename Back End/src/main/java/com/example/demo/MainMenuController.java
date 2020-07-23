package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainMenuController {

    @RequestMapping("/home")
    public static String homePage(){
        return "This bitch is working";
    }
}
