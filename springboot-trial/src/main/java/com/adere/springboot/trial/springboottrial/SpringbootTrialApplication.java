package com.adere.springboot.trial.springboottrial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringbootTrialApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootTrialApplication.class, args);
	}

	@Profile("prod")
	@Bean
	public String getDummy() {
		return "dummy";
	}
}
