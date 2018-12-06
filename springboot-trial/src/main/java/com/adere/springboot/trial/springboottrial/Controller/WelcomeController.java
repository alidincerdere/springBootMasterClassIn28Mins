package com.adere.springboot.trial.springboottrial.Controller;

import com.adere.springboot.trial.springboottrial.Configuration.BasicConfiguration;
import com.adere.springboot.trial.springboottrial.Model.TokenReq;
import com.adere.springboot.trial.springboottrial.Service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by adere on 2.11.2018.
 */
@RestController
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;

    @Autowired
    BasicConfiguration configuration;

    @RequestMapping(value = "/welcome")
    public String welcomeHandler() {
        return welcomeService.retrieveWelcomeMessage();
    }

    @RequestMapping(value = "/dynamic-configuration")
    public Map dynamicConfiguration() {

        Map map = new HashMap();

        map.put("message", configuration.getMessage());
        map.put("number", configuration.getNumber());
        map.put("key", configuration.isValue());

        return map;
    }

    @RequestMapping(value = "/oauth/v2/tokens", method = RequestMethod.POST)
    public String tokenHandler(@RequestBody TokenReq newQuestion) {
        return welcomeService.retrieveToken();
    }
}
