package com.adere.springboot.trial.springboottrial.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * Created by adere on 5.11.2018.
 */
@Component
public class UserCommandLineRunner implements CommandLineRunner{


    private static final Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("user commandline runner");

        repository.save(new User("ali","User"));
        repository.save(new User("zeynep", "Admin"));
        repository.save(new User("selma", "Admin"));

        for(User user: repository.findAll()) {
            log.info(user.toString());
        }

    }
}
