package com.adere.springboot.trial.springboottrial.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by adere on 2.11.2018.
 */
@Service
public class WelcomeService {


    @Value("${welcome.message}")
    private String welcomeMessage;

    public String retrieveWelcomeMessage() {
        return welcomeMessage;
    }
}
