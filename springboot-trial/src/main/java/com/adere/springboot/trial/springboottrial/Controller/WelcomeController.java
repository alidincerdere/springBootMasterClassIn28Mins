package com.adere.springboot.trial.springboottrial.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by adere on 2.11.2018.
 */
@RestController
public class WelcomeController {

    @RequestMapping(value = "welcome")
    public String welcomeHandler() {
        return "Hello";
    }
}
