package com.azuredemo.springazuredemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/home")
    public String home()
    {
        return "Hi!! you are getting this message form Azure cloud platform. welcome to azure cloud first time";
    }
}
