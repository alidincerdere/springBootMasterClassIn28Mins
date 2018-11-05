package com.adere.springboot.trial.springboottrial.jpa;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by adere on 5.11.2018.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
