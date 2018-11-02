package com.adere.springboot.trial.springboottrial.Controller;

import com.adere.springboot.trial.springboottrial.Service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by adere on 2.11.2018.
 */
@RestController
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;

    @RequestMapping(value = "welcome")
    public String welcomeHandler() {
        return welcomeService.retrieveWelcomeMessage();
    }
}
