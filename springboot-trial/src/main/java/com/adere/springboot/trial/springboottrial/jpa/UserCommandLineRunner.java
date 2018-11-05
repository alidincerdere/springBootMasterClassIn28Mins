package com.adere.springboot.trial.springboottrial.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by adere on 5.11.2018.
 */
@Component
public class UserCommandLineRunner implements CommandLineRunner{
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("user commandline runner");
    }
}
