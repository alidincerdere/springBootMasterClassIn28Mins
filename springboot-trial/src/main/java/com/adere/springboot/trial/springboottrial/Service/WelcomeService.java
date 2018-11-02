package com.adere.springboot.trial.springboottrial.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by adere on 2.11.2018.
 */
@Service
public class WelcomeService {

    public String retrieveWelcomeMessage() {
        return "Good Morning";
    }
}
