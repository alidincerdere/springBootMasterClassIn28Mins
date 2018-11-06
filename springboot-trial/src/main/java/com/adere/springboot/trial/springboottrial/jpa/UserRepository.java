package com.adere.springboot.trial.springboottrial.jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by adere on 5.11.2018.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByRole(String role);
}
